package edu.upenn.cis350.test;

import edu.upenn.cis350.Home;
import edu.upenn.cis350.R;
import android.app.LauncherActivity.ListItem;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.ListView;

public class HomeTest extends ActivityInstrumentationTestCase2<Home>{

	private Home hActivity;
	private ListView lv;
	
	public HomeTest() {
		super("edu.upenn.cis350", Home.class);
		// TODO Auto-generated constructor stub
	}

	public void setUp() throws Exception {
		super.setUp();
        hActivity = this.getActivity();
        lv = (ListView) hActivity.findViewById(R.id.homeList);
	}
	
	public void testChildNumber(){
		assertEquals(5, lv.getChildCount());
	}
	
	public void testNewEventClick(){
		String newEvent = (String)lv.getItemAtPosition(0);
		assertNotNull(newEvent);
		assertEquals("Create New Event", newEvent.toString());
	}
	
	public void testAgendaClick(){
		String agenda = (String)lv.getItemAtPosition(1);
		assertNotNull(agenda);
		assertEquals("Agenda", agenda.toString());
	}
	
	public void testContactsClick(){
		String contacts = (String)lv.getItemAtPosition(2);
		assertNotNull(contacts);
		assertEquals("Contacts", contacts.toString());
	}
	
	public void testNotificationsClick(){
		String notifications = (String)lv.getItemAtPosition(3);
		assertNotNull(notifications);
		assertEquals("Notifications", notifications.toString());
	}
	
	public void testLogoutClick(){
		String logout = (String)lv.getItemAtPosition(4);
		assertNotNull(logout);
		assertEquals("Logout", logout.toString());
	}
		
}
