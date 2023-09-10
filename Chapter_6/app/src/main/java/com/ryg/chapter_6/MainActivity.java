package com.ryg.chapter_6;

import com.ryg.chapter_6.R;
import com.ryg.chapter_6.ui.CustomDrawable;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.test_size);
        Drawable drawable = textView.getBackground();
        Log.e(TAG, "bg:" + drawable + "w:" + drawable.getIntrinsicWidth()
                + " h:" + drawable.getIntrinsicHeight());
    }

    public void onButtonClick(View v) {
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            // test transition
            View v = findViewById(R.id.test_transition);
            TransitionDrawable drawable = (TransitionDrawable) v.getBackground();
            drawable.startTransition(1000);

            // test scale
            View testScale = findViewById(R.id.test_scale);
            ScaleDrawable testScaleDrawable = (ScaleDrawable) testScale.getBackground();
            testScaleDrawable.setLevel(10);

            // test clip
            ImageView testClip = (ImageView) findViewById(R.id.test_clip);
            ClipDrawable testClipDrawable = (ClipDrawable) testClip.getDrawable();
            testClipDrawable.setLevel(8000);
            
            // test custom drawable
            View testCustomDrawable = findViewById(R.id.test_custom_drawable);
            CustomDrawable customDrawable = new CustomDrawable(Color.parseColor("#0ac39e"));
            testCustomDrawable.setBackgroundDrawable(customDrawable);
        }
    }
}
