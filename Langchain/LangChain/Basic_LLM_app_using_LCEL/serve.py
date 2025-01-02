import os
from fastapi import FastAPI
from dotenv import load_dotenv
from langserve import add_routes
from langchain_groq import ChatGroq
from langchain_core.prompts import ChatPromptTemplate
from langchain_core.output_parsers import StrOutputParser

load_dotenv()

groq_api_key = os.getenv("GROQ_API_KEY")
model = ChatGroq(model = "gemma-7b-it", groq_api_key = groq_api_key)

prompt = ChatPromptTemplate.from_messages(
    [
        ("system", "Translate the following from marathi into {language} and return output only:"),
        ("user", "{text}")
    ]
)

parser = StrOutputParser()

chain = prompt | model | parser

app = FastAPI(title = "Langchain Server",
              version = "1.0",
              description = "A simple API server using Langchain runnable interfaces")

# Adding chain Routes
add_routes(
    app,
    chain,
    path = "/chain"
)

if __name__ == "__main__" :
    import uvicorn
    uvicorn.run(app, host = "localhost", port = 8000)