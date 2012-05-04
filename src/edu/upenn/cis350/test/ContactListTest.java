package edu.upenn.cis350.test;

import edu.upenn.cis350.ContactList;
import edu.upenn.cis350.R;
import android.app.Activity;
import android.app.Instrumentation.ActivityMonitor;
import android.test.ActivityInstrumentationTestCase2;
import android.view.KeyEvent;
import android.widget.ListView;

public class ContactListTest extends ActivityInstrumentationTestCase2<ContactList>{

	private ContactList lActivity;
	private ListView lv;
	
	public ContactListTest() {
		super("edu.upenn.cis350", ContactList.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
        lActivity = this.getActivity();
        lv = lActivity.getListView();
	}
	
	public void testContactCount(){
		assertNotSame(0, lv.getChildCount()); // static header should make childCount >= 1
	}
	
	public void testEditProfile(){
		ActivityMonitor am = getInstrumentation().addMonitor(ContactList.class.getName(), null, false);
		getInstrumentation().sendKeyDownUpSync(KeyEvent.KEYCODE_MENU);
		getInstrumentation().invokeMenuActionSync(lActivity, R.id.refresh, 0);
		Activity a = getInstrumentation().waitForMonitorWithTimeout(am, 1000);
		assertEquals(true, getInstrumentation().checkMonitorHit(am, 1));
		a.finish();
	}
	
}
