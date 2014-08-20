//lädt eine Activity mit Intent
//In der View (button) wurde ein Tag gesetzt und diese Infos können dann rausgelesen werden

b2 = (Button)findViewById(R.id.button2);
		b2.setTag("fuuu Bli$$ard");	
		Person p = new Person();
		p.name="aaaa";
		p.number=100000;
		b2.setTag(R.string.setTag_button2, p);
		

public void loadUIHelper(View v) {
	Intent intent = new Intent(this, UILayoutHelper.class);
	Person p = (Person) v.getTag(R.string.setTag_button2);

	Toast.makeText(getApplicationContext(), (String) v.getTag() + p.name,
			Toast.LENGTH_LONG).show();
	startActivity(intent);
}

public void sendMessage(View view){
	Intent intent = new Intent(this,SomeText.class);
	EditText editText = (EditText)findViewById(R.id.editText2);
	String message = editText.getText().toString();
	intent.putExtra(EXTRA_MESSAGE, message);
	startActivity(intent);
}
