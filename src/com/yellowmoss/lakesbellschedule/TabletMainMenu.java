package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

public class TabletMainMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tablet_main_menu);

		final Context context = this;
		// public void dialogBox(View view) {

		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		// Add the buttons
		builder.setPositiveButton("Okay",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						// User clicked OK button
					}
				});

		// Set other dialog properties
		builder.setMessage(
				"Tablets are currently not supported, so this app may not look the greatest on your device. This will be fixed in a future update!")
				.setTitle("You're on a tablet :o");

		// Create the AlertDialog
		AlertDialog dialog = builder.create();
		// Show Dialog
		dialog.show();

	}

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
