package com.longforus.decorate

/**
 * Created by XQ Yang on 2017/7/26  19:07.
 * Description :
 */
abstract class Beverage :IBeverage{//装饰接口
  override fun toString(): String {
    return "我是 $des 我的价格是 $price"
  }
}