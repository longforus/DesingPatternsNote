package com.longforus.command

/**
 * Created by XQ Yang on 2017/8/30  18:45.
 * Description :
 */
class LightOnCommand(var light:Light) :Command {
    override fun undo() {//命令模式的撤销操作就是做执行操作的反动作
        light.off()
    }

    override fun execute() {//执行具体的命令  执行命令的具体是谁,执行了什么命令,发送命令者是不知道,不关心的
        light.on()
    }
}