package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class About extends Activity {
int clickCount = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
	}

	
	public void startDevices(View view) {
		startActivity(new Intent(getApplicationContext(),
				SupportedDevices.class));
	}

	public void startContent(View view) {
		startActivity(new Intent(getApplicationContext(), FutureContent.class));
	}

	public void startChange(View view) {
		startActivity(new Intent(getApplicationContext(), ChangeLog.class));
	}

	public void startDeveloperInfo(View view) {
		if(clickCount == 4)
		{
		startActivity(new Intent(getApplicationContext(), DeveloperInfo.class));
		}
		else
		{
		clickCount++;
		}
	}
}
