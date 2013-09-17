package com.gray.gwizdz.example.droidstrap;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends Activity {

	WebView myWebView;
    
    /** Called when the activity is first created. */
	@Override
	@SuppressLint("SetJavaScriptEnabled")
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        myWebView = (WebView)this.findViewById(R.id.myWebView);
        myWebView.setWebChromeClient(new WebChromeClient());
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("file:///android_asset/index.html");
        myWebView.addJavascriptInterface(new JavascriptHandler(this), "JavascriptHandler");
    }
    
    /** Method called by JavascriptHandler */
    public void activityToast(String msg){
    	Log.d("mylog","MainActivity.activityToast is called : " + msg);
		Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
	}
    
    /** Method called by JavascriptHandler */
    public void activityIntent() {
    	Log.d("mylog","MainActivity.activityIntent is called.");
    	Intent i = new Intent(this, PreferenceExample.class);
        startActivity(i);
    }
}
