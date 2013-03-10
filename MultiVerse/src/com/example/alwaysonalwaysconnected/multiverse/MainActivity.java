package com.example.alwaysonalwaysconnected.multiverse;


//These imports from the SMS example

//These imports from the MultiVerse example
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {	

	    Button myButton, textSteveLOL;
	

	//MultiVerse Variables
	public static final String PASSING_DATA = "PASSING";
	public static final String PASSING_BACK = "PASSING_BACK";
	public static final int OTHER_ACTIVITY = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        myButton = (Button) findViewById(R.id.button1);
        myButton.setOnClickListener(this);
        textSteveLOL = (Button) findViewById(R.id.button2);
        textSteveLOL.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    public void onClick(View v) {
 
    //Add functionality for different button clicks
  	switch(v.getId()){
		//Button 1
  		case R.id.button1:
  			Log.v("Main Activity", "button 1 was clicked");
  			Intent i = new Intent(this,OtherActivity.class);
  			//hey, I want to open this other Activity
  			i.putExtra(MainActivity.PASSING_DATA, "Here is the data I am passing");
  			startActivityForResult(i, OTHER_ACTIVITY);
			break;
		
			//Button 2
  		case R.id.button2:
  			Log.v("Main Activity", "button 2 was clicked");
  			//sendit(v);
			break;
  	
		}
    
    
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent dataIntent){
    	super.onActivityResult(requestCode, resultCode, dataIntent);
    	
    	if (requestCode == OTHER_ACTIVITY){
    		if(resultCode == RESULT_OK){
    		
    			if (dataIntent.hasExtra(MainActivity.PASSING_BACK)){
    				String message = dataIntent.getStringExtra(MainActivity.PASSING_BACK);
    				Toast t = Toast.makeText(this, message, Toast.LENGTH_LONG);
        			t.show();
    			}
    		}
    	}

    }
    
}
    
 