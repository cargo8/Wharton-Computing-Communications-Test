package edu.upenn.cis350;

import edu.upenn.cis350.EditProfile;
import android.test.ActivityInstrumentationTestCase2;

public class EditProfileTest extends ActivityInstrumentationTestCase2<EditProfile> {

	private EditProfile eActivity;
	
	public EditProfileTest() {
		super("edu.upenn.cis350", EditProfile.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        eActivity = this.getActivity();
	}

}
