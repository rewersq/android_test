package com.games.gamestart;

import com.games.gamestart.R;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MultiTouchTest extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_multi_touch_test);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.multi_touch_test, menu);
		return true;
	}

}
