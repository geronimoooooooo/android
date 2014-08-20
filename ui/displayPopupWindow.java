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
