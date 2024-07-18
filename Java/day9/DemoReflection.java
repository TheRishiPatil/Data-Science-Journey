package day9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DemoReflection {

	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException {
		
		Class c=Class.forName("day9.Book");
		System.out.println(c.getName());
		
		Book b = new Book();
		c=b.getClass();
		System.out.println(c.getName());
		
		Field[] fields=c.getDeclaredFields();
		for(Field field : fields)
		{
			System.out.println(field.getName());
			System.out.println(field.getGenericType());
			if(field.getName().equals("isbn"))
			{
				field.setAccessible(true);
				field.set(b, 312334);
				System.out.println(b);
			}
		}
		
		Constructor<Book> [] cons = c.getDeclaredConstructors();
		for(Constructor<Book> con : cons)
		{
			System.out.println(con.getParameterCount());
			if(con.getParameterCount()==2)
			{
				Book bb = con.newInstance(37464974, "Fgkew");
				System.out.println(bb);
			}
		}
		
		Method [] methods = c.getDeclaredMethods();
		for(Method method : methods)
		{
			System.out.println(method.getName());
			System.out.println(method.getParameterCount());
			if(method.getName().equals("simplePrivateMethod"))
			{
				method.setAccessible(true);
				method.invoke(null);
			}
			
			if(method.getName().equals("simpleStaticMethod"))
			{
				method.setAccessible(true);
				method.invoke(null);
			}
		}
		
		methods = c.getDeclaredMethods();
		for(Method method : methods) 
		{
			if(method.getAnnotation(MyAnno.class)!=null)
			{
				MyAnno anno = method.getDeclaredAnnotation(MyAnno.class);
				if(anno.priority()==1)
				{
					method.invoke(b);
				}
			}
		}
		
		
	}

}
