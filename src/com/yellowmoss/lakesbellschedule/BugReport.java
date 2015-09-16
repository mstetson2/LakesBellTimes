package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.app.Activity;
//import android.view.Menu;
import android.content.Intent;

public class BugReport extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bug_report);
	}

	/**
	 * @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the
	 *           menu; this adds items to the action bar if it is present.
	 *           getMenuInflater().inflate(R.menu.bug_report, menu); return
	 *           true; }
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
