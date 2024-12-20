package hello;

public class CarActivity1 {

	//private static String String;
int tyres;
int doors;
	CarActivity1 ()
	{
		tyres=4;
		doors=6;
		
	}

	public static void main(String[] args) {
		int i=10;
		// TODO Auto-generated method stub
int make=2014;
String color="black";
String transmission="Manual";
////int tyres=4;
//int doors=4;

System.out.println();
CarActivity1 cobj1=new CarActivity1();

cobj1.displayCharacteristics(make,color,transmission,cobj1.tyres,cobj1.doors);
Activity1 avobj1=new Activity1();
avobj1.accelerate();
avobj1.brake();
	}

void displayCharacteristics(int make,String color,String transmission,int tyres,int doors ) {
		// TODO Auto-generated method stub
	
	//System.out.println("Car State "+"  "+make+"  "+color+"  "+transmission+"  "+tyres+" "+doors);
	
	System.out.println("Color of the Car: " + color);
	System.out.println("Make of the Car: " + make);
	System.out.println("Transmission of the Car: " + transmission);
	System.out.println("Number of doors on the car: " + doors);
    	System.out.println("Number of tyres on the car: " + tyres);
	
		
	}

}
