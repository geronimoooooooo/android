final BroadcastReceiver bcrec = new BroadcastReceiver() {
	public void onReceive(android.content.Context context,
			android.content.Intent intent) {
		String content = intent.getStringExtra("data");
		Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
	}
};
d
//in onCreate aufrufen
registerReceiver(bcrec, new IntentFilter("Alert"));

asdf
dsaf
