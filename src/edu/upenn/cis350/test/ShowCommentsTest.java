package edu.upenn.cis350.test;
import edu.upenn.cis350.R;
import edu.upenn.cis350.ShowMessage;
import edu.upenn.cis350.R.id;
import android.app.Activity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class ShowCommentsTest extends ActivityInstrumentationTestCase2<ShowMessage> {

	public ShowCommentsTest() {
		super("edu.upenn.cis350", ShowMessage.class);
	}
	
	private Button postCommentButton;
	private Activity cActivity;
	private EditText commentText;	
	
	public void setUp() throws Exception{
		super.setUp();
		cActivity = this.getActivity();
		postCommentButton = (Button) cActivity.findViewById(R.id.newCommentButton);
		commentText = (EditText) cActivity.findViewById(R.id.newCommentText);
	}
	
	public void testSubmitEmpty(){
		cActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(postCommentButton);
				boolean result = postCommentButton.performClick();
				assertTrue(result);
			}
		});
		getInstrumentation().waitForIdleSync();
	}
	
	public void testSubmitFilled(){
		
		cActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(commentText);
				commentText.requestFocus();
			}
		});
		
		getInstrumentation().waitForIdleSync();
		sendKeys("N E W C O M M E N T");
		assertEquals(commentText.getText().toString(), "newcomment");
		
		cActivity.runOnUiThread(new Runnable() {
			public void run() {
				assertNotNull(postCommentButton);
				boolean result = postCommentButton.performClick();
				assertTrue(result);
			}
		});
		
		getInstrumentation().waitForIdleSync();
		
	}

}
