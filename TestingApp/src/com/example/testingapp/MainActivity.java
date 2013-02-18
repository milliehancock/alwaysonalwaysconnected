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

	Button myButton;
	Button myButton2;
	TextView myTextView;
	EditText myEditText;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        //Buttons... better way to handle all of this?
        myButton = (Button) this.findViewById(R.id.my_button);
        myButton2= (Button) this.findViewById(R.id.my_button2);
        myButton.setOnClickListener(this);
        myButton2.setOnClickListener(this);
        
        //Text
        myTextView = (TextView) this.findViewById(R.id.my_textview);
        myEditText = (EditText) this.findViewById(R.id.editText1);
    }

    
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
		switch(clickedView.getId()){
		case R.id.myButton:
			myTextView.setText("Clicked");
			break;
		case R.id.myButton2:
			//do stuff
			break;
    	
		}
	}

  
    
}
