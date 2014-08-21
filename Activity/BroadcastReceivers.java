//in onCreate aufrufen
registerReceiver(bcrec, new IntentFilter("Alert"));

//eigenen dynamischen broadcast receiver definieren
final BroadcastReceiver bcrec = new BroadcastReceiver() {
	public void onReceive(android.content.Context context,
			android.content.Intent intent) {
		String content = intent.getStringExtra("data");
		Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
	}
};

public void startAlert(View view) {
	Intent intent2 = new Intent("Alert");
	intent2.putExtra("data", "valjupijojue");
	sendBroadcast(intent2);
	return;

	EditText text = (EditText) findViewById(R.id.time);
	int i = Integer.parseInt(text.getText().toString());
	Intent intent = new Intent(this, MyBroadcastReceiver.class);
	PendingIntent pendingIntent = PendingIntent.getBroadcast(
			this.getApplicationContext(), 234324243, intent, 0);
	AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
	alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()
			+ (i * 1000), pendingIntent);
	Toast.makeText(this, "Alarm set in " + i + " seconds",
			Toast.LENGTH_LONG).show();
}


package com.example.broadcastertest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Toast.makeText(context, "Don't panik but your time is up!!!!.",Toast.LENGTH_LONG).show();
		Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
		vibrator.vibrate(2000);
	}
}
