package edu.upenn.cis350;

import edu.upenn.cis350.ContactList;
import android.test.ActivityInstrumentationTestCase2;

public class ContactListTest extends ActivityInstrumentationTestCase2<ContactList>{

	private ContactList lActivity;
	
	public ContactListTest() {
		super("edu.upenn.cis350", ContactList.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
        lActivity = this.getActivity();
	}
		
	
		
}
