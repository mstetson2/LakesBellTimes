package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.app.Activity;
import android.app.AlertDialog;


public class More extends Activity {
	int clickCount = 1;
	final Context context = this;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_more);
	}

    public void startReport(View v)
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setPositiveButton("Okay",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                        emailIntent.setType("message/rfc822");
                        emailIntent.putExtra(Intent.EXTRA_EMAIL,
                                new String[] { "yellowmossstudios@gmail.com" });
                        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
                                "Bug Report: Lakes Bell Ring Schedule App");
                        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,
                                (		"DEVICE INFO:\n" + "\n OS Version: " + System.getProperty("os.version") + "(" + android.os.Build.VERSION.INCREMENTAL + ")" +
                                        "\n OS API Level: " + android.os.Build.VERSION.SDK_INT +
                                        "\nCompany and brand: " + android.os.Build.BRAND + android.os.Build.MANUFACTURER  +
                                        "\n Device: " + android.os.Build.DEVICE +
                                        "\n Model (and Product): " + android.os.Build.MODEL + android.os.Build.PRODUCT
                                        +       "\n\nMessage:\n"));
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
                .setMessage("Find a bug, does a page not look right, or are you getting Force Closed messages? Report them here!\n\n\nNote: Information regarding your device's hardware/software will be attached to this email.")
                .setTitle("Bug Report");

        AlertDialog dialog = builder.create();
        dialog.show();
    }

	public void startDeveloperInfo(View view) {
		if(clickCount == 5)
		{
        clickCount = 0;
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
    public void startChange(View view) {
        setContentView(R.layout.activity_change_log);
    }
}