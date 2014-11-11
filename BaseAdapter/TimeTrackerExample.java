MainActivity.java

protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		ListView listView = (ListView)findViewById(R.id.times_list);
		timeTrackerAdapter = new TimeTrackerAdapter();
		listView.setAdapter(timeTrackerAdapter);
	}
	
	//--------------------------------------------------------------------------------------

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
//-----------------------------------------------------------------------------------------------
package com.example.listviewer;

import java.util.ArrayList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.BaseAdapter;
import android.widget.TextView;

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
	
