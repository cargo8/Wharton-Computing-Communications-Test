package edu.upenn.cis350.test;

import android.os.Handler;
import android.os.Looper;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import edu.upenn.cis350.ShowNotifications;
import edu.upenn.cis350.R;

public class ShowNotificationsTest extends ActivityInstrumentationTestCase2<ShowNotifications> {

	private ShowNotifications sActivity;
//	private ListView lv;
//	private ListAdapter adapter;
	private TextView tv;
	
	public ShowNotificationsTest() {
		super("edu.upenn.cis350", ShowNotifications.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
        sActivity = this.getActivity();
//        lv = sActivity.getListView();
//        adapter = lv.getAdapter();
        tv = (TextView) sActivity.findViewById(R.id.notificationText);
	}
	
	public void testNotificationCount(){
//		assertNotSame(2, adapter.getViewTypeCount());
	}
	
	public void testText(){
		assertNull(tv); // implies notifications are empty
	}
}
