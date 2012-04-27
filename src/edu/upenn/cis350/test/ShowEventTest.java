package edu.upenn.cis350.test;

import edu.upenn.cis350.ShowEvent;
import android.test.ActivityInstrumentationTestCase2;

public class ShowEventTest extends ActivityInstrumentationTestCase2<ShowEvent> {

	private ShowEvent sActivity;
	
	public ShowEventTest() {
		super("edu.upenn.cis350", ShowEvent.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        sActivity = this.getActivity();
	}
	
	public void testPostMessageClick(){
		sActivity.runOnUiThread(new Runnable(){
			public void run(){
				
			}
		});
		
		getInstrumentation().waitForIdleSync();
	}

	
}
