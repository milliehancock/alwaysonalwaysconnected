package com.example.testingapp;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	//Variables
	Button myButton, myButton2;
	TextView myTextView;
	EditText myEditText;
	
	
    @Override
    //When the app starts, create all of this stuff...
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        //Buttons... better way to handle all of this?
        myButton = (Button) this.findViewById(R.id.my_button);
        myButton2 = (Button) this.findViewById(R.id.my_button2);
        myButton.setOnClickListener(this);
        myButton2.setOnClickListener(this);
        
        //Text
        myTextView = (TextView) this.findViewById(R.id.my_textview);
        myEditText = (EditText) this.findViewById(R.id.editText1);
    }

 
    //Different methods for saving, resuming, and destroying based on user input
    @Override
	protected void onSaveInstanceState (Bundle outState) {
		outState.putString("editText1", myEditText.getText().toString());
		Log.v("MainActivity", "editText1:" + myEditText.getText().toString());
	}
    
    @Override
	protected void onResume() {
		super.onResume();
		myTextView.setText("Initial State");
	}
    
    
    @Override
	protected void onDestroy() {
		myTextView = null;
		Log.v("MainActivity", "onDestroy Called");
		super.onDestroy();
	}
	
    
    @Override
	public void onClick(View clickedView) {
		
    	//Add functionality for different button clicks
    	switch(clickedView.getId()){
		//Button 1
    	case R.id.my_button:
			if (myTextView.getVisibility() == View.VISIBLE){
			myTextView.setVisibility(View.INVISIBLE);
			}else{
				myTextView.setVisibility(View.VISIBLE);
			}
			break;
		//Button 2
    	case R.id.my_button2:
			setContentView(R.layout.activity_main_2);
			break;
    	
		}
	}

  
    
}
