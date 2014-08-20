btn_blu_check = (Button)findViewById(R.id.btn_blu_check);
btn_blu_check.setOnClickListener(new OnClickListener() {
			
	@Override
	public void onClick(View v) {
		Toast.makeText(getApplicationContext(), "this is btn bluetooth check: " + h.checkForBluetooth(), Toast.LENGTH_SHORT).show();				
		}
	});
}
