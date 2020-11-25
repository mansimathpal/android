package com.example.himanshu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	private Spinner courseSpinner;
	private TextView tv1,tv2, tv3, tv4, tv5;
	private EditText et1, et2, et3;
	private Button btn1, btn2;
	private CheckBox cb1, cb2, cb3, cb4;
	private ArrayAdapter<String> mAdapter;
	String [] courses= {"C","C++","Java","Adv Java"};
	String cval1, cval2, cval3, cval4;
	String Name, Phone_No, Email,course;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		courseSpinner = (Spinner)findViewById(R.id.spinner1);
		mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, courses);
		mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		courseSpinner.setAdapter(mAdapter);
		tv1 = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		tv3 = (TextView) findViewById(R.id.textView3);
		tv4 = (TextView) findViewById(R.id.textView4);
		tv5 = (TextView) findViewById(R.id.textView5);
		
		et1 = (EditText) findViewById(R.id.editText1);
		et2 = (EditText) findViewById(R.id.editText2);
		et3 = (EditText) findViewById(R.id.editText3);
		
		btn1 = (Button) findViewById(R.id.button1);
		btn2 = (Button) findViewById(R.id.button2);
		
		cb1 = (CheckBox) findViewById(R.id.checkBox1);
		cb2 = (CheckBox) findViewById(R.id.checkBox2);
		cb3 = (CheckBox) findViewById(R.id.checkBox3);
		cb4 = (CheckBox) findViewById(R.id.checkBox4);
		
		Name = et1.getText().toString();
		Phone_No = et2.getText().toString();
		Email = et3.getText().toString();
		
		if(cb1.isSelected())
		{
			cval1=cb1.getText().toString();
		}
		if(cb2.isSelected())
		{
			cval2=cb2.getText().toString();
		}
		if(cb3.isSelected())
		{
			cval3=cb3.getText().toString();
		}
		if(cb4.isSelected())
		{
			cval4=cb4.getText().toString();
		}
		course = courseSpinner.getSelectedItem().toString();
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch(view.getId())
		{
		case R.id.button1:
			Intent intent = new Intent(this,ShowValues.class);
			Bundle bundle = new Bundle();
			bundle.putString("name", Name);
			bundle.putString("phone_no", Phone_No);
			bundle.putString("email", Email);
			String timeSlot = cval1+"  "+cval2+"  "+cval3+"  "+cval4;
			bundle.putString("timeslot", timeSlot);
			bundle.putString("course", course);
			intent.putExtras(bundle);
			startActivity(intent);
		case R.id.button2:
			et1.setText("");
			et2.setText("");
			et3.setText("");
			cb1.setSelected(false);
			cb2.setSelected(false);
			cb3.setSelected(false);
			cb4.setSelected(false);	
		}	
	}
}
