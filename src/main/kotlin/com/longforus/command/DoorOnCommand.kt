package com.longforus.command

/**
 * Created by XQ Yang on 2017/8/30  18:59.
 * Description :
 */
class DoorOnCommand(val door: Door):Command {
    override fun undo() {
        door.off()
    }

    override fun execute() {
        door.on()
    }
}