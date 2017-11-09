package com.longforus.decorate

/**
 * Created by XQ Yang on 2017/7/26  19:15.
 * Description :
 */
abstract class DecorateBeverage(var beverage: Beverage?) : Beverage() {//装饰者接口和被装饰者实现相同的接口,并持有被装饰者的引用
  abstract var classify:String
  override fun cost(): Double {
    println(this)
    return price + if (beverage==null) 0.0 else (beverage as Beverage).cost()
  }

  override var size: Size= Size.MID

  override fun toString(): String {
    return super.toString()+"  种类 : $classify"
  }
}