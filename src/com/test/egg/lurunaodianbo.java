package com.test.egg;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class lurunaodianbo extends Activity {
	    public void onCreate1(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.lurunaodianbo);  
	        String fontPath = "fonts/NR.ttf";
	        TextView tv1 = (TextView) findViewById(R.id.lrndbtv1);
	        TextView tv2 = (TextView) findViewById(R.id.lrndbtv2);
	        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
	        tv1.setTypeface(tf);
	        tv2.setTypeface(tf);
	    }
	    
		private Button button;
	    @SuppressWarnings("unused")
		private Intent intent;
		@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.lurunaodianbo);
	        Button button = (Button)findViewById(R.id.lrndbbt1);
	        button.setOnClickListener(new BonClickListener());
		}
		class BonClickListener implements  OnClickListener{
	        	
			public void onClick(View v){
    			switch(v.getId()) {
    			case R.id.lrndbbt1:
    			Intent intent=new Intent();
    			intent.setClass(lurunaodianbo.this, naodianboluzhi.class);
    			startActivity(intent);
    			overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
    			break;
    			}    
			
			/*public void onClick(View v){
	        		  Intent intent=new Intent();
	        		  intent.setClass(lurunaodianbo.this,naodianboluzhi.class);
	        		  startActivity(intent);
	        		  lurunaodianbo.this.finish();
	        		}*/
	        	}
		}

}
