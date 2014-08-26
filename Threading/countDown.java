public void countDown(){
		new CountDownTimer(30000, 1000) {

		     public void onTick(long millisUntilFinished) {
		         tv.setText("seconds remaining: " + millisUntilFinished / 1000);
		     }

		     public void onFinish() {
		         tv.setText("done!");
		     }
		  }.start();
	}
