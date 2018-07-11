package dag8;
// 
//parents weten niet wie hun kinderen zijn
//polymorphisme : de Werknemer werknemer2 = new Ober();
//					hij neemt de methode van de Ober in dit geval
//					alleen voor niet statische onderdelen
// 					wel de variabele van de Werknemer parent class
//					fields in class Ober gebruiken wel de variabelen van deOber


class Demo3{

	public static void main(String[] args) {
		Werknemer werknemer1 = new Werknemer();
		System.out.println(werknemer1.salaris);
	}
	static void salarisUitbetalen(Werknemer wn) {
		
	}
}


class Werknemer{
	int salaris = 1600;
}

class Ober extends Werknemer{
	
}

class Kok extends Werknemer implements EtenBereider{
	public void etenBereiden() {
		
	}
}

class Moeder implements EtenBereider{
	public void etenBereiden() {}
}

interface EtenBereider{
	void etenBereiden();

}


