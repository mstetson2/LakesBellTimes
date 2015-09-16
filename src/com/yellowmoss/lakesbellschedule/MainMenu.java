package com.yellowmoss.lakesbellschedule;

import java.util.Calendar;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.content.Intent;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;



public class MainMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		


		Calendar dayYear = Calendar.getInstance();
		int theDate = dayYear.get(Calendar.DAY_OF_YEAR);
		Calendar dayHour = Calendar.getInstance();
		int theHour = dayHour.get(Calendar.HOUR_OF_DAY);
		Calendar dayDay = Calendar.getInstance();
		int theDay = dayDay.get(Calendar.DAY_OF_WEEK);
		
		//BELOW IS FOR DEAR DAY
		if (theDate == 109) {
			// 109

			startActivity(new Intent(getApplicationContext(), DearMain.class));
			if (theHour < 10) {
				// 10
				NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(
						this)
						.setSmallIcon(R.drawable.lakes_logo)
						.setContentTitle("Today is Dear Day!")
						.setContentText(
								"The schedule for today has been updated");

				Intent resultIntent = new Intent(this, DearMain.class);
				// Because clicking the notification opens a new ("special")
				// activity, there's
				// no need to create an artificial back stack.
				PendingIntent resultPendingIntent = PendingIntent.getActivity(
						this, 0, resultIntent,
						PendingIntent.FLAG_UPDATE_CURRENT);
				
				//PendingIntent resultPendingIntent1;
				mBuilder.setContentIntent(resultPendingIntent);				
								
				// Sets an ID for the notification
				int mNotificationId = 001;
				// Gets an instance of the NotificationManager service
				NotificationManager mNotifyMgr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
				// Builds the notification and issues it.
				mNotifyMgr.notify(mNotificationId, mBuilder.build());			
				
			}// ends DEAR DAY
			
			//BELOW STARTS LATE START CHECK
			
			if(theDay == 2 && theDate !=200){
			//TODO Fix theDate 's Actual date!!
				if (theHour < 10) {
					// 10
					NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(
							this)
							.setSmallIcon(R.drawable.lakes_logo)
							.setContentTitle("Today is a Late Start!")
							.setContentText("The schedule for today has been updated");

					Intent resultIntent = new Intent(this, LateStartBells.class);

					// Because clicking the notification opens a new ("special")
					// activity, there's
					// no need to create an artificial back stack.
					PendingIntent resultPendingIntent = PendingIntent.getActivity(
							this, 0, resultIntent,
							PendingIntent.FLAG_UPDATE_CURRENT);
					
					//PendingIntent resultPendingIntent1;
					mBuilder.setContentIntent(resultPendingIntent);				
									
					// Sets an ID for the notification
					int mNotificationId = 001;
					// Gets an instance of the NotificationManager service
					NotificationManager mNotifyMgr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
					// Builds the notification and issues it.
					mNotifyMgr.notify(mNotificationId, mBuilder.build());
				}//ENDS HOUR BRACKET
			}//ENDS LATE START
		} // Ends Calendar
		boolean tabletSize = getResources().getBoolean(R.bool.isTablet);
		if (tabletSize) {
				startActivity(new Intent(getApplicationContext(), TabletMainMenu.class));
			}
	}// Ends Layout

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