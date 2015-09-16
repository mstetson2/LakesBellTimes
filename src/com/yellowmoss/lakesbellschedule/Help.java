package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Toast;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.app.Activity;
import android.app.AlertDialog;


public class Help extends Activity {
	int clickCount = 1;
	final Context context = this;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help);
	}

	public void startReport(View view) {
		startActivity(new Intent(getApplicationContext(), BugReport.class));
	}

	public void startDearMain(View view) {
		Context context = getApplicationContext();
		CharSequence text = "Coming soon...";
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
		//startActivity(new Intent(getApplicationContext(), DearMain.class));
	}

	public void startDeveloperInfo(View view) {
		if(clickCount == 5)
		{
		startActivity(new Intent(getApplicationContext(), DeveloperInfo.class));
		}
		else
		{
		clickCount++;
		}
	}
	
	public void sendSuggestion(View v)
	{

		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setPositiveButton("Suggest",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						
						Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
						emailIntent.setType("message/rfc822");
						emailIntent.putExtra(Intent.EXTRA_EMAIL,
								new String[] { "yellowmossstudios@gmail.com" });
						emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
								"Suggestion from: Lakes Bell Ring Schedule App");
						emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,
								Html.fromHtml(""));
						startActivity(Intent.createChooser(emailIntent, "Choose Email Client"));
						
					}
				});
		
		builder.setNegativeButton("Cancel",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						//No need
					}
				});
		builder
		.setMessage("Think something should be added or changed? Request it via email here!\n\nMake sure it isn't already listed on Future Features on Google Play!")
		.setTitle("Something to add?");

		AlertDialog dialog = builder.create();
		dialog.show();
	}
}