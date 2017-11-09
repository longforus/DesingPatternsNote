package com.longforus.composite

/**
 * Created by XQ Yang on 2017/11/1  20:21.
 * Description :
 */
class GooseFactory(val ggjxj: Guaguajiaoxuejia) :GooseAbstractFactory{
    override fun getGoose(): Quackable{
        val gooseAdapter = GooseAdapter(Goose())
        gooseAdapter.register(ggjxj)
        return gooseAdapter
    }
}