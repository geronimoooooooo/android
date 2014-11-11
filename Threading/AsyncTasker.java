package com.example.asynchtasker;

import android.R.bool;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {

	private ProgressBar mProgressBar;
	private Button butCalc, bCheckInternet;
	private boolean internet = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		
		bCheckInternet =(Button)findViewById(R.id.b_checkInternet);
		bCheckInternet.setOnClickListener(new View.OnClickListener() {						
			
			@Override
			public void onClick(View v) {
				ConnectivityManager cm2 = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
				NetworkInfo ni = cm2.getActiveNetworkInfo();
				if(ni !=null && ni.isConnected()){
					Toast.makeText(getApplicationContext(), "Internet ist da: ", Toast.LENGTH_SHORT).show();
				}else {
					Toast.makeText(getApplicationContext(), "Panic! Kein Internet!", Toast.LENGTH_SHORT).show();
				}
			}
		});
				
		mProgressBar = (ProgressBar) findViewById(R.id.progressBar1);
		butCalc = (Button) findViewById(R.id.b_calc);

		butCalc.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
			CalcTask ctask = new CalcTask();
			ctask.execute();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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

	private class CalcTask extends AsyncTask<Void, Integer, Long> {

		@Override
		protected void onPreExecute(){
			mProgressBar.setProgress(0);
			Toast.makeText(getApplicationContext(), "preExecute started", Toast.LENGTH_SHORT).show();
		}
		
		@Override
		protected Long doInBackground(Void... params) {
			long counter = 0;
			for (int i = 1; i <= 10000000; i++) {
				counter += i;
				if (i % 100000 == 0) {
					publishProgress((int) i / 100000);
				}
			}
			return counter;
		}
		@Override
		protected void onProgressUpdate(Integer...integers){
			mProgressBar.setProgress(integers[0]);
		}
		
		protected void onPostExecute(Long result){
			Toast.makeText(getApplicationContext(), "Counter is: "+result, Toast.LENGTH_LONG).show();
		}		
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}
}
