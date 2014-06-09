package com.game.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity_layout);
		Intent intent = getIntent();
		boolean b = intent.getExtras().getBoolean("TAG");
		System.out.println(b);
	}
}
