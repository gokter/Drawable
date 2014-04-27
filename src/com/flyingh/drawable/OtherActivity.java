package com.flyingh.drawable;

import android.graphics.drawable.LevelListDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class OtherActivity extends ActionBarActivity {

	private ImageView imageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other);
		imageView = (ImageView) findViewById(R.id.otherImageView);
		ImageView imageView3 = (ImageView) findViewById(R.id.thirdImageView);
		TransitionDrawable drawable = (TransitionDrawable) imageView3.getDrawable();
		drawable.startTransition(2000);

	}

	public void change(View view) {
		LevelListDrawable levelListDrawable = (LevelListDrawable) imageView.getDrawable();
		levelListDrawable.setLevel(15);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.other, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
