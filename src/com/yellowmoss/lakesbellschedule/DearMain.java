package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

public class DearMain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dear_main);
		final Context context = this;
		AlertDialog.Builder builder = new AlertDialog.Builder(context);

		builder.setPositiveButton("Continue",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
					
				}
			});	
		builder.setMessage(
				"The Schedule has been updated automatically for today!\n\nRemember to grab a book at the library!")
				.setTitle("Today is Dear Day!");
		AlertDialog dialog = builder.create();
		dialog.show();
		}

						
	public void startHelp(View view) {
		startActivity(new Intent(getApplicationContext(), Help.class));
	}
}
