// http://stackoverflow.com/questions/2736389/how-to-pass-object-from-one-activity-to-another-in-android

import import java.io.Serializable;
public class Customer implements Serializable
{
    private String name;
    private String city;

    public Customer()
    {

    }
    public Customer(String name, String city)
    {
        this.name= name;
        this.city=city;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getCity() 
    {
        return city;
    }
    public void setCity(String city) 
    {
        this.city= city;
    }

}
In your onCrate() method

@Override
protected void onCreate(Bundle savedInstanceState) 
{
    super.onCreate(savedInstanceState); 
    setContentView(R.layout.activity_top);

    Customer cust=new Customer();
    cust.setName("abc");
    cust.setCity("xyz");

    Intent intent=new Intent(abc.this,xyz.class);
    intent.putExtra("bundle",cust);
    startActivity(intent); 
}
In xyz activity class you neet to use following code:

Intent intent=getIntent();
Customer cust=(Customer)intent.getSerializableExtra("class");
textViewName.setText(cust.getName());
textViewCity.setText(cust.getCity());
