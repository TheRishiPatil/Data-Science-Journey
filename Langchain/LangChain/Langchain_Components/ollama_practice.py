import os
import streamlit as st
from dotenv import load_dotenv
from langchain_community.llms import Ollama
from langchain_core.prompts import ChatPromptTemplate
from langchain_core.output_parsers import StrOutputParser

load_dotenv()

# used for LangSmith tracking
os.environ['LANGCHAIN_API_KEY'] = os.getenv('LANGCHAIN_API_KEY')
os.environ['LANGCHAIN_TRACING_V2'] = 'true'
os.environ['LANGCHAIN_PROJECT'] = os.getenv('LANGCHAIN_PROJECT')


# Prompt Template
prompt = ChatPromptTemplate.from_messages(
    [
        ("system", "Please gossip with user about his one piece theory."),
        ("user", "theory:{theory}")
    ]
)

#Streamlit Framework
st.title("Langchain Demo with LLama3")
input_text = st.text_input("What One Piece theory you have?")

#Ollama LLama3 model
llm = Ollama(model = "llama3")
output_parser = StrOutputParser()

chain = prompt | llm | output_parser

if input_text:
    st.write(chain.invoke({"theory" : input_text}))