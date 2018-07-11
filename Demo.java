package dag8;

class Demo{
	public static void main(String[] args) {
		System.out.println("hoi");
		Dier dier = new Dier();
		Dier apen = new Apen();
		dier.bewegen();
		apen.bewegen();
		
	}
	
}
class Dier{
	void bewegen() {
		System.out.println("Dieren kunnen bewegen");
	}
}
class Apen extends Dier{
	void bewegen() {
		System.out.println("Apen kunnen klimmen");
	}
}

