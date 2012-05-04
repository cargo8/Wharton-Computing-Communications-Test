package edu.upenn.cis350.test;

import edu.upenn.cis350.EditEvent;
import edu.upenn.cis350.R;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

public class EditEventTest extends ActivityInstrumentationTestCase2<EditEvent> {

	private EditEvent eActivity;
	private Button submitButton;
	private EditText eventTitle;
	private EditText eventDesc;
	
	public EditEventTest() {
		super("edu.upenn.cis350", EditEvent.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        eActivity = this.getActivity();
        submitButton = (Button) eActivity.findViewById(R.id.eventButton);
		eventTitle = (EditText) eActivity.findViewById(R.id.eventTitle);
		eventDesc = (EditText) eActivity.findViewById(R.id.eventDesc);
	}
	
	public void testSubmitEmpty(){
		eActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(submitButton);
			}
		});
		getInstrumentation().waitForIdleSync();
	}
	
	public void testSubmitFilled(){
		eActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(eventTitle);
				eventTitle.requestFocus();
			}
		});		
		sendKeys("T I T L E 1");
		assertEquals(eventTitle.getText().toString(), "title1");
		getInstrumentation().waitForIdleSync();
		eActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(eventDesc);
				eventDesc.requestFocus();
			}
		});		
		sendKeys("D E S C 1");
		assertEquals(eventDesc.getText().toString(), "desc1");
		getInstrumentation().waitForIdleSync();
		eActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(submitButton);
			}
		});
		getInstrumentation().waitForIdleSync();
	}


}
