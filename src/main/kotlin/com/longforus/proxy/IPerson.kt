package com.longforus.proxy

/**
 * Created by XQ Yang on 2017/10/16  19:10.
 * Description :
 */
interface IPerson {
    var name:String
    var rating:Int
    var ratingCount:Int
    var gender:String
    fun setHotOrNot( rating:Int)
}