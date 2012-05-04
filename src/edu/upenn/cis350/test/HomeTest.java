package edu.upenn.cis350.test;

import edu.upenn.cis350.Home;
import edu.upenn.cis350.R;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;

public class HomeTest extends ActivityInstrumentationTestCase2<Home>{

	private Home hActivity;
	private ListView lv = (ListView) hActivity.findViewById(edu.upenn.cis350.R.id.homeList);
	
	public HomeTest() {
		super("edu.upenn.cis350", Home.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
        hActivity = this.getActivity();
        lv = (ListView) hActivity.findViewById(R.id.homeList);
	}
	
	public void testChildNumber(){
//		assertEquals(6, lv.getChildCount());
	}
	
		
}
