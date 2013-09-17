package com.gray.gwizdz.example.droidstrap;

import android.util.Log;
import android.webkit.JavascriptInterface;

public class JavascriptHandler {
	
	MainActivity parentActivity;
	
    public JavascriptHandler(MainActivity activity)  {
        parentActivity = activity;
    }
    
    /** Method called by android.js */
    @JavascriptInterface
    public void handlerToast(String val){
        Log.d("mylog","JavascriptHandler.handlerToast is called : " + val);
        this.parentActivity.activityToast(val);
    }
    
    /** Method called by android.js */
    @JavascriptInterface
    public void handlerIntent(){
        Log.d("mylog","JavascriptHandler.handlerIntent is called.");
        this.parentActivity.activityIntent();
    }
}
