package edu.upenn.cis350.test;

import edu.upenn.cis350.CreateNewEvent;
import edu.upenn.cis350.R;
import edu.upenn.cis350.R.id;
import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class CreateNewEventTest extends ActivityInstrumentationTestCase2<CreateNewEvent> {

	private Button submitButton;
	private CreateNewEvent cActivity;
	private EditText eventTitle;
	private EditText eventDesc;
	private EditText eventActions;
	private Button startDate;
	private Button endDate;
	private Spinner contact1;
	private Spinner contact2;
	
	public CreateNewEventTest() {
		super("edu.upenn.cis350", CreateNewEvent.class);
		// TODO Auto-generated constructor stub
	}

	public void setUp() throws Exception{
		super.setUp();
		cActivity = this.getActivity();
		submitButton = (Button)cActivity.findViewById(R.id.eventButton);
		eventTitle = (EditText)cActivity.findViewById(R.id.eventTitle);
		eventDesc = (EditText)cActivity.findViewById(R.id.eventDesc);
		startDate = (Button)cActivity.findViewById(R.id.pickStartDate);
		endDate = (Button)cActivity.findViewById(R.id.pickEndDate);
		contact1 = (Spinner)cActivity.findViewById(R.id.personSpinner1);
		contact2 = (Spinner)cActivity.findViewById(R.id.personSpinner2);
	}
	
	public void testPopulateSpinners(){
		// method is private
	}
	
	
	
	public void testSubmitEmpty(){
		cActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(submitButton);
				boolean result = submitButton.performClick();
				assertTrue(result);
			}
		});
	}
	
	public void testSubmitFilled(){
		
		cActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(eventTitle);
				eventTitle.requestFocus();
			}
		});		
		getInstrumentation().waitForIdleSync();
		sendKeys("T I T L E 1");
		assertEquals(eventTitle.getText().toString(), "title1");
		cActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(eventDesc);
				eventDesc.requestFocus();
			}
		});		
		getInstrumentation().waitForIdleSync();
		sendKeys("D E S C 1");
		assertEquals(eventDesc.getText().toString(), "desc1");		
		cActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(eventActions);
				eventActions.requestFocus();
			}
		});
		getInstrumentation().waitForIdleSync();
		sendKeys("A C T I O N S 1");
		assertEquals(eventActions.getText().toString(), "actions1");
		cActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(contact1);
				contact1.requestFocus();
				contact1.setSelection(1);
			}
		});
		getInstrumentation().waitForIdleSync();
		assertEquals(contact1.getSelectedItem().toString(), "Person 2");
		cActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(contact2);
				contact2.requestFocus();
				contact2.setSelection(3);
			}
		});
		getInstrumentation().waitForIdleSync();
		assertEquals(contact2.getSelectedItem().toString(), "Person 4");

		cActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(submitButton);
				boolean result = submitButton.performClick();
				assertTrue(result);
			}
		});
		getInstrumentation().waitForIdleSync();
		
	}

}
