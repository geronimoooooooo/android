	public final int REQUEST_ENABLE_BT= 1;
	Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);

public boolean checkForBluetooth(){
	boolean bluetoothSupportedFromDevice= true;
	
	BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
	if (mBluetoothAdapter == null) {
		bluetoothSupportedFromDevice = false;
		return bluetoothSupportedFromDevice;
	}
	
	if(!mBluetoothAdapter.isEnabled()){
		Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
	//    startActivityForResult(cameraIntent, REQUEST_ENABLE_BT);
	}
	return bluetoothSupportedFromDevice;
}

   private BluetoothAdapter myBluetoothAdapter;
   private Set<BluetoothDevice> pairedDevices;
	pairedDevices = myBluetoothAdapter.getBondedDevices();
