package com.ryg.chapter_8;

import com.ryg.chapter_8.R;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.IBinder;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

public class DemoActivity_1 extends Activity {
    private static final String TAG = "DemoActivity_1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_1);
        initView();
    }

    private void initView() {
        Dialog dialog = new Dialog(this.getApplicationContext());
        TextView textView = new TextView(this);
        textView.setText("this is toast!");
        dialog.setContentView(textView);
        dialog.getWindow().setType(LayoutParams.TYPE_SYSTEM_ERROR);
        dialog.show();
    }

}
