public void on(View view) {
	if (!myBluetoothAdapter.isEnabled()) {
		Intent turnOnIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
		startActivityForResult(turnOnIntent, REQUEST_ENABLE_BT);
		Toast.makeText(getApplicationContext(), "Bluetooth turned on",Toast.LENGTH_LONG).show();
	} else {
		Toast.makeText(getApplicationContext(), "Bluetooth is already on",Toast.LENGTH_LONG).show();
	}
}
   
   @Override
   protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	   // TODO Auto-generated method stub
	   if(requestCode == REQUEST_ENABLE_BT){
		   if(myBluetoothAdapter.isEnabled()) {
			   text.setText("Status: Enabled");
		   } else {   
			   text.setText("Status: Disabled");
		   }
	   }
   }
