 public void enableBlootooth(View view){
    if (!myBluetoothAdapter.isEnabled()) {
       Intent turnOnIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
       startActivityForResult(turnOnIntent, REQUEST_ENABLE_BT);

       Toast.makeText(getApplicationContext(),"Bluetooth turned on" ,
  		 Toast.LENGTH_LONG).show();
}
else{
   Toast.makeText(getApplicationContext(),"Bluetooth is already on",
      		 Toast.LENGTH_LONG).show();
    }
 }
