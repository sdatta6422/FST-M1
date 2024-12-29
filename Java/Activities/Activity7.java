package hello;

interface BicycleParts
{
	public static final int tyres = 4;
	public static final int maxSpeed = 40;
}

interface BicycleOperations
{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
	
}

class Bicycle implements BicycleParts,BicycleOperations
{
	int gears; 
	int currentSpeed;
	
	
	Bicycle( int gears, int currentSpeed )
	{
		
		this.gears=gears;
		this.currentSpeed=currentSpeed;
	}
	public void applyBrake(int decrement)
	{
		currentSpeed=currentSpeed-decrement;
	}
	public void speedUp(int increment)
	{
		currentSpeed=currentSpeed+increment;
	}
	public void bicycleDesc()
	{
		//number of gears and the maxSpeed of the bicycle
	
		
		System.out.println("number of gears"+"  "+gears);
		System.out.println("maxspeed of bicycle"+"  "+maxSpeed);
	}
	
	
}

class MountainBike  extends  Bicycle
{
	int  seatHeight;
	MountainBike(int gears, int currentSpeed,int  seatHeight) {
		super(gears, currentSpeed);
		// TODO Auto-generated constructor stub
		this.seatHeight=seatHeight;
	}

	
	
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	public void bicycleDesc()
	{
		//number of gears and the maxSpeed of the bicycle
	
		
		System.out.println("number of gears"+"  "+gears);
		System.out.println("maxspeed of bicycle"+"  "+maxSpeed);
		//System.out.println("maxspeed of bicycle"+"  "+seatHeight);
	}
	
}

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle ob1=new Bicycle(6,80);	
		ob1.bicycleDesc();
		MountainBike ob2=new MountainBike(6,80,90);
		System.out.println("gears"+" "+ob2.gears);
		System.out.println("maxSpeed"+"  "+ob2.maxSpeed);
		System.out.println("seatHeight"+"  "+ob2.seatHeight);
		ob2.bicycleDesc();
		
		

	}
	
	
}


