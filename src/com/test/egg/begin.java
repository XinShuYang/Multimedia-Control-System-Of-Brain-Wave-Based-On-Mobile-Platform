package com.test.egg;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class begin extends Activity {

	//private Button button;
    @SuppressWarnings("unused")
	private Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.begin);
        Button button = (Button)findViewById(R.id.beginbt1);
        button.setOnClickListener(new BonClickListener());
	}
    
	class BonClickListener implements  OnClickListener{
        	
        		public void onClick(View v){
        			switch(v.getId()) {
        			case R.id.beginbt1:
        			Intent intent=new Intent();
        			intent.setClass(begin.this, lurunaodianbo.class);
        			startActivity(intent);
        			overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
        			break;
        			}               			      			        			
        			
        		  /*Intent intent=new Intent();
        		  intent.setClass(begin.this,lurunaodianbo.class);
        		  startActivity(intent);
        		  begin.this.finish();*/
        		   
        	}
	}
}


