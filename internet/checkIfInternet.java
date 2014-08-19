public void onClick(View v) {
	ConnectivityManager cm2 = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
	NetworkInfo ni = cm2.getActiveNetworkInfo();
	if(ni !=null && ni.isConnected()){
		Toast.makeText(getApplicationContext(), "Internet ist da: ", Toast.LENGTH_SHORT).show();
	}else {
		Toast.makeText(getApplicationContext(), "Panic! Kein Internet!", Toast.LENGTH_SHORT).show();
		}
}
