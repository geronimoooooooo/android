/popup_menu.xml in menu abspeichern

<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item  
        android:id="@+id/menu1"  
        android:icon="@drawable/ic_launcher"
        android:title="@string/str_menu1"/>  
    <item  
        android:id="@+id/menu2"  
        android:title="@string/str_menu2"/>  
</menu>  


butPopup.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
	
		PopupMenu popup = new PopupMenu(Quizzer_MainActivity.this, butPopup);
		popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
		Toast.makeText(getApplicationContext(), "popup", Toast.LENGTH_SHORT).show();
		
		popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
			
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				Toast.makeText(getApplicationContext(), "Clicked: "+item.getTitle(), Toast.LENGTH_SHORT).show();
				return true;
			}
		});
		popup.show();
	}
});
