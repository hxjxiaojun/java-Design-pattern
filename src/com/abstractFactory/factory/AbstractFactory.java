package com.abstractFactory.factory;

import com.abstractFactory.product.AbstractProductA;
import com.abstractFactory.product.AbstractProductB;

/**
 * 抽象工厂
 * 
 * @author hxjxiaojun
 * @time 2016-5-3
 * 
 *       抽象工厂模式的基本思想 工厂方法模式通过引入工厂等级结构，解决了简单工厂模式中工厂类职责太重的问题，
 *    但由于工厂方法模式中的每个工厂只生产一类产品，可能会导致系统中存在大量的工厂类，
 *    势必会增加系统的开销。此时，我们可以考虑将一些相关的产品组成一个“产品族”，由同一个工厂来统一生产。
 */

public abstract class AbstractFactory {

	public abstract AbstractProductA createProductA(); // 工厂方法一（生产电视机）

	public abstract AbstractProductB createProductB(); // 工厂方法二（生产冰箱）
}
