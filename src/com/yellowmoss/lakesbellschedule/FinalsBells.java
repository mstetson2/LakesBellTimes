
package com.yellowmoss.lakesbellschedule;

import android.os.Bundle;
import android.app.Activity;
import java.util.Calendar;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.MenuItem;

public class FinalsBells extends Activity {
    
    Calendar dayYear = Calendar.getInstance();
    int theDate = dayYear.get(Calendar.DAY_OF_YEAR);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finals_bells);
        
        if(theDate == 142)
        {
            TextView dateText = (TextView) findViewById(R.id.dateTextView);
            dateText.setText("May 22");
            TextView finalsDayText = (TextView) findViewById(R.id.finalsDayView);
            finalsDayText.setText("Finals Day 1");
            
            TextView slot1 = (TextView) findViewById(R.id.firstSlotView);
            slot1.setText("Period 1: 7:30 - 8:50");

            TextView slot2 = (TextView) findViewById(R.id.secondSlotView);
            slot2.setText("Period 2: 9:00 - 10:20");
            
            TextView slot3 = (TextView) findViewById(R.id.thirdSlotView);
            slot3.setText("Period 4: 10:30 - 11:50");
            
            Calendar dayHour = Calendar.getInstance();
            int theHour = dayHour.get(Calendar.HOUR_OF_DAY);

            Calendar dayMinute = Calendar.getInstance();
            int theMinute = dayMinute.get(Calendar.MINUTE);
            
            if (theHour == 7 && theMinute >= 30) {
               slot1.setTextColor(Color.GREEN);
            } else if (theHour == 8 && theMinute <= 50) {
                slot1.setTextColor(Color.GREEN);
            }
            else if (theHour == 9) {
                slot2.setTextColor(Color.GREEN);
             } else if (theHour == 10 && theMinute <= 20) {
                 slot2.setTextColor(Color.GREEN);
             }
             else if (theHour == 10 && theMinute >= 30) {
                 slot3.setTextColor(Color.GREEN);
              } else if (theHour == 11 && theMinute <= 50) {
                  slot3.setTextColor(Color.GREEN);
              }        
        }
        else if(theDate == 143)
        {
            TextView dateText = (TextView) findViewById(R.id.dateTextView);
            dateText.setText("May 23");
            TextView finalsDayText = (TextView) findViewById(R.id.finalsDayView);
            finalsDayText.setText("Finals Day 2");
            
            TextView slot1 = (TextView) findViewById(R.id.firstSlotView);
            slot1.setText("Period 3: 7:30 - 8:50");

            TextView slot2 = (TextView) findViewById(R.id.secondSlotView);
            slot2.setText("Period 8: 9:00 - 10:20");
            
            TextView slot3 = (TextView) findViewById(R.id.thirdSlotView);
            slot3.setText("Period 5: 10:30 - 11:50");
            
            Calendar dayHour = Calendar.getInstance();
            int theHour = dayHour.get(Calendar.HOUR_OF_DAY);

            Calendar dayMinute = Calendar.getInstance();
            int theMinute = dayMinute.get(Calendar.MINUTE);
            
            if (theHour == 7 && theMinute >= 30) {
               slot1.setTextColor(Color.GREEN);
            } else if (theHour == 8 && theMinute <= 50) {
                slot1.setTextColor(Color.GREEN);
            }
            else if (theHour == 9) {
                slot2.setTextColor(Color.GREEN);
             } else if (theHour == 10 && theMinute <= 20) {
                 slot2.setTextColor(Color.GREEN);
             }
             else if (theHour == 10 && theMinute >= 30) {
                 slot3.setTextColor(Color.GREEN);
              } else if (theHour == 11 && theMinute <= 50) {
                  slot3.setTextColor(Color.GREEN);
              }
        }
        else if(theDate == 144)
        {
            TextView dateText = (TextView) findViewById(R.id.dateTextView);
            dateText.setText("May 24");
            TextView finalsDayText = (TextView) findViewById(R.id.finalsDayView);
            finalsDayText.setText("Finals Day 3");
            
            TextView slot1 = (TextView) findViewById(R.id.firstSlotView);
            slot1.setText("Period 7: 7:30 - 8:50");

            TextView slot2 = (TextView) findViewById(R.id.secondSlotView);
            slot2.setText("Period 6: 9:00 - 10:20");
            
            TextView slot3 = (TextView) findViewById(R.id.thirdSlotView);
            slot3.setText("Make Up & Period 0: 10:30 - 11:50");
            
            Calendar dayHour = Calendar.getInstance();
            int theHour = dayHour.get(Calendar.HOUR_OF_DAY);

            Calendar dayMinute = Calendar.getInstance();
            int theMinute = dayMinute.get(Calendar.MINUTE);
            
            if (theHour == 7 && theMinute >= 30) {
               slot1.setTextColor(Color.GREEN);
            } else if (theHour == 8 && theMinute <= 50) {
                slot1.setTextColor(Color.GREEN);
            }
            else if (theHour == 9) {
                slot2.setTextColor(Color.GREEN);
             } else if (theHour == 10 && theMinute <= 20) {
                 slot2.setTextColor(Color.GREEN);
             }
             else if (theHour == 10 && theMinute >= 30) {
                 slot3.setTextColor(Color.GREEN);
              } else if (theHour == 11 && theMinute <= 50) {
                  slot3.setTextColor(Color.GREEN);
              }
        }
        else
        {
            TextView dateText = (TextView) findViewById(R.id.dateTextView);
            dateText.setText("ERROR 1/114");
            TextView finalsDayText = (TextView) findViewById(R.id.finalsDayView);
            finalsDayText.setText("SUBMIT A BUG REPORT!"); }
        }
    
    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.regular_bells, menu);
        return true;
}  
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
            case R.id.refresh_times:
                TextView slot1 = (TextView) findViewById(R.id.firstSlotView);
                TextView slot2 = (TextView) findViewById(R.id.secondSlotView);             
                TextView slot3 = (TextView) findViewById(R.id.thirdSlotView);
                slot1.setTextColor(Color.BLACK);
                slot2.setTextColor(Color.BLACK);
                slot3.setTextColor(Color.BLACK);
                
                Calendar dayHour = Calendar.getInstance();
                int theHour = dayHour.get(Calendar.HOUR_OF_DAY);

                Calendar dayMinute = Calendar.getInstance();
                int theMinute = dayMinute.get(Calendar.MINUTE);
                
                if (theHour == 7 && theMinute >= 30) {
                    slot1.setTextColor(Color.GREEN);
                 } else if (theHour == 8 && theMinute <= 50) {
                     slot1.setTextColor(Color.GREEN);
                 }
                 else if (theHour == 9) {
                     slot2.setTextColor(Color.GREEN);
                  } else if (theHour == 10 && theMinute <= 20) {
                      slot2.setTextColor(Color.GREEN);
                  }
                  else if (theHour == 10 && theMinute >= 30) {
                      slot3.setTextColor(Color.GREEN);
                   } else if (theHour == 11 && theMinute <= 50) {
                       slot3.setTextColor(Color.GREEN);
                   }
                Context context = getApplicationContext();
                CharSequence text = "Refreshed";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                
            return true;
            default:
            return super.onOptionsItemSelected(item);
            }
        }
        public void startHelp(View view)
        {
            startActivity(new Intent(getApplicationContext(), Help.class));
        }
        
        @Override
        public void onBackPressed() {
            finish();
        }
}