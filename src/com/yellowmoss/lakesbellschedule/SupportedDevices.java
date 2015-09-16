package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.app.Activity;
import android.os.Build;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
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

		TextView companytextView = (TextView) findViewById(R.id.companytextView);
		String get_company = android.os.Build.MANUFACTURER;
		companytextView.setText(get_company);

		TextView devicetextView = (TextView) findViewById(R.id.devicetextView);
		String get_device = android.os.Build.DEVICE;
		devicetextView.setText(get_device);

		TextView modeltextView = (TextView) findViewById(R.id.modeltextView);
		String get_model = android.os.Build.MODEL;
		modeltextView.setText(get_model);

		TextView brandtextView = (TextView) findViewById(R.id.brandtextView);
		String get_brand = android.os.Build.BRAND;
		brandtextView.setText(get_brand);

		TextView producttextView = (TextView) findViewById(R.id.producttextView);
		String get_product = android.os.Build.PRODUCT;
		producttextView.setText(get_product);

	}

	public void startSendDevice(View view) {
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.setType("message/rfc822");
		emailIntent.putExtra(Intent.EXTRA_EMAIL,
				new String[] { "mstetson717@gmail.com" });
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
				"Device Info: Lakes Bell Ring Schedule App");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,
				("DEVICE INFO:\n" + android.os.Build.MANUFACTURER + "\n"
						+ android.os.Build.DEVICE + "\n"
						+ android.os.Build.MODEL + "\n"
						+ android.os.Build.PRODUCT + "\n"
						+ android.os.Build.BRAND + "\n\n"));
		startActivity(Intent.createChooser(emailIntent, "Choose Email Client"));
	}
}
