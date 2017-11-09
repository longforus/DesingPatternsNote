package com.longforus.command

/**
 * Created by XQ Yang on 2017/8/30  18:49.
 * Description :
 */
class RemoteControl {
    var slot:Command?  = null//持有命令对象

    fun onPressed(){//发出命令
        slot?.execute()
    }

    fun onRepeal() {
        slot?.undo()
    }
}