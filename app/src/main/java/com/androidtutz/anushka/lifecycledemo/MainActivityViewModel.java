package com.androidtutz.anushka.lifecycledemo;

import android.arch.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int clickCount = 0;

    public int getInitialCount() {

        return clickCount;
    }

    public int getCurrentCount() {

        clickCount += 1;
        return clickCount;
    }
}
