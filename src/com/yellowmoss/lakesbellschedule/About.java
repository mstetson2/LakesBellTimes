package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
//import android.view.Menu;
import android.view.View;

public class About extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
	}

	/**
	 * @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the
	 *           menu; this adds items to the action bar if it is present.
	 *           getMenuInflater().inflate(R.menu.about, menu); return true; }
	 */

	public void startDevices(View view) {
		startActivity(new Intent(getApplicationContext(),
				SupportedDevices.class));
	}

	public void startContent(View view) {
		startActivity(new Intent(getApplicationContext(), FutureContent.class));
	}

	public void startChange(View view) {
		startActivity(new Intent(getApplicationContext(), ChangeLog.class));
	}

	public void startDeveloperInfo(View view) {
		startActivity(new Intent(getApplicationContext(), DeveloperInfo.class));
	}
}
