package edu.upenn.cis350.test;

import edu.upenn.cis350.CreateNewEvent;
import edu.upenn.cis350.R;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

public class CreateNewEventTest extends ActivityInstrumentationTestCase2<CreateNewEvent> {

	private Button submitButton;
	private CreateNewEvent cActivity;
	private EditText eventTitle;
	private EditText eventDesc;
	
	public CreateNewEventTest() {
		super("edu.upenn.cis350", CreateNewEvent.class);
		// TODO Auto-generated constructor stub
	}

	public void setUp() throws Exception{
		super.setUp();
		cActivity = this.getActivity();
		submitButton = (Button) cActivity.findViewById(R.id.eventButton);
		eventTitle = (EditText) cActivity.findViewById(R.id.eventTitle);
		eventDesc = (EditText) cActivity.findViewById(R.id.eventDesc);
	}
	
	public void testSubmitEmpty(){
		cActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(submitButton);
//				assertTrue(submitButton.performClick());
			}
		});
		getInstrumentation().waitForIdleSync();
	}
	
	public void testSubmitFilled(){
		cActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(eventTitle);
				eventTitle.requestFocus();
			}
		});		
		sendKeys("T I T L E 1");
		assertEquals(eventTitle.getText().toString(), "title1");
		getInstrumentation().waitForIdleSync();
		cActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(eventDesc);
				eventDesc.requestFocus();
			}
		});		
		sendKeys("D E S C 1");
		assertEquals(eventDesc.getText().toString(), "desc1");
		getInstrumentation().waitForIdleSync();
		cActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(submitButton);
//				assertTrue(submitButton.performClick());
			}
		});
		getInstrumentation().waitForIdleSync();
	}

}
