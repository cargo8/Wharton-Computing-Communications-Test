package edu.upenn.cis350.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import edu.upenn.cis350.Login;
import edu.upenn.cis350.R;

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
	
	public void testRegister(){
		lActivity.runOnUiThread(new Runnable(){
			public void run(){
				Button register = (Button) lActivity.findViewById(R.id.registerButton);
				assertNotNull(register);
				assertTrue(register.performClick());
			}
		});
		getInstrumentation().waitForIdleSync();
	}
	
}
