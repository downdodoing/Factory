package com.example.factory;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.example.factory.myinterface.Fruit;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		AppleGardener mAppleGardener = new AppleGardener();
		Fruit apple = mAppleGardener.factory();
		apple.plant();
		apple.group();
		apple.harvest();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
