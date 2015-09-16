package com.yellowmoss.lakesbellschedule;

import java.util.Calendar;
import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;


public class LateStartBells extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_late_start_bells);
		
		Calendar dayHour = Calendar.getInstance();
		int theHour = dayHour.get(Calendar.HOUR_OF_DAY);
		
		Calendar dayMinute = Calendar.getInstance();
		int theMinute = dayMinute.get(Calendar.MINUTE);
		
		TextView periodLate1Text = (TextView) findViewById(R.id.lateperiod1);
		String late_period_1 = "Period 0: 6:35 - 7:25";
		periodLate1Text.setText(late_period_1);
		
		
	}

}
