package com.gray.gwizdz.example.droidstrap;

import android.util.Log;
import android.webkit.JavascriptInterface;

/** Basic handler demonstrating interaction between Javascript in a {@link MainActivity#myWebView WebView} and the {@link MainActivity Activity} that holds it.
*
* @author Gray Gwizdz
* @version 1.0
*/
public class JavascriptHandler {
	
	MainActivity parentActivity;
	
	/** Constructor where reference to the parent {@link MainActivity MainActivity} is passed in.
	*
	* @param activity The parent activity holding the {@link MainActivity#myWebView WebView} that interacts with this handler.
	*/
    public JavascriptHandler(MainActivity activity)  {
        parentActivity = activity;
    }
    
    /** Method called by android.js, which simply passes the string to the {@link MainActivity#activityToast(String) activityToast} method to be toasted.
     * 
     * @param val A string to be passed onto the {@link MainActivity MainActivity} to be toasted.
     */
    @JavascriptInterface
    public void handlerToast(String val){
        Log.d("mylog","JavascriptHandler.handlerToast is called : " + val);
        this.parentActivity.activityToast(val);
    }
    
    /** Method called by android.js, which launches the {@link PreferenceExample PreferenceExample} activity from the {@link MainActivity MainActivity} activity. 
     */
    @JavascriptInterface
    public void handlerIntent(){
        Log.d("mylog","JavascriptHandler.handlerIntent is called.");
        this.parentActivity.activityIntent();
    }
}
