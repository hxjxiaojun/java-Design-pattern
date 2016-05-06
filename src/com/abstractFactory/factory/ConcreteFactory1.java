package com.abstractFactory.factory;

import com.abstractFactory.product.AbstractProductA;
import com.abstractFactory.product.AbstractProductB;
import com.abstractFactory.product.ConcreteProductA;
import com.abstractFactory.product.ConcreteProductB;

/**
 * 具体工厂
 * 
 * @author hxjxiaojun
 * @time 2016-5-3
 */
public class ConcreteFactory1 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB();
	}
}
