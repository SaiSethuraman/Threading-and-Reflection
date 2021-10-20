package com.poctoday;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	
	public static void main(String[] args) throws Exception {
		
		Display obj = new Display();     //Creating an object for which the property is gonna be checked
		
		Class<? extends Display> classobj = obj.getClass();                // creating class object from the object using getClass()
		System.out.println("The name of the class is " + classobj.getName());
		
		Constructor<? extends Display> constructor = classobj.getConstructor();          //getting the constructor of the class throught the object of the class
		System.out.println("The name of the Constructor is " + constructor.getName());
		
		System.out.println("\n The Methods of the class are : ");         //getting methods in the class using object of the class by getMethods()
		
		
		Method[] marray = classobj.getMethods();
		
		//looping to get the methods present
		
		for(Method method : marray) {
			
			System.out.println(method.getName());
			
		}
		
		Method obj2 = classobj.getDeclaredMethod("meth2", int.class);  //by providing the method name and parameter class as arguments, creates object of desired method, to the getDeclaredMethod()
		
		obj2.invoke(obj, 20);  //invoking the method at run time
		
		Field field = classobj.getDeclaredField("str");  //by providing the field name as arguments, creates object of desired field, to the getDeclaredField()
		
		field.setAccessible(true);  // Irrespective of the access specifier the field can be accessed by the object
		
		field.set(obj, "Perficient");  //new value is set
		
		Method obj1 = classobj.getDeclaredMethod("meth1"); //by providing the method name as arguments, creates object of desired method, to the getDeclaredMethod()
		
		obj1.invoke(obj);
		
		Method obj3 = classobj.getDeclaredMethod("meth3");
		
		obj3.setAccessible(true);
		
		obj3.invoke(obj);
		
		
		
	}

}
