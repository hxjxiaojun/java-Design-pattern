package com.abstractFactory.product;

/**
 * 具体产品A
 * @author hxjxiaojun
 * @time 2016-5-3
 */
public class ConcreteProductA  extends AbstractProductA{

	@Override
	public String remark() {
		String remark = "我是产品A";
		return remark;
	}

	@Override
	public Float price() {
		Float price = 1.2f;
		return price;
	}

}
