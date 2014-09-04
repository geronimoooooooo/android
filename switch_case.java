 @Override
   public void onClick(View v) {
   Intent i; 
   switch (v.getId()){
   case R.id.playBtn :
    List<question> questions = getQuestionSetFromDb();
  
    GamePlay c = new GamePlay();
    c.setQuestions(questions);
    c.setNumRounds(getNumQuestions());
    ((ChuckApplication)getApplication()).setCurrentGame(c);  
  
     //Start Game Now.. //
     i = new Intent(this, QuestionActivity.class);
     startActivityForResult(i, Constants.PLAYBUTTON);
    break;
   
 case R.id.rulesBtn :
  i = new Intent(this, RulesActivity.class);
  startActivityForResult(i, Constants.RULESBUTTON);
  break;
    
  case R.id.settingsBtn :
  i = new Intent(this, SettingsActivity.class);
  startActivityForResult(i, Constants.SETTINGSBUTTON);
  break;
  
 case R.id.exitBtn :
  finish();
  break;
 }
 }
