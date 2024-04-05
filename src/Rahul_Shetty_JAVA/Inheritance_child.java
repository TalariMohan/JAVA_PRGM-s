package Rahul_Shetty_JAVA;

public class Inheritance_child extends Inheritance_Parent {
	public void Engne() {
		System.out.println(Engne);
	}
	
	public void Breks(){
		System.out.println("Comming from Parent Class Breks");
	}
	public void Gears(){
		System.out.println("Comming from Parent Class Gears");
	}
	public void Tyers() {
		System.out.println("NEW Tyers");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance_child ENG=new Inheritance_child();
		//ENG.Breks();
		//ENG.Gears();
		ENG.Tyers();
		ENG.Engne();
		
	}

}
