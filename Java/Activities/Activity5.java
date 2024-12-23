package hello;



abstract class Books
{
	String title;
	abstract String setTitle(String title);
	//abstract void getTitle();
	/*void getTitle() {
		// TODO Auto-generated method stub
		System.out.println("The title is: " +"  "+title);
	}*/
	String getTitle()
	{
		return title;
	}
	
}

class MyBook extends Books 
{

	
	/*String setTitle(String t) {
		// TODO Auto-generated method stub
		this.title=t;
		return title;
	}*/

	
	String setTitle(String t) {
		// TODO Auto-generated method stub
		this.title=t;
		return title;
	}
	
}

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBook newNovel=new MyBook();
		newNovel.setTitle("New Title");
		System.out.println("The title is: "+"  "+newNovel.getTitle());

	}

}