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
