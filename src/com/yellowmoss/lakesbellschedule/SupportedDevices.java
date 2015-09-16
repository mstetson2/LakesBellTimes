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
		
		String device_info = "Your deivice";
		device_info += "\n OS Version: " + System.getProperty("os.version") + "(" + android.os.Build.VERSION.INCREMENTAL + ")";
		device_info += "\n OS API Level: " + android.os.Build.VERSION.SDK_INT;
		device_info += "\nCompany and brand: " + android.os.Build.BRAND + android.os.Build.MANUFACTURER;
		device_info += "\n Device: " + android.os.Build.DEVICE;
		device_info += "\n Model (and Product): " + android.os.Build.MODEL + " ("+ android.os.Build.PRODUCT + ")";
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
				"DEVICE INFO:\n" + "\n OS Version: " + System.getProperty("os.version") + "(" + android.os.Build.VERSION.INCREMENTAL + ")" +
				"\n OS API Level: " + android.os.Build.VERSION.SDK_INT +
				"\nCompany and brand: " + android.os.Build.BRAND + android.os.Build.MANUFACTURER  +
				"\n Device: " + android.os.Build.DEVICE +
				"\n Model (and Product): " + android.os.Build.MODEL + android.os.Build.PRODUCT));
		startActivity(Intent.createChooser(emailIntent, "Choose Email Client"));
		

	}

}
