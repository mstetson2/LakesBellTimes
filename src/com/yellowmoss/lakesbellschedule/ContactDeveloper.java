package com.yellowmoss.lakesbellschedule;

//import android.net.Uri;
//import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
//import android.view.Menu;
import android.content.Intent;
//import java.util.List;
//import android.content.pm.ResolveInfo;
import android.text.*;

public class ContactDeveloper extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_developer);
	}

	/**@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contact_developer, menu);
		return true;
	}
//
	public void startSendEmail(View view)
	{
		Intent sendEmail = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
		sendEmail.setType("text/plain");
		sendEmail.putExtra(Intent.EXTRA_SUBJECT, "Comment From: Lakes Bell Ring Schedule App");
		sendEmail.putExtra(Intent.EXTRA_TEXT, "Body of email");
		sendEmail.setData(Uri.parse("mailto:msetetson717@gmail.com")); // or just "mailto:" for blank
		sendEmail.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
		*/
		
		public void startSendEmail(View view)
		{
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.setType("text/html");
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "testing email send.");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml("<b>this is html text in email body.</b>"));
		startActivity(Intent.createChooser(emailIntent, "Email to Friend"));
		}	
		/**PackageManager packageManager = getPackageManager();
		List<ResolveInfo> activities = packageManager.queryIntentActivities(sendEmail, 0);
		boolean isIntentSafe = activities.size() > 0;
		
		if(isIntentSafe){
		startActivity(sendEmail);
		*/
	
}
