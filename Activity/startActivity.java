 //In einer button onClickListenerMethode
 
  Intent intent = new Intent(getApplicationContext(), DisplayText.class);
  et1 =(EditText)findViewById(R.id.editText1);
  String message = et1.getText().toString();
  intent.putExtra(EXTRA_MESSAGE, message);
  startActivity(intent);
  
  //ansonsten
  
   Intent intent = new Intent(this, DisplayGodzilla.class);
   EditText editText = (EditText) findViewById(R.id.edit_message);
   String message = editText.getText().toString();
   intent.putExtra(EXTRA_MESSAGE, message);
   startActivity(intent);
