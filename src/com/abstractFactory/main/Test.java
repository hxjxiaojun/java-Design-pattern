package com.abstractFactory.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.abstractFactory.product.AbstractProductA;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class<?> cls =  Class.forName("com.factory.ConcreteFactory1");
		Object o =  cls.newInstance();
		
		
		//具体生产产品
		Method getMethod = cls.getMethod("createProductA");
		AbstractProductA project = (AbstractProductA) getMethod.invoke(o);
		
		System.out.println(project.remark());
	}
}
