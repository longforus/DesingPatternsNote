package com.longforus.composite;

import org.jetbrains.annotations.NotNull;

/**
 * Created by XQ Yang on 2017/11/1  20:05.
 * Description :
 */

class Test implements Quackable {
    public static int count = 0;

    private Quackable mQuackable;

    public Test(Quackable quackable) {
        mQuackable = quackable;
    }

    @Override
    public void quack() {
        mQuackable.quack();
        count++;
    }

    @Override
    public void register(@NotNull Observer observer) {

    }

    @Override
    public void startNotify() {

    }
}
