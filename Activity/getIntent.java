//nachdem die Activity aus einer anderen gestartet wurde
public final static String EXTRA_MESSAGE ="my extra message!";

public void sendMessage(View view){
		Intent intent = new Intent(this,SomeText.class);
		EditText editText = (EditText)findViewById(R.id.editText2);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}
	
      Intent intent = getIntent();
	    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
	    String message2 = intent.getStringExtra("MyString");
	    System.out.println(message);
	    
	    
