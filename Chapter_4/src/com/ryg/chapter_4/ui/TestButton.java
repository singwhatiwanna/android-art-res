package com.ryg.chapter_4.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class TestButton extends TextView {
    private static final String TAG = "TestButton";


    public TestButton(Context context) {
        this(context, null);
    }

    public TestButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TestButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

}
