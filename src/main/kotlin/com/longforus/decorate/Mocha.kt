package com.longforus.decorate

/**
 * Created by XQ Yang on 2017/7/26  19:14.
 * Description :
 */
class Mocha (beverage: Beverage): DecorateBeverage(beverage){//装饰者实现
  override var classify: String= "可可类"

  override var des: String = "摩卡"

  override var price: Double= 1.0

}

