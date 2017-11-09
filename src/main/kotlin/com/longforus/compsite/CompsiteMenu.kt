package com.longforus.compsite

/**
 * Created by XQ Yang on 2017/9/21  19:38.
 * Description :
 */
interface CompsiteMenu<T>:Iterator<T>  {
    var subMenu:CompsiteMenu<T>?
}