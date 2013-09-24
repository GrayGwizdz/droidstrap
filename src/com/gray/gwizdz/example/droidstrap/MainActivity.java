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

/** Activity that attaches a {@link JavascriptHandler Javascript interface} to the main WebView. 
*
* @author Gray Gwizdz
* @version 1.0
*/
public class MainActivity extends Activity {

	/** WebView which holds the HTML loaded from asset files. */
	WebView myWebView;
    
	/**
     * Invoked when the Activity is created. Add some clients, enable Javascript, load HTML from assets, and attach a {@link JavascriptHandler Javascript interface}.
     *
     * @param savedInstanceState a Bundle containing state saved from a previous
     *        execution, or null if this is a new execution.
     */
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
    
    /** Called by {@link JavascriptHandler#handlerToast(String) handlerToast} to create a toast. */
    public void activityToast(String msg){
    	Log.d("mylog","MainActivity.activityToast is called : " + msg);
		Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
	}
    
    /** Called by {@link JavascriptHandler#handlerToast(String val) handlerToast} to launch the {@link PreferenceExample PreferenceExample} activity. */
    public void activityIntent() {
    	Log.d("mylog","MainActivity.activityIntent is called.");
    	Intent i = new Intent(this, PreferenceExample.class);
        startActivity(i);
    }
}
