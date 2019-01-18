package com.bignerdranch.android.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
	// Define variables
	private Button mTrueButton;
	private Button mFalseButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// True Button
		mTrueButton = findViewById(R.id.true_button);
		mTrueButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast Message = Toast.makeText(MainActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT);
				Message.setGravity(Gravity.TOP,0,0);
				Message.show();
			}
		});

		// False Button
		mFalseButton = findViewById(R.id.false_button);
		mFalseButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast Message = Toast.makeText(MainActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT);
				Message.setGravity(Gravity.TOP,0,0);
				Message.show();
			}
		});
	}
}