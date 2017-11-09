package com.longforus.decorate

/**
 * Created by XQ Yang on 2017/7/26  19:09.
 * Description :
 */
class DarkRoast(override var size: Size) : Beverage() {//被装饰者

  override fun cost(): Double {
      price = 11.0
      println(this)
      return price
  }

  override var des: String = "深焙咖啡"

    override var price: Double = 10.0
}