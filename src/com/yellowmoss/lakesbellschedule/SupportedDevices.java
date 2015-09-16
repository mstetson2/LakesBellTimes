package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.app.Activity;
//import android.content.res.Resources;
//import android.os.Build;

//import android.view.Menu;

public class SupportedDevices extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_supported_devices);
		
		//String Device_Check=Build.MODEL;
		
		//Device_Check += "\n OS Version: " + System.getProperty("os.version") + "(" + android.os.Build.VERSION.INCREMENTAL + ")";
		//Device += "\n OS API Level: " + android.os.Build.VERSION.SDK;
		//Device_Check += "\n Device: " + android.os.Build.DEVICE;
		//Device_Check += "\n Model (and Product): " + android.os.Build.MODEL + " ("+ android.os.Build.PRODUCT + ")";		
	
		/**Resources res = getResources();
		String Device = String.format(
		    res.getString(R.string.current_device),
		   Device_Check);
		  
		*/
	}


	
	/**
	 * @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the
	 *           menu; this adds items to the action bar if it is present.
	 *           getMenuInflater().inflate(R.menu.supported_devices, menu);
	 *           return true; }
	 */
}
