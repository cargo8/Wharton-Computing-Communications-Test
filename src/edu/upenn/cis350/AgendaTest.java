package edu.upenn.cis350;

import edu.upenn.cis350.Agenda;
import android.test.ActivityInstrumentationTestCase2;
import android.view.Menu;

public class AgendaTest extends ActivityInstrumentationTestCase2<Agenda> {

	private Agenda aActivity;
	private Menu menu;
	
	public AgendaTest() {
		super("edu.upenn.cis350", Agenda.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
        super.setUp();
        aActivity = this.getActivity();
    }
	
	
	
}
