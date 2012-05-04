package edu.upenn.cis350.test;

import edu.upenn.cis350.Agenda;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.ListView;
import edu.upenn.cis350.R;

public class AgendaTest extends ActivityInstrumentationTestCase2<Agenda> {

	private Agenda aActivity;
	private ListView lv; 
	
	public AgendaTest() {
		super("edu.upenn.cis350", Agenda.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
        super.setUp();
        aActivity = this.getActivity();
        lv = (ListView) aActivity.findViewById(R.id.eventList);
    }
	
	public void testEventClick(){
		aActivity.runOnUiThread(new Runnable(){
			public void run(){
				
			}
		});
		
		getInstrumentation().waitForIdleSync();
	}
	
	
	
}
