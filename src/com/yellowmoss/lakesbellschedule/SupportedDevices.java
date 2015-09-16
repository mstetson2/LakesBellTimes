package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.app.Activity;
import android.os.Build;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build.VERSION_CODES;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

@SuppressWarnings("unused")
public class SupportedDevices extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_supported_devices);

		TextView deviceInfoText = (TextView) findViewById(R.id.deviceinfoTextView);
		
		String device_info = "Info about your device:";
		device_info += "\nOS API Level: " + android.os.Build.VERSION.SDK_INT;
		device_info += "\nCarrier and brand: " + android.os.Build.BRAND + " " + android.os.Build.MANUFACTURER;
		device_info += "\nDevice: " + android.os.Build.DEVICE;
		device_info += "\nModel: " + android.os.Build.MODEL + " (" + android.os.Build.PRODUCT + ")";
		deviceInfoText.setText(device_info);
		
	}

	public void startSendDevice(View view) {
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.setType("message/rfc822");
		emailIntent.putExtra(Intent.EXTRA_EMAIL,
				new String[] { "yellowmossstudios@gmail.com" });
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
				"Device Info: Lakes Bell Ring Schedule App");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, ("This device works!\n\n" +
				"DEVICE INFO:\n" + "\n Software Specs: " + System.getProperty("os.version") + "(" + android.os.Build.VERSION.INCREMENTAL + ")" +
				"\nOS API Level: " + android.os.Build.VERSION.SDK_INT +
				"\nCarrier and brand: " + android.os.Build.BRAND + " " + android.os.Build.MANUFACTURER  +
				"\nDevice: " + android.os.Build.DEVICE +
				"\nModel (and Product): " + android.os.Build.MODEL + " " + android.os.Build.PRODUCT));
		startActivity(Intent.createChooser(emailIntent, "Choose Email Client"));
		

	}

}
