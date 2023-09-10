package com.ryg.chapter_5;

import com.ryg.chapter_5.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class DemoActivity_1 extends Activity {
    private static final String TAG = "DemoActivity_1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_1);
        initView();
    }

    private void initView() {
        Toast.makeText(this, getIntent().getStringExtra("sid"),
                Toast.LENGTH_SHORT).show();
    }
}
