package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.text.*;

public class ContactDeveloper extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_developer);
	}

	/**
	 * @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the
	 *           menu; this adds items to the action bar if it is present.
	 *           getMenuInflater().inflate(R.menu.contact_developer, menu);
	 *           return true; } // public void startSendEmail(View view) {
	 *           Intent sendEmail = new Intent(Intent.ACTION_SENDTO); // it's
	 *           not ACTION_SEND sendEmail.setType("text/plain");
	 *           sendEmail.putExtra(Intent.EXTRA_SUBJECT,
	 *           "Comment From: Lakes Bell Ring Schedule App");
	 *           sendEmail.putExtra(Intent.EXTRA_TEXT, "Body of email");
	 *           sendEmail.setData(Uri.parse("mailto:msetetson717@gmail.com"));
	 *           // or just "mailto:" for blank
	 *           sendEmail.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will
	 *           make such that when user returns to your app, your app is
	 *           displayed, instead of the email app.
	 */

	public void startSendEmail(View view) {
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.setType("message/rfc822");
		emailIntent.putExtra(Intent.EXTRA_EMAIL,
				new String[] { "mstetson717@gmail.com" });
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
				"Message from: Lakes Bell Ring Schedule App");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,
				Html.fromHtml("<b>"));
		startActivity(Intent.createChooser(emailIntent, "Choose Email Client"));

	}

}