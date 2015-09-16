package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class DearMain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dear_main);
	}

	public void startHelp(View view) {
		startActivity(new Intent(getApplicationContext(), Help.class));
	}
}
