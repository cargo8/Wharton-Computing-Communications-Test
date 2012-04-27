package edu.upenn.cis350.test;

import edu.upenn.cis350.ShowMessage;
import android.test.ActivityInstrumentationTestCase2;

public class ShowMessageTest extends ActivityInstrumentationTestCase2<ShowMessage> {

	private ShowMessage sActivity;
	
	public ShowMessageTest() {
		super("edu.upenn.cis350", ShowMessage.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        sActivity = this.getActivity();
	}
	
}
