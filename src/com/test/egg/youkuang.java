package com.test.egg;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class youkuang extends Activity{
	@SuppressWarnings("unused")
	private Intent intent;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youkuang);  
        String fontPath = "fonts/NR.ttf";
        TextView tv1 = (TextView) findViewById(R.id.yktv1);
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        tv1.setTypeface(tf);
    }

}
