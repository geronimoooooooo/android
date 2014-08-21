//myBluetoothAdapter.disable();
//Turn off the local Bluetooth adapter—do not use without explicit user action to turn off Bluetooth. 
//This gracefully shuts down all Bluetooth connections, stops Bluetooth system services, and powers down the underlying Bluetooth hardware. 

public void off(View view){
	  myBluetoothAdapter.disable();
	  text.setText("Status: Disconnected");
	  
      Toast.makeText(getApplicationContext(),"Bluetooth turned off",
    		  Toast.LENGTH_LONG).show();
   }
