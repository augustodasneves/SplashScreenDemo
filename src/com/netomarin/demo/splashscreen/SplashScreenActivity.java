package com.netomarin.demo.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent i = new Intent(SplashScreenActivity.this,
						HomeActivity.class);
				startActivity(i);
				finish();
				overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
			}
		}, 2000);
	}
}
