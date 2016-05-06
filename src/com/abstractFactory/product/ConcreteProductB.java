package com.abstractFactory.product;

/**
 * 具体产品B
 * @author hxjxiaojun
 * @time 2016-5-3
 */
public class ConcreteProductB extends AbstractProductB{

	@Override
	public Float weight() {
		Float weight = 1.2f;
		return weight;
	}

	@Override
	public String name() {
		String remark = "我是产品B";
		return remark;
	}

}
