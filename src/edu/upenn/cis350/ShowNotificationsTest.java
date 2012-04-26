package edu.upenn.cis350;

import edu.upenn.cis350.ShowNotifications;
import android.test.ActivityInstrumentationTestCase2;

public class ShowNotificationsTest extends ActivityInstrumentationTestCase2<ShowNotifications> {

	private ShowNotifications sActivity;
	
	public ShowNotificationsTest() {
		super("edu.upenn.cis350", ShowNotifications.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        sActivity = this.getActivity();
	}
	
}
