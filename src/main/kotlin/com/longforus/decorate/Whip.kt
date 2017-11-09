package com.longforus.decorate

/**
 * Created by XQ Yang on 2017/7/26  19:26.
 * Description :
 */
class Whip(beverage: Beverage) : DecorateBeverage(beverage) {
  override var classify: String= "奶类"

  override var des: String = "奶泡"

  override var price: Double = 1.5
}