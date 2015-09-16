package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.app.Activity;
//import android.view.Menu;

public class MainMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
	}

	/**@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}
*/
	public void startRegular(View view) {
		startActivity(new Intent(getApplicationContext(), RegularBells.class));
	}

	public void startLate(View view) {
		startActivity(new Intent(getApplicationContext(), LateStartBells.class));
	}

	public void startHelp(View view) {
		startActivity(new Intent(getApplicationContext(), Help.class));
	}

}
