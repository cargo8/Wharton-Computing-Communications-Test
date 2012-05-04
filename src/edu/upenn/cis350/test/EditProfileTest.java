package edu.upenn.cis350.test;

import edu.upenn.cis350.EditProfile;
import edu.upenn.cis350.R;
import edu.upenn.cis350.Register;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

public class EditProfileTest extends ActivityInstrumentationTestCase2<EditProfile> {

	private EditProfile eActivity;
	private EditText username;
	private EditText password;
	private EditText first;
	private EditText last;
	private EditText confirm;
	private EditText email;
	private EditText phone;
	private Button saveChanges;
	
	public EditProfileTest() {
		super("edu.upenn.cis350", EditProfile.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        eActivity = this.getActivity();
        username = (EditText) eActivity.findViewById(R.id.loginUsername);
		password = (EditText) eActivity.findViewById(R.id.loginPassword);
		confirm = (EditText) eActivity.findViewById(R.id.loginPassword2);
		first = (EditText) eActivity.findViewById(R.id.registerFname);
		last = (EditText) eActivity.findViewById(R.id.registerLname);
		email = (EditText) eActivity.findViewById(R.id.registerEmail1);
		phone = (EditText) eActivity.findViewById(R.id.registerPhone1);
		saveChanges = (Button) eActivity.findViewById(R.id.saveChangesButton);
	}
	
	public void testRegister(){
		eActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(username);
				username.requestFocus();
			}
		});
		assertNotSame("", username.getText().toString());
		getInstrumentation().waitForIdleSync();
		eActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(password);
				password.requestFocus();
			}
		});
		sendKeys("T E S T");
		getInstrumentation().waitForIdleSync();
		eActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(confirm);
				confirm.requestFocus();
			}
		});
		sendKeys("T E S T 2");
		getInstrumentation().waitForIdleSync();
		assertNotSame(confirm.getText().toString(), password.getText().toString());
		eActivity.runOnUiThread(new Runnable(){
			public void run(){
				confirm.setText(""); // reset confirmation
				confirm.requestFocus();
			}
		});
		sendKeys("T E S T");
		getInstrumentation().waitForIdleSync();
		assertEquals(confirm.getText().toString(), password.getText().toString());
		eActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(first);
				first.requestFocus();
			}
		});
		assertNotSame("", first.getText().toString());
		getInstrumentation().waitForIdleSync();
		eActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(last);
				last.requestFocus();
			}
		});
		assertNotSame("", last.getText().toString());
		getInstrumentation().waitForIdleSync();
		eActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(email);
				email.requestFocus();
			}
		});
		getInstrumentation().waitForIdleSync();
		eActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(phone);
				phone.requestFocus();
			}
		});
		getInstrumentation().waitForIdleSync();
		eActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(saveChanges);
				assertTrue(saveChanges.performClick());
			}
		});
		getInstrumentation().waitForIdleSync();
	}

}
