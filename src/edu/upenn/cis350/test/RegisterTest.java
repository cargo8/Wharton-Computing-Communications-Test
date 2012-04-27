package edu.upenn.cis350.test;

import edu.upenn.cis350.Register;
import android.test.ActivityInstrumentationTestCase2;

public class RegisterTest extends ActivityInstrumentationTestCase2<Register> {

	private Register rActivity;
	
	public RegisterTest() {
		super("edu.upenn.cis350", Register.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        rActivity = this.getActivity();
	}
	
}
