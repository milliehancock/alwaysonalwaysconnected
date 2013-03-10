package com.example.alwaysonalwaysconnected.multiverse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OtherActivity extends Activity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_activity);
        
        Intent i = this.getIntent();
        if (i.hasExtra(MainActivity.PASSING_DATA)){
        	String s = i.getStringExtra(MainActivity.PASSING_DATA);
        	Toast t = Toast.makeText(this, s, Toast.LENGTH_SHORT);
        	t.show();
        }
	}
	
        
    public void buttonClicked(View v){
    	Intent passingBack = new Intent();
    	passingBack.putExtra(MainActivity.PASSING_BACK, "Here is your response");
    	setResult(Activity.RESULT_OK, passingBack);
    	finish();
    }
    }
	

