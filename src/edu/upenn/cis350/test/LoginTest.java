package edu.upenn.cis350.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import edu.upenn.cis350.Login;
import edu.upenn.cis350.R;

public class LoginTest extends ActivityInstrumentationTestCase2<Login> {

	private Login lActivity;
	private Button login;
	private EditText username;
	private EditText password;
	
	public LoginTest() {
		super("edu.upenn.cis350", Login.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        lActivity = this.getActivity();
        login = (Button) lActivity.findViewById(R.id.loginButton);
        username = (EditText) lActivity.findViewById(R.id.loginUsername);
        password = (EditText) lActivity.findViewById(R.id.loginPassword);
	}
	
	public void testRegister(){
		lActivity.runOnUiThread(new Runnable(){
			public void run(){
				Button register = (Button) lActivity.findViewById(R.id.registerButton);
				assertNotNull(register);
				assertTrue(register.performClick());
			}
		});
		getInstrumentation().waitForIdleSync();
	}
	
	public void testLoginBlank(){
		lActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(login);
				assertTrue(login.performClick());
			}
		});
		getInstrumentation().waitForIdleSync();
	}
	
	public void testLoginTestUser(){
		lActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(username);
				username.requestFocus();
			}
		});
		sendKeys("T E S T");
		getInstrumentation().waitForIdleSync();
		assertEquals("test", username.getText().toString());
		lActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(password);
				password.requestFocus();
			}
		});
		sendKeys("T E S T");
		getInstrumentation().waitForIdleSync();
		assertEquals("test", password.getText().toString());
		lActivity.runOnUiThread(new Runnable(){
			public void run(){
				assertNotNull(login.performClick());
				assertTrue(login.performClick());
			}
		});
		getInstrumentation().waitForIdleSync();
	}
	
}
