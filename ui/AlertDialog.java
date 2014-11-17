AlertDialog.Builder builder = new AlertDialog.Builder(Bosses.this);
builder.setMessage(
    "Please create a HashMap as the first step \nand wait for GPS signal!")
    .setCancelable(false)
    .setPositiveButton("OK",
            new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // do things
                }
            });
AlertDialog alert = builder.create();
alert.show();
