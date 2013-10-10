package com.gamesgamestart;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Start extends ListActivity {
	
	String tests[] = { "LifeCycleTest", "SingleTouchTest", "MultiTouchTest",
			"KeyTest", "AccelerometerTest", "AssetsTest",
			"ExternalStorageTest", "SoundPoolTest", "MediaPlayerTest","FullScreenTest", "RenderViewTest", "ShapeTest", "BitmapTest",
			"FontTest", "SurfaceViewTest", "TextTest" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		System.out.print("test");
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, tests));
	}

	@Override
	protected void onListItemClick(ListView list, View view, int position,
			long id) {
		System.out.print("test");
			super.onListItemClick(list, view, position, id);
			
			String testName = tests[position];
			System.out.print(testName);
			try {
			Class clazz = Class
			.forName("com.games.gamestart." + testName);
			
			Intent intent = new Intent(this, clazz);
			startActivity(intent);
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
			}

}
