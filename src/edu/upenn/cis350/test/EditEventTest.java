package edu.upenn.cis350.test;

import edu.upenn.cis350.EditEvent;
import android.test.ActivityInstrumentationTestCase2;

public class EditEventTest extends ActivityInstrumentationTestCase2<EditEvent> {

	private EditEvent eActivity;
	
	public EditEventTest() {
		super("edu.upenn.cis350", EditEvent.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        eActivity = this.getActivity();
	}

}
