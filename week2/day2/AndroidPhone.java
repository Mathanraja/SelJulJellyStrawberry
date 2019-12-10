package week2.day2;

public class AndroidPhone extends Mobile{
	

	public void makeCall() {
		System.out.println("advanced make call");
	}
	
	public void recordVideo() {
		System.out.println("video recorded");

	}
	
	public void videoCall() {
		System.out.println("video call");

	}
	
	public static void main(String[] args) {
		
		AndroidPhone ap = new AndroidPhone();
		
		ap.makeCall();
				
		
		/*Mobile mob = new Mobile();
		
		mob.makeCall();
		mob.sendSms();
		
		AndroidPhone ap = new AndroidPhone();
		
		ap.recordVideo();
		*/
		
		/*AndroidPhone ap = new AndroidPhone();
		ap.makeCall();
		ap.sendSms();
		ap.recordVideo();*/
		
		
	/*	Mobile mob = new Mobile();
		mob.makeCall();
		mob.sendSms();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
