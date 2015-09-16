package com.yellowmoss.lakesbellschedule;

import java.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.app.Activity;

public class MainMenu extends Activity {
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

        Calendar dayDay = Calendar.getInstance();
        int theDay = dayDay.get(Calendar.DAY_OF_WEEK);
		int theDate =dayDay.get(Calendar.DAY_OF_YEAR);
		if(theDate == 352 || theDate == 353 || theDate == 354 )
		{
			startActivity(new Intent(getApplicationContext(), FinalsBells.class));
			finish();
		}

        else if (theDay != 2 && theDay != 1 && theDay != 7){
            startActivity(new Intent(getApplicationContext(), RegularBells.class));
            finish();
        } else if (theDay == 2){
            startActivity(new Intent(getApplicationContext(), LateStartBells.class));
            finish();
        } else {
            setContentView(R.layout.activity_main_menu);
        }
	}

	public void startRegular(View view) {
		startActivity(new Intent(getApplicationContext(), RegularBells.class));
	}
	public void startLate(View view) {
		startActivity(new Intent(getApplicationContext(), LateStartBells.class));
	}
	public void startHelp(View view) {
		startActivity(new Intent(getApplicationContext(), More.class));
	}
    /**
     Calendar dayYear = Calendar.getInstance();
     int theDate = dayYear.get(Calendar.DAY_OF_YEAR);

     
     else
     {
     TextView countDownText = (TextView) findViewById(R.id.countdown_view);
     int daysLeft = 146 - theDate;
     if(daysLeft > 0) {
     countDownText.setText("\nDays until summer: " + daysLeft);
     }

     boolean tabletSize = getResources().getBoolean(R.bool.isTablet);
     if (tabletSize) {
     setContentView(R.layout.activity_tablet_main_menu);

     TextView tabletText = (TextView) findViewById(R.id.tabletTextView);
     String tablet_text_string = "Tablets are currently not supported, so this app may not look the greatest on your device. This will be fixed in a future update!";
     tabletText.setText(tablet_text_string);
     }

     }
     **/
}
