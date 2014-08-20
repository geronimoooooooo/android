//popup_content.xml in layout abspeichern
//das Bild einfach ins drawable-hdpi reinziehen

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="@drawable/popup_bg">
    <TextView
        android:id="@+id/tvCaption"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_centerVertical="true"
        android:text="This is a popup222!"
        android:textAppearance="?android:attr/textAppearanceLarge"
        android:textColor="#ffffff" />
</RelativeLayout>

//aufrufen in
btn_popup.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
	displayPopupWindow(v);


private void displayPopupWindow(View anchorView) {
	    PopupWindow popup = new PopupWindow(Quizzer_MainActivity.this);
	    View layout = getLayoutInflater().inflate(R.layout.popup_content, null);
	    popup.setContentView(layout);
	    // Set content width and height
	    popup.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
	    popup.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
	    // Closes the popup window when touch outside of it - when looses focus
	    popup.setOutsideTouchable(true);
	    popup.setFocusable(true);
	    // Show anchored to button
	    popup.setBackgroundDrawable(new BitmapDrawable());
	    popup.showAsDropDown(anchorView);
	  }
