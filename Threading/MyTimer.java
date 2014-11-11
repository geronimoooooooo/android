public int counter =0;
	
	public void start(){
		final Handler handler = new Handler();
		Timer timer = new Timer();
		    TimerTask doAsynchronousTask = new TimerTask() {       
		        @Override
		        public void run() {
		            handler.post(new Runnable() {
		                @SuppressWarnings("unchecked")
		                public void run() { 
		                   try {
//		                	   tv = (TextView)findViewById(R.id.textView1);
//		                	   tv.setText(counter);
		                	   counter++;
		                	   System.out.println(counter);
		                        Toast.makeText(getApplicationContext(),"abcv: "+  counter, Toast.LENGTH_SHORT).show();
		                       }
		                 catch (Exception e) {
		                        // TODO Auto-generated catch block
		                    }
		                }
		            });
		        }
		    };
		    timer.schedule(doAsynchronousTask, 1000, 5000); 
		    
	}
	
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
