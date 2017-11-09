package com.longforus.compsite

/**
 * Created by XQ Yang on 2017/9/21  19:43.
 * Description :
 */
class CompsiteMenuImpl(var array: Array<String>?, override var subMenu: CompsiteMenu<String>?) :CompsiteMenu<String>{
    var index = -1
    override fun hasNext(): Boolean {
        if (array == null) {
            return false
        } else {
            return index+1<= array!!.size-1&&!array?.get(index+1)?.isEmpty()!!
        }
    }
    override fun next(): String {
        if (array == null) {
            return ""
        }
        return array?.get(++index)!!
    }
}