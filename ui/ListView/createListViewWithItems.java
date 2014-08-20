//erstellt eine listview und füllt diese mit paar Items

	public void createItem(View v){
//		Toast.makeText(getApplicationContext(), "This is button createItem", Toast.LENGTH_SHORT).show();
		
		mListView = (ListView)findViewById(R.id.listView1);
		mArray = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
				
		mArray.add("item1");
		mArray.add("item2");
		mArray.addAll("item3","item4");
		mListView.setAdapter(mArray);
		
		b2 = (Button)findViewById(R.id.button2);
		b2.setTag("fuuu Bli$$ard");	
		Person p = new Person();
		p.name="aaaa";
		p.number=100000;
		b2.setTag(R.string.setTag_button2, p);
		
		//b2.setTag("thisis B2");
	}
	
	    <ListView
        android:id="@+id/listView1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/textView1"
        android:layout_below="@+id/button1"
        android:layout_marginTop="31dp" >
    </ListView>
