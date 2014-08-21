 private Set<BluetoothDevice> pairedDevices;
 pairedDevices = myBluetoothAdapter.getBondedDevices();
      
    // put it's one to the adapter
    for(BluetoothDevice device : pairedDevices)
  	  BTArrayAdapter.add(device.getName()+ "\n" + device.getAddress());
