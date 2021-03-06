package edu.upenn.cis350.test;

import edu.upenn.cis350.EditProfile;
import edu.upenn.cis350.Home;
import edu.upenn.cis350.ManageGroups;
import edu.upenn.cis350.R;
import android.app.Activity;
import android.app.Instrumentation.ActivityMonitor;
import android.test.ActivityInstrumentationTestCase2;
import android.view.KeyEvent;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HomeTest extends ActivityInstrumentationTestCase2<Home>{

	private Home hActivity;
	private ListView lv;
	private ListAdapter adapter;
	
	public HomeTest() {
		super("edu.upenn.cis350", Home.class);
		// TODO Auto-generated constructor stub
	}

	public void setUp() throws Exception {
		super.setUp();
        hActivity = this.getActivity();
        lv = (ListView) hActivity.findViewById(R.id.homeList);
        adapter = lv.getAdapter();
	}
	
	public void testChildNumber(){
		assertEquals(5, lv.getChildCount());
	}
	
	public void testAdapter(){
		assertEquals(5, adapter.getCount());
	}
	
	public void testNewEventItem(){
		String newEvent = (String)lv.getItemAtPosition(0);
		assertNotNull(newEvent);
		assertEquals("Create New Event", newEvent.toString());
	}
	
	public void testAgendaItem(){
		String agenda = (String)lv.getItemAtPosition(1);
		assertNotNull(agenda);
		assertEquals("Agenda", agenda.toString());
	}
	
	public void testContactsItem(){
		String contacts = (String)lv.getItemAtPosition(2);
		assertNotNull(contacts);
		assertEquals("Contacts", contacts.toString());
	}
	
	public void testNotificationsItem(){
		String notifications = (String)lv.getItemAtPosition(3);
		assertNotNull(notifications);
		assertEquals("Notifications", notifications.toString());
	}
	
	public void testLogoutItem(){
		String logout = (String)lv.getItemAtPosition(4);
		assertNotNull(logout);
		assertEquals("Logout", logout.toString());
	}
	
	public void testManageGroups(){
		ActivityMonitor am = getInstrumentation().addMonitor(ManageGroups.class.getName(), null, false);
		getInstrumentation().sendKeyDownUpSync(KeyEvent.KEYCODE_MENU);
		getInstrumentation().invokeMenuActionSync(hActivity, R.id.manageGroups, 0);
		Activity a = getInstrumentation().waitForMonitorWithTimeout(am, 1000);
		assertEquals(true, getInstrumentation().checkMonitorHit(am, 1));
		a.finish();
	}
	
	public void testEditProfile(){
		ActivityMonitor am = getInstrumentation().addMonitor(EditProfile.class.getName(), null, false);
		getInstrumentation().sendKeyDownUpSync(KeyEvent.KEYCODE_MENU);
		getInstrumentation().invokeMenuActionSync(hActivity, R.id.editProfile, 0);
		Activity a = getInstrumentation().waitForMonitorWithTimeout(am, 1000);
		assertEquals(true, getInstrumentation().checkMonitorHit(am, 1));
		a.finish();
	}
		
}
