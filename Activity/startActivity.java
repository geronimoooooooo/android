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
   intent.putExtra("MyString", editText1.getText().toString()); 
   startActivity(intent);


//Wenn man nicht mit dem Back-Button zur ersten Activity wieder zurück will
//finish() nutzen
  public void onClick(View v) {
   startActivity(new Intent(getApplicationContext(), ActivityTwo.class));
   finish();
  }
