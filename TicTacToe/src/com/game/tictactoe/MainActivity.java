package com.game.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button = (Button) findViewById(R.id.my_button);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				System.out.println("ASd");
				TextView textField = (TextView) findViewById(R.id.text);
				String string = "Text changed.";
				Intent intent = new Intent(MainActivity.this,
						SecondActivity.class);
				
				intent.putExtra("TAG", false);
				
				startActivity(intent);
				textField.setText(string);
				intent.putExtra("TAG", string);
			}
		});

		TextView textField = (TextView) findViewById(R.id.text);

		if (savedInstanceState != null) {
			String string = savedInstanceState.getString("TAG");
			if (string != null) {
				textField.setText(string);
			} else {
				System.out.println("Text is null");
			}
		}
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putString("TAG", "Text changed.");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
	}
}
