package bai1.dp;

public class ZipLoggerDecorator extends LoggerDecorator{
	
	public ZipLoggerDecorator(Logger logger) {
		super(logger);
	}
	
	@Override
	public void log(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Zip Logger Decorator" + msg);
		
		this.logger.log(msg);
	}
}
