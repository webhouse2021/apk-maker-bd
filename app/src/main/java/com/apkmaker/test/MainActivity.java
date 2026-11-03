package com.apkmaker.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("APK Maker BD\n\nAndroid Build Test Successful!");
        text.setTextSize(22);
        text.setGravity(Gravity.CENTER);

        setContentView(text);
    }
}