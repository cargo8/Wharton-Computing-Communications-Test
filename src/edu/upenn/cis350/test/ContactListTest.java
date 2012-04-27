package edu.upenn.cis350.test;

import edu.upenn.cis350.ContactList;
import android.test.ActivityInstrumentationTestCase2;
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
	}
	
	public void testContactClick(){
		lActivity.runOnUiThread(new Runnable(){
			public void run(){
				
			}
		});
		
		getInstrumentation().waitForIdleSync();
	}

	
		
}
