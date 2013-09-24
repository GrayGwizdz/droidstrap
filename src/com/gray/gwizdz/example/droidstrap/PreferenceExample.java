package com.gray.gwizdz.example.droidstrap;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

/** Example Activity that will be launched from the {@link MainActivity MainActivity}.
*
* @author Gray Gwizdz
* @version 1.0
*/
public class PreferenceExample extends PreferenceActivity {
	
	/**
     * Invoked when the Activity is created. Replaces the content of the Activity with the newer PreferenceFragment. 
     *
     * @param savedInstanceState a Bundle containing state saved from a previous
     *        execution, or null if this is a new execution.
     */
	@Override
    protected void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new MyPreferenceFragment()).commit();
    }

    public static class MyPreferenceFragment extends PreferenceFragment
    {
    	/**
         * Invoked when the Fragment is created. 
         *
         * @param savedInstanceState a Bundle containing state saved from a previous
         *        execution, or null if this is a new execution.
         */
        @Override
        public void onCreate(final Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.settings);
        }
    }
}

