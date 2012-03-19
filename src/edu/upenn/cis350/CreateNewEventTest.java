package edu.upenn.cis350;
import edu.upenn.cis350.CreateNewEvent;
import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;


public class CreateNewEventTest extends ActivityInstrumentationTestCase2<CreateNewEvent> {

	public CreateNewEventTest() {
		super("edu.upenn.cis350", CreateNewEvent.class);
		// TODO Auto-generated constructor stub
	}
	
	private Button submitButton;
	private Activity activity;
	
	
	public void setUp() throws Exception{
		super.setUp();
		activity = getActivity();
		submitButton = (Button)activity.findViewById(R.id.eventButton);
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

}
