package edu.upenn.cis350.test;

import com.parse.ParseQuery;

import edu.upenn.cis350.Agenda;
import edu.upenn.cis350.EditProfile;
import edu.upenn.cis350.ManageGroups;
import edu.upenn.cis350.Agenda.*;
import android.app.Activity;
import android.app.Instrumentation.ActivityMonitor;
import android.test.ActivityInstrumentationTestCase2;
import android.view.KeyEvent;
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
	
	public void testGetQuery(){
		ParseQuery pq = aActivity.getQuery(Filter.ALL);
		assertNotNull(pq);
	}
	
	public void testRefresh(){
		ActivityMonitor am = getInstrumentation().addMonitor(Agenda.class.getName(), null, false);
		getInstrumentation().sendKeyDownUpSync(KeyEvent.KEYCODE_MENU);
		getInstrumentation().invokeMenuActionSync(aActivity, R.id.refreshAgenda, 0);
		Activity a = getInstrumentation().waitForMonitorWithTimeout(am, 1000);
		assertEquals(true, getInstrumentation().checkMonitorHit(am, 1));
		a.finish();
	}
	
	public void testShowAll(){
		ActivityMonitor am = getInstrumentation().addMonitor(Agenda.class.getName(), null, false);
		getInstrumentation().sendKeyDownUpSync(KeyEvent.KEYCODE_MENU);
		getInstrumentation().invokeMenuActionSync(aActivity, R.id.showAllEvents, 0);
		Activity a = getInstrumentation().waitForMonitorWithTimeout(am, 1000);
		assertEquals(true, getInstrumentation().checkMonitorHit(am, 1));
		a.finish();
	}
	
	public void testShowPastWeek(){
		ActivityMonitor am = getInstrumentation().addMonitor(Agenda.class.getName(), null, false);
		getInstrumentation().sendKeyDownUpSync(KeyEvent.KEYCODE_MENU);
		getInstrumentation().invokeMenuActionSync(aActivity, R.id.showOneWeekOldEvents, 0);
		Activity a = getInstrumentation().waitForMonitorWithTimeout(am, 1000);
		assertEquals(true, getInstrumentation().checkMonitorHit(am, 1));
		a.finish();
	}
	
	
}
