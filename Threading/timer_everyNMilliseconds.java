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
    timer.schedule(doAsynchronousTask, 1000, 5000); //1 sec delay und dann alle 5 sec
}
