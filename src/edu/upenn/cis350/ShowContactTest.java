package edu.upenn.cis350;

import edu.upenn.cis350.ShowContact;
import android.test.ActivityInstrumentationTestCase2;

public class ShowContactTest extends ActivityInstrumentationTestCase2<ShowContact> {

	private ShowContact sActivity;
	
	public ShowContactTest() {
		super("edu.upenn.cis350", ShowContact.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        sActivity = this.getActivity();
	}
	
}
