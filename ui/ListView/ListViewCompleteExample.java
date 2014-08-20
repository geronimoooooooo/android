
//in die onCreate
    ListView listView = (ListView)findViewById(R.id.times_list);
		timeTrackerAdapter = new TimeTrackerAdapter();
		listView.setAdapter(timeTrackerAdapter);
		
		
		public class TimeTrackerAdapter extends BaseAdapter {

	private ArrayList<TimeRecord> times = new ArrayList<TimeRecord>();
	
	public TimeTrackerAdapter(){
		times.add(new TimeRecord("38:23", "Feeling good!"));		
		times.add(new TimeRecord("38:53", "Feeling good!222"));
	}
	
	@Override
	public int getCount() {
	
		return times.size();
	}

	@Override
	public Object getItem(int position) {
	
		return getItem(position);
	}

	@Override
	public long getItemId(int position) {
		
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		if(convertView == null){
			LayoutInflater inflator = LayoutInflater.from(parent.getContext());
			convertView = inflator.inflate(R.layout.time_list_item, parent, false);
		}		
		TimeRecord  time = times.get(position); 
		TextView timeTextView =(TextView)convertView.findViewById(R.id.time_view);
		timeTextView.setText(time.getTime());
		
		TextView notesTextView = (TextView)convertView.findViewById(R.id.notes_view);
		notesTextView.setText(time.getNotes());
		
		return convertView;
	}

}

public class TimeRecord {
	public String time;
	public String notes;
	
	public TimeRecord(String time, String note){
		this.time = time;
		this.notes = note;
	}
	
	public String getTime(){return time;}
	public void setTime(String time){this.time = time;}
	public String getNotes(){return notes;}
	public void setNotes(String notes){this.notes=notes;}
	
}
//in time_list_item.xml im layout
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical" >
    
    <TextView android:id="@+id/time_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" 
        android:textSize="18sp"
        android:paddingBottom="5dp"
        />
    
    <TextView android:id="@+id/notes_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" 
        android:textSize="18sp"
        android:paddingBottom="12dp"
        />
    
</LinearLayout>

