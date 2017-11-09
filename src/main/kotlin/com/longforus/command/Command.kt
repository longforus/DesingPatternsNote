package com.longforus.command

/**
 * Created by XQ Yang on 2017/8/28  19:37.
 * Description :
 */
interface Command   {
    fun execute()
    fun undo()
}