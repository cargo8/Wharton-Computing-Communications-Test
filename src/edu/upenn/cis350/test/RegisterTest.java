package edu.upenn.cis350.test;

import edu.upenn.cis350.R;
import edu.upenn.cis350.Register;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

public class RegisterTest extends ActivityInstrumentationTestCase2<Register> {

	private Register rActivity;
	private EditText username;
	private EditText password;
	private EditText first;
	private EditText last;
	private EditText confirm;
	private EditText email;
	private EditText phone;
	private Button accessRequest;
	
	public RegisterTest() {
		super("edu.upenn.cis350", Register.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        rActivity = this.getActivity();
        username = (EditText) rActivity.findViewById(R.id.loginUsername);
		password = (EditText) rActivity.findViewById(R.id.loginPassword);
		confirm = (EditText) rActivity.findViewById(R.id.loginPassword2);
		first = (EditText) rActivity.findViewById(R.id.registerFname);
		last = (EditText) rActivity.findViewById(R.id.registerLname);
		email = (EditText) rActivity.findViewById(R.id.registerEmail1);
		phone = (EditText) rActivity.findViewById(R.id.registerPhone1);
		accessRequest = (Button) rActivity.findViewById(R.id.requestAccess);
	}
	
	public void testRegisterBlank(){
		rActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(accessRequest);
				assertTrue(accessRequest.performClick());
			}
		});
		getInstrumentation().waitForIdleSync();
	}
	
	public void testRegister(){
		rActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(username);
				username.requestFocus();
			}
		});
		sendKeys("T E S T");
		assertEquals("test", username.getText().toString());
		getInstrumentation().waitForIdleSync();
		rActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(password);
				password.requestFocus();
			}
		});
		sendKeys("T E S T");
		getInstrumentation().waitForIdleSync();
		rActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(confirm);
				confirm.requestFocus();
			}
		});
		sendKeys("T E S T 2"); // password and confirmation are different initially
		getInstrumentation().waitForIdleSync();
		assertNotSame(confirm.getText().toString(), password.getText().toString());
		rActivity.runOnUiThread(new Runnable(){
			public void run(){
				confirm.setText(""); // reset confirmation
				confirm.requestFocus();
			}
		});
		sendKeys("T E S T"); // password and confirmation are same now
		getInstrumentation().waitForIdleSync();
		assertEquals(confirm.getText().toString(), password.getText().toString());
		rActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(first);
				first.requestFocus();
			}
		});
		sendKeys("F I R S T");
		getInstrumentation().waitForIdleSync();
		assertEquals("first", first.getText().toString());
		rActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(last);
				last.requestFocus();
			}
		});
		sendKeys("L A S T");
		getInstrumentation().waitForIdleSync();
		assertEquals("last", last.getText().toString());
		rActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(email);
				email.requestFocus();
			}
		});
		sendKeys("T E S T AT T E S T PERIOD C O M");
		getInstrumentation().waitForIdleSync();
		assertEquals("test@test.com", email.getText().toString());
		rActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(phone);
				phone.requestFocus();
			}
		});
		sendKeys("1 2 3 MINUS 4 5 6 MINUS 7 8 9 0");
		getInstrumentation().waitForIdleSync();
		assertEquals("123-456-7890", phone.getText().toString());
		rActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(accessRequest);
				assertTrue(accessRequest.performClick());
			}
		});
		getInstrumentation().waitForIdleSync();
	}
	
}
