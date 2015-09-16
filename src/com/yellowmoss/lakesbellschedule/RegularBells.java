package com.yellowmoss.lakesbellschedule;

import java.util.Calendar;

import android.view.Gravity;
import android.view.Menu;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.MenuItem;

public class RegularBells extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_regular_bells);

		TextView period0Text = (TextView) findViewById(R.id.period0);
		String period_0 = "Period 0: 6:35 - 7:25";
		period0Text.setText(period_0);

		TextView period1Text = (TextView) findViewById(R.id.period1);
		String period_1 = "Period 1: 7:30 - 8:20";
		period1Text.setText(period_1);

		TextView period2Text = (TextView) findViewById(R.id.period2);
		String period_2 = "Period 2: 8:25 - 9:20";
		period2Text.setText(period_2);

		TextView period3Text = (TextView) findViewById(R.id.period3);
		String period_3 = "Period 3: 9:25 - 10:15";
		period3Text.setText(period_3);

		TextView period4aText = (TextView) findViewById(R.id.period4a);
		String period_4a = "Period 4a: 10:20 - 10:45";
		period4aText.setText(period_4a);

		TextView period4bText = (TextView) findViewById(R.id.period4b);
		String period_4b = "Period 4b: 10:45 - 11:10";
		period4bText.setText(period_4b);

		TextView period5aText = (TextView) findViewById(R.id.period5a);
		String period_5a = "Period 5a: 11:15 - 11:40";
		period5aText.setText(period_5a);

		TextView period5bText = (TextView) findViewById(R.id.period5b);
		String period_5b = "Period 5b: 11:40 - 12:05";
		period5bText.setText(period_5b);

		TextView period6aText = (TextView) findViewById(R.id.period6a);
		String period_6a = "Period 6a: 12:10 - 12:35";
		period6aText.setText(period_6a);

		TextView period6bText = (TextView) findViewById(R.id.period6b);
		String period_6b = "Period 6b: 12:35 - 1:00";
		period6bText.setText(period_6b);

		TextView period7Text = (TextView) findViewById(R.id.period7);
		String period_7 = "Period 7: 1:05 - 1:55";
		period7Text.setText(period_7);

		TextView period8Text = (TextView) findViewById(R.id.period8);
		String period_8 = "Period 8: 2:00 - 2:50";
		period8Text.setText(period_8);

		Calendar dayDay = Calendar.getInstance();
		int theDay = dayDay.get(Calendar.DAY_OF_WEEK);

		Calendar dayHour = Calendar.getInstance();
		int theHour = dayHour.get(Calendar.HOUR_OF_DAY);

		Calendar dayMinute = Calendar.getInstance();
		int theMinute = dayMinute.get(Calendar.MINUTE);

		if (theDay != 2 && theDay != 1 && theDay != 7) {
			if (theHour == 6 && theMinute > 35) {
				period0Text.setTextColor(Color.GREEN);
			} else if (theHour == 7 && theMinute < 25) {
				period0Text.setTextColor(Color.GREEN);
			} else if (theHour == 7 && theMinute > 30) {
				period1Text.setTextColor(Color.GREEN);
			} else if (theHour == 8 && theMinute < 20) {
				period1Text.setTextColor(Color.GREEN);
			} else if (theHour == 8 && theMinute > 25) {
				period2Text.setTextColor(Color.GREEN);
			} else if (theHour == 9 && theMinute < 20) {
				period2Text.setTextColor(Color.GREEN);
			} else if (theHour == 9 && theMinute > 25) {
				period3Text.setTextColor(Color.GREEN);
			} else if (theHour == 10 && theMinute < 15) {
				period3Text.setTextColor(Color.GREEN);
			} else if (theHour == 10 && theMinute > 20) {
				period4aText.setTextColor(Color.GREEN);
				period4bText.setTextColor(Color.GREEN);
			} else if (theHour == 11 && theMinute < 10) {
				period4bText.setTextColor(Color.GREEN);
			} else if (theHour == 11 && theMinute > 15) {
				period5aText.setTextColor(Color.GREEN);
				period5bText.setTextColor(Color.GREEN);
			} else if (theHour == 12 && theMinute < 5) {
				period5bText.setTextColor(Color.GREEN);
			} else if (theHour == 12 && theMinute > 10) {
				period6aText.setTextColor(Color.GREEN);
				period6bText.setTextColor(Color.GREEN);
			} else if (theHour == 12 && theMinute > 35) {
				period6bText.setTextColor(Color.GREEN);
			} else if (theHour == 13 && theMinute < 4) {
				period6bText.setTextColor(Color.GREEN);
			} else if (theHour == 13 && theMinute < 55) {
				period7Text.setTextColor(Color.GREEN);
			} else if (theHour == 13 && theMinute > 55) {
				period8Text.setTextColor(Color.GREEN);
			} else if (theHour == 14 && theMinute < 50) {
				period8Text.setTextColor(Color.GREEN);
			}
		}

	}
	
	  @Override public boolean onCreateOptionsMenu(Menu menu) {
	            getMenuInflater().inflate(R.menu.regular_bells, menu);
	            return true;
}
	  @Override
	  public boolean onOptionsItemSelected(MenuItem item) {
		  switch (item.getItemId()) {
	      case R.id.refresh_times:
	    	  
	    	  TextView period0Text = (TextView) findViewById(R.id.period0);
	  		String period_0 = "Period 0: 6:35 - 7:25";
	  		period0Text.setText(period_0);

	  		TextView period1Text = (TextView) findViewById(R.id.period1);
	  		String period_1 = "Period 1: 7:30 - 8:20";
	  		period1Text.setText(period_1);

	  		TextView period2Text = (TextView) findViewById(R.id.period2);
	  		String period_2 = "Period 2: 8:25 - 9:20";
	  		period2Text.setText(period_2);

	  		TextView period3Text = (TextView) findViewById(R.id.period3);
	  		String period_3 = "Period 3: 9:25 - 10:15";
	  		period3Text.setText(period_3);

	  		TextView period4aText = (TextView) findViewById(R.id.period4a);
	  		String period_4a = "Period 4a: 10:20 - 10:45";
	  		period4aText.setText(period_4a);

	  		TextView period4bText = (TextView) findViewById(R.id.period4b);
	  		String period_4b = "Period 4b: 10:45 - 11:10";
	  		period4bText.setText(period_4b);

	  		TextView period5aText = (TextView) findViewById(R.id.period5a);
	  		String period_5a = "Period 5a: 11:15 - 11:40";
	  		period5aText.setText(period_5a);

	  		TextView period5bText = (TextView) findViewById(R.id.period5b);
	  		String period_5b = "Period 5b: 11:40 - 12:05";
	  		period5bText.setText(period_5b);

	  		TextView period6aText = (TextView) findViewById(R.id.period6a);
	  		String period_6a = "Period 6a: 12:10 - 12:35";
	  		period6aText.setText(period_6a);

	  		TextView period6bText = (TextView) findViewById(R.id.period6b);
	  		String period_6b = "Period 6b: 12:35 - 1:00";
	  		period6bText.setText(period_6b);

	  		TextView period7Text = (TextView) findViewById(R.id.period7);
	  		String period_7 = "Period 7: 1:05 - 1:55";
	  		period7Text.setText(period_7);

	  		TextView period8Text = (TextView) findViewById(R.id.period8);
	  		String period_8 = "Period 8: 2:00 - 2:50";
	  		period8Text.setText(period_8);
	  		
	  		period1Text.setTextColor(Color.BLACK);
	  		period2Text.setTextColor(Color.BLACK);
	  		period3Text.setTextColor(Color.BLACK);
	  		period4aText.setTextColor(Color.BLACK);
	  		period4bText.setTextColor(Color.BLACK);
	  		period5aText.setTextColor(Color.BLACK);
	  		period5bText.setTextColor(Color.BLACK);
	  		period6aText.setTextColor(Color.BLACK);
	  		period6bText.setTextColor(Color.BLACK);
	  		period7Text.setTextColor(Color.BLACK);
	  		period8Text.setTextColor(Color.BLACK);
	  		
	  		Calendar dayDay = Calendar.getInstance();
	  		int theDay = dayDay.get(Calendar.DAY_OF_WEEK);

	  		Calendar dayHour = Calendar.getInstance();
	  		int theHour = dayHour.get(Calendar.HOUR_OF_DAY);

	  		Calendar dayMinute = Calendar.getInstance();
	  		int theMinute = dayMinute.get(Calendar.MINUTE);
	  		
	  		if (theDay != 2 && theDay != 1 && theDay != 7) {
	  			if (theHour == 6 && theMinute > 35) {
	  				period0Text.setTextColor(Color.GREEN);
	  			} else if (theHour == 7 && theMinute < 25) {
	  				period0Text.setTextColor(Color.GREEN);
	  			} else if (theHour == 7 && theMinute > 30) {
	  				period1Text.setTextColor(Color.GREEN);
	  			} else if (theHour == 8 && theMinute < 20) {
	  				period1Text.setTextColor(Color.GREEN);
	  			} else if (theHour == 8 && theMinute > 25) {
	  				period2Text.setTextColor(Color.GREEN);
	  			} else if (theHour == 9 && theMinute < 20) {
	  				period2Text.setTextColor(Color.GREEN);
	  			} else if (theHour == 9 && theMinute > 25) {
	  				period3Text.setTextColor(Color.GREEN);
	  			} else if (theHour == 10 && theMinute < 15) {
	  				period3Text.setTextColor(Color.GREEN);
	  			} else if (theHour == 10 && theMinute > 20) {
	  				period4aText.setTextColor(Color.GREEN);
	  				period4bText.setTextColor(Color.GREEN);
	  			} else if (theHour == 11 && theMinute < 10) {
	  				period4bText.setTextColor(Color.GREEN);
	  			} else if (theHour == 11 && theMinute > 15) {
	  				period5aText.setTextColor(Color.GREEN);
	  				period5bText.setTextColor(Color.GREEN);
	  			} else if (theHour == 12 && theMinute < 5) {
	  				period5bText.setTextColor(Color.GREEN);
	  			} else if (theHour == 12 && theMinute > 10) {
	  				period6aText.setTextColor(Color.GREEN);
	  				period6bText.setTextColor(Color.GREEN);
	  			} else if (theHour == 12 && theMinute > 35) {
	  				period6bText.setTextColor(Color.GREEN);
	  			} else if (theHour == 13 && theMinute < 4) {
	  				period6bText.setTextColor(Color.GREEN);
	  			} else if (theHour == 13 && theMinute < 55) {
	  				period7Text.setTextColor(Color.GREEN);
	  			} else if (theHour == 13 && theMinute > 55) {
	  				period8Text.setTextColor(Color.GREEN);
	  			} else if (theHour == 14 && theMinute < 50) {
	  				period8Text.setTextColor(Color.GREEN);
	  			}
	  			Context context = getApplicationContext();
	  			CharSequence text = "Refreshed";
	  			int duration = Toast.LENGTH_SHORT;
	  			Toast toast = Toast.makeText(context, text, duration);
	  			toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);
	  			toast.show();
	  		}
		  return true;
		  default:
	      return super.onOptionsItemSelected(item);
	      }
	  }
}