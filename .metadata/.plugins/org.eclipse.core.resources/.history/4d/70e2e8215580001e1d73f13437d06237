package com.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fully qualified class name: ");
		String className = sc.nextLine();
		try {
			Class c = Class.forName(className);
			
			System.out.println("Name: " + c.getName());
			Class superCls = c.getSuperclass();
			if(superCls != null)
				System.out.println("Super Class: " + superCls.getName());
			Class[] intfClasses = c.getInterfaces();
			for(Class cls:intfClasses)
				System.out.println("Super Interface: " + cls.getName());
			
			Field[] fields = c.getDeclaredFields();
			for(Field f : fields)
				System.out.println(f.toString());
		
			Constructor[] ctors = c.getDeclaredConstructors();
			for(Constructor ctor : ctors)
				System.out.println(ctor.toString());
			
			Method[] methods = c.getDeclaredMethods();
			for(Method m : methods)
				System.out.println(m.toString());
			
			Annotation[] anns = c.getDeclaredAnnotations();
			for(Annotation ann : anns)
				System.out.println(ann.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}