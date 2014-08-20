		but1 = (Button)findViewById(R.id.button1);
		but1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				System.out.println("0asdfafasdf");
				RadioButton r1 = (RadioButton)findViewById(R.id.radio1);
				r1.setText("radio1");
				RadioButton r2 = (RadioButton)findViewById(R.id.radio2);
				r2.setText("r2");
				r2.setTag("true");
			}
		});
		
		bCheck = (Button)findViewById(R.id.button2);
		bCheck.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup1);
				int checkedRadioID = rg.getCheckedRadioButtonId();
				RadioButton checkedRb = (RadioButton)findViewById(checkedRadioID);
				
				System.out.println("das ist checkedRadioID: "+checkedRadioID +": "+R.id.radio0);
				switch (checkedRadioID) {
				case R.id.radio0: System.out.println("b0");
					break;
				case R.id.radio1:  System.out.println("b1");
					break;
				case R.id.radio2:  System.out.println("b2"); 
								if(checkedRb.getTag().toString().equals("true")){
									Toast.makeText(getApplicationContext(), "Das ist richtig!" + checkedRb.getTag().toString(), Toast.LENGTH_SHORT).show();
								}
					break;
				default:
					break;
				}
				
			}
		});
	}
