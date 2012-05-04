package edu.upenn.cis350.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;
import android.widget.TextView;
import edu.upenn.cis350.ShowContact;
import edu.upenn.cis350.R;

public class ShowContactTest extends ActivityInstrumentationTestCase2<ShowContact> {

	private ShowContact sActivity;
	private ListView phones;
	private ListView emails;
	private TextView header;
	
	public ShowContactTest() {
		super("edu.upenn.cis350", ShowContact.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        sActivity = this.getActivity();
        phones = (ListView) sActivity.findViewById(R.id.phoneList);
        emails = (ListView) sActivity.findViewById(R.id.emailList);
	}
	
	public void testHeader(){
		header = (TextView) sActivity.findViewById(R.id.contactHeader);
		assertEquals("", header.getText().toString());
	}
	
	public void testPhoneList(){
		assertEquals(0, phones.getChildCount());
	}
	
	public void testEmailsList(){
		assertEquals(0, emails.getChildCount());
	}
	
	
	
}
