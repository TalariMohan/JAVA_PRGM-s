package Rahul_Shetty_JAVA;

public class Interface_IND implements Interface_Traffic,Interface_ASIA {

	public static void main(String[] args) {
		Interface_Traffic Traffic=new Interface_IND();
		Traffic.Red();
		Traffic.Yellow();
		Traffic.Green();
		
		Interface_IND ASIAN=new Interface_IND();
		ASIAN.Handsymble();
		ASIAN.Metro();
	}

	@Override
	public void Red() {
		// TODO Auto-generated method stub
		System.out.println("STOP");
	}

	@Override
	public void Yellow() {
		// TODO Auto-generated method stub
		System.out.println("WAIT");
	}

	@Override
	public void Green() {
		// TODO Auto-generated method stub
		System.out.println("GO");
	}

	@Override
	public void Handsymble() {
		// TODO Auto-generated method stub
		System.out.println("walking");
	}

	@Override
	public void Metro() {
		// TODO Auto-generated method stub
		System.out.println("METRO_RUNNING");
	}

}
