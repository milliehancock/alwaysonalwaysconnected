package com.example.sendsms;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SendSMSActivity extends Activity {
	SendSMS mSender = new SendSMS();
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void sendit(View v) {
    	boolean success = mSender.sendSMSMessage("647-000-0000",
    		// This is standard lorem-ipsum text, do not bother
    		// trying to wrap it, there's about 500 characters...
    		"OH YEAH"
    		);
    	Toast.makeText(this, "Message sent " + (
    		success ? "successfully" : "unsuccessfully"), 
    		Toast.LENGTH_SHORT).show();
    }
}
