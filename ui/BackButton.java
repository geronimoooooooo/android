Go ahead and add this to your ActivityTwo from the last day’s code.  Now when you press back, you will first go through this method.  As is, nothing different will happen.  If you comment out the super.onBackPressed() method and then rerun your application, hitting the back button won’t do anything.  You won’t return to the first activity, you won’t back out of the application.  Nothing.  If you wanted to prevent a user from backing out of your application, this is how you could do it. 

@Override
public void onBackPressed() {
    // TODO Auto-generated method stub
    super.onBackPressed();
}
