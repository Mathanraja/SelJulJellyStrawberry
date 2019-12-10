package week2.day2;

public class SmartPhone extends Mobile {
	
	public void connectWhatsApp() {
		System.out.println("WhatsApp connected");

	}
	
	public void videoCall() {
		System.out.println("video call");

	}
	
	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		
		
		/*sp.makeCall();
		sp.sendSms();
		sp.recordVideo();
		sp.connectWhatsApp();*/
		
	}

}
