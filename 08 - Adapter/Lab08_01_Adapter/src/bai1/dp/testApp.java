package bai1.dp;

public class testApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyApp app = new MyApp();
		ISimpleFTP ftp = new FTPAdapter();
		app.setFTP(ftp);
		app.doSomething();
	}

}