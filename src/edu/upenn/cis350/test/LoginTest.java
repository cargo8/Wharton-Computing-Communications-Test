package edu.upenn.cis350.test;

import edu.upenn.cis350.Login;
import android.test.ActivityInstrumentationTestCase2;

public class LoginTest extends ActivityInstrumentationTestCase2<Login> {

	private Login lActivity;
	
	public LoginTest() {
		super("edu.upenn.cis350", Login.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        lActivity = this.getActivity();
	}
	
}
