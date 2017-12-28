package com.test.egg;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class zhongyuan extends Activity{

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhongyuan);  
        String fontPath = "fonts/NR.ttf";
        TextView tv1 = (TextView) findViewById(R.id.zytv1);
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        tv1.setTypeface(tf);
    }
}
