package com.ryg.chapter_15;

import com.ryg.chapter_15.R;
import com.ryg.chapter_15.manager.TestManager;
import com.ryg.chapter_15.manager.TestManager.OnDataArrivedListener;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements OnDataArrivedListener {
    private static final String TAG = "MainActivity";

    private static Context sContext;
    private static View sView;

    private Button mButton;

    @SuppressLint("NewApi")
    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sContext = this;
//        sView = new View(this);

//        mButton = (Button) findViewById(R.id.button1);
//        TestManager.getInstance().registerListener(this);
//        ObjectAnimator animator = ObjectAnimator.ofFloat(mButton, "rotation",
//                0, 360).setDuration(2000);
//        animator.setRepeatCount(ValueAnimator.INFINITE);
//        animator.start();
//        //animator.cancel();

//        SystemClock.sleep(30 * 1000);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                testANR();
//            }
//        }).start();
//        SystemClock.sleep(10);
//        initView();
    }

    private synchronized void testANR() {
        SystemClock.sleep(30 * 1000);
    }

    private synchronized void initView() {

    }

    @Override
    public void onDataArrived(Object data) {
        Log.i(TAG, data.toString());
    }

}
