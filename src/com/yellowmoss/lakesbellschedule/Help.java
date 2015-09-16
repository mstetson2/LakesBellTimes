package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.app.Activity;

//import android.view.Menu;

public class Help extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);
	}

	/**
	 * @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the
	 *           menu; this adds items to the action bar if it is present.
	 *           getMenuInflater().inflate(R.menu.help, menu); return true; }
	 */
	public void startAbout(View view) {
		startActivity(new Intent(getApplicationContext(), About.class));
	}

	public void startReport(View view) {
		startActivity(new Intent(getApplicationContext(), BugReport.class));
	}

	public void startContact(View view) {
		startActivity(new Intent(getApplicationContext(),
				ContactDeveloper.class));
	}

	public void startDearMain(View view) {
		startActivity(new Intent(getApplicationContext(), DearMain.class));
	}

}
