package com.longforus.proxy

/**
 * Created by XQ Yang on 2017/10/16  19:11.
 * Description :
 */
class Person(override var name: String, override var gender: String) : IPerson {
    override fun setHotOrNot(rating: Int) {
        this.rating+=rating
        ratingCount++
    }

    override var rating: Int = 0
    override var ratingCount: Int = 0
}