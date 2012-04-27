package edu.upenn.cis350.test;

import edu.upenn.cis350.Home;
import android.test.ActivityInstrumentationTestCase2;

public class HomeTest extends ActivityInstrumentationTestCase2<Home>{

	private Home hActivity;
	
	public HomeTest() {
		super("edu.upenn.cis350", Home.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
        hActivity = this.getActivity();
	}
	
		
}
