package com.example.himanshu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ShowValues extends Activity {

	private TextView tv1, tv2, tv3, tv4, tv5;
	String data;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_values);
		tv1 = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		tv3 = (TextView) findViewById(R.id.textView3);
		tv4 = (TextView) findViewById(R.id.textView4);
		tv5 = (TextView) findViewById(R.id.textView5);
		Intent i = getIntent();
		Bundle b = i.getExtras();
		String name = b.getString("name");
		String phone_no = b.getString("phone_no");
		String course = b.getString("course");
		String timeslot = b.getString("timeslot");
		String email = b.getString("email");
		tv1.setText(name);
		tv2.setText(phone_no);
		tv3.setText(course);
		tv4.setText(timeslot);
		tv5.setText(email);
	}
}
