package com.test.egg;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class gongneng extends Activity {
	private Button button;
    @SuppressWarnings("unused")
	private Intent intent;
	 
    public void onCreate1(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.gongneng);  
	        String fontPath = "fonts/NR.ttf";
	        TextView tv1 = (TextView) findViewById(R.id.gntv1);
	        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
	        tv1.setTypeface(tf);
	    }
	 

	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.gongneng);
	        ImageButton button1 = (ImageButton)findViewById(R.id.gnibc);
	        button1.setOnClickListener(new BonClickListener1());
	        ImageButton button2 = (ImageButton)findViewById(R.id.gnibs);
	        button2.setOnClickListener(new BonClickListener2());
	        ImageButton button3 = (ImageButton)findViewById(R.id.gnibx);
	        button3.setOnClickListener(new BonClickListener3());
	        ImageButton button4 = (ImageButton)findViewById(R.id.gnibz);
	        button4.setOnClickListener(new BonClickListener4());
	        ImageButton button5 = (ImageButton)findViewById(R.id.gniby); 
	        button5.setOnClickListener(new BonClickListener5());
		}
	    
		class BonClickListener1 implements  OnClickListener{ 	
	        		public void onClick(View v){
	        			switch(v.getId()) {
	        			case R.id.gnibc:
	        			Intent intent=new Intent();
	        			intent.setClass(gongneng.this, zhongyuan.class);
	        			startActivity(intent);
	        			overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
	        			break;
	        			}               			      			        				   
	        	}
		}
		
		class BonClickListener2 implements  OnClickListener{ 	
    		public void onClick(View v){
    			switch(v.getId()) {
    			case R.id.gnibs:
    			Intent intent=new Intent();
    			intent.setClass(gongneng.this, shangkuang.class);
    			startActivity(intent);
    			overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
    			break;
    			}               			      			        				   
    	}
}
		
		class BonClickListener3 implements  OnClickListener{ 	
    		public void onClick(View v){
    			switch(v.getId()) {
    			case R.id.gnibx:
    			Intent intent=new Intent();
    			intent.setClass(gongneng.this, xiakuang.class);
    			startActivity(intent);
    			overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
    			break;
    			}               			      			        				   
    	}
}

		
		class BonClickListener4 implements  OnClickListener{ 	
    		public void onClick(View v){
    			switch(v.getId()) {
    			case R.id.gnibz:
    			Intent intent=new Intent();
    			intent.setClass(gongneng.this, zuokuang.class);
    			startActivity(intent);
    			overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
    			break;
    			}               			      			        				   
    	}
}
		
		class BonClickListener5 implements  OnClickListener{ 	
    		public void onClick(View v){
    			switch(v.getId()) {
    			case R.id.gniby:
    			Intent intent=new Intent();
    			intent.setClass(gongneng.this, youkuang.class);
    			startActivity(intent);
    			overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
    			break;
    			}               			      			        				   
    	}
}
		

		
}
