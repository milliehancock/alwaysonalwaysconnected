package com.example.testingapp;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button myButton;
	TextView myTextView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

  
    
}
