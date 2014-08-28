Toast toast = Toast.makeText(this, "Bluetooth is active.", Toast.LENGTH_SHORT);
TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
v.setTextColor(Color.GREEN);
toast.show();	

toast.getView().setBackgroundColor(Color.BLUE);
