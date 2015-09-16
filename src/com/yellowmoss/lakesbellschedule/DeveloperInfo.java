package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.text.Html;

public class DeveloperInfo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_developer_info);
	}

	public void startSendEmail(View view) {
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.setType("message/rfc822");
		emailIntent.putExtra(Intent.EXTRA_EMAIL,
				new String[] { "mstetson717@gmail.com" });
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
				"Message from: Lakes Bell Ring Schedule App");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,
				Html.fromHtml(""));
		startActivity(Intent.createChooser(emailIntent, "Choose Email Client"));

	}
}
