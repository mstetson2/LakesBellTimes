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
		
		Calendar dayDay = Calendar.getInstance();
		int theDay = dayDay.get(Calendar.DAY_OF_WEEK);
		
		Calendar dayHour = Calendar.getInstance();
		int theHour = dayHour.get(Calendar.HOUR_OF_DAY);
		
		Calendar dayMinute = Calendar.getInstance();
		int theMinute = dayMinute.get(Calendar.MINUTE);
						
		TextView periodLate1Text = (TextView) findViewById(R.id.lateperiod1);
		String late_period_1 = "Period 1: 8:55 – 9:35";
		periodLate1Text.setText(late_period_1);
		
		TextView periodLate2Text = (TextView) findViewById(R.id.lateperiod2);
		String late_period_2 = "Period 2: 9:40 – 10:20";
		periodLate2Text.setText(late_period_2);
		
		TextView periodLate3Text = (TextView) findViewById(R.id.lateperiod3);
		String late_period_3 = "Period 3: 10:25 – 11:05";
		periodLate3Text.setText(late_period_3);
		
		TextView periodLate4aText = (TextView) findViewById(R.id.lateperiod4a);
		String late_period_4a = "Period 4a: 11:10 – 11:30";
		periodLate4aText.setText(late_period_4a);
		
		TextView periodLate4bText = (TextView) findViewById(R.id.lateperiod4b);
		String late_period_4b = "Period 4b: 11:30 – 11:50";
		periodLate4bText.setText(late_period_4b);
				
		TextView periodLate5aText = (TextView) findViewById(R.id.lateperiod5a);
		String late_period_5a = "Period 5a: 11:55 – 12:15";
		periodLate5aText.setText(late_period_5a);
		
		TextView periodLate5bText = (TextView) findViewById(R.id.lateperiod5b);
		String late_period_5b = "Period 5b: 12:15 – 12:35";
		periodLate5bText.setText(late_period_5b);
		
		TextView periodLate6aText = (TextView) findViewById(R.id.lateperiod6a);
		String late_period_6a = "Period 6a: 12:40 – 1:00";
		periodLate6aText.setText(late_period_6a);
		
		TextView periodLate6bText = (TextView) findViewById(R.id.lateperiod6b);
		String late_period_6b = "Period 6b: 1:00 – 1:20";
		periodLate6bText.setText(late_period_6b);
		
		TextView periodLate7Text = (TextView) findViewById(R.id.lateperiod7);
		String late_period_7 = "Period 7: 1:25 – 2:05";
		periodLate7Text.setText(late_period_7);
		
		TextView periodLate8Text = (TextView) findViewById(R.id.lateperiod8);
		String late_period_8 = "Period 8: 2:10 – 2:50";
		periodLate8Text.setText(late_period_8);
		
		//if(theDay == 2)

	}

}
