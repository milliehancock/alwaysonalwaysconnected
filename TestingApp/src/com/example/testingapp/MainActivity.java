package com.example.testingapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	Button myButton;
	TextView myTextView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        myButton = (Button) this.findViewById(R.id.my_button);
        myTextView = (TextView) this.findViewById(R.id.my_textview);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

  
    
}
