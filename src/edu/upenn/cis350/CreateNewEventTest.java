package edu.upenn.cis350;
import edu.upenn.cis350.CreateNewEvent;
import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class CreateNewEventTest extends ActivityInstrumentationTestCase2<CreateNewEvent> {

	public CreateNewEventTest() {
		super("edu.upenn.cis350", CreateNewEvent.class);
		// TODO Auto-generated constructor stub
	}
	
	private Button submitButton;
	private Activity activity;
	private EditText eventTitle;
	private EditText eventDesc;
	private EditText eventActions;
	private Button startDate;
	private Button endDate;
	private Spinner contact1;
	private Spinner contact2;
	
	
	public void setUp() throws Exception{
		super.setUp();
		activity = getActivity();
		submitButton = (Button)activity.findViewById(R.id.eventButton);
		eventTitle = (EditText)activity.findViewById(R.id.eventTitle);
		eventDesc = (EditText)activity.findViewById(R.id.eventDesc);
		eventActions = (EditText)activity.findViewById(R.id.eventActions);
		startDate = (Button)activity.findViewById(R.id.pickStartDate);
		endDate = (Button)activity.findViewById(R.id.pickEndDate);
		contact1 = (Spinner)activity.findViewById(R.id.personSpinner1);
		contact2 = (Spinner)activity.findViewById(R.id.personSpinner2);
	}
	
	public void testSubmitEmpty(){
		
		activity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(submitButton);
				boolean result = submitButton.performClick();
				assertTrue(result);
			}
		});
		
	}
	
	public void testSubmitFilled(){
		
		assertNotNull(eventTitle);
		eventTitle.requestFocus();
		sendKeys("T I T L E 1");
		assertEquals(eventTitle.getText().toString(), "title1");
		assertNotNull(eventDesc);
		eventDesc.requestFocus();
		sendKeys("D E S C 1");
		assertEquals(eventDesc.getText().toString(), "desc1");
		assertNotNull(eventActions);
		eventActions.requestFocus();
		sendKeys("A C T I O N S 1");
		assertEquals(eventActions.getText().toString(), "actions1");

		
		
		activity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(contact1);
				contact1.requestFocus();
				contact1.setSelection(1);
				assertEquals(contact1.getSelectedItem().toString(), "Contact 2");
				assertNotNull(submitButton);
				boolean result = submitButton.performClick();
				assertTrue(result);
			}
		});
		
		getInstrumentation().waitForIdleSync();
		
		
	}

}
