package dp;

import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Client{

	private long interval = 5000;//5 seconds
	private Timer timer;
	private RSSService service;
	private Date lastPull;
	public ArrayList<Post> posts;
	
	public Client(RSSService service) {
		this.service = service;
		lastPull = new Date();
		timer = new Timer();
		timer.schedule(new FetchTask(), interval);
	}
	
	public class FetchTask extends TimerTask {
		public void run() {
			if(service.hasNewPost(lastPull)) {
				posts = service.getPost();
				lastPull = new Date();
				refreshGUI(posts);
			}
		}
	}
	
	public void refreshGUI(ArrayList<Post> posts) {
	//do some stuff to update GUI

	
	}
}
