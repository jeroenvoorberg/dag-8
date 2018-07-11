package dag8;

class Demo2{
	public static void main(String[] args) {
		eten(new Mais());
	}
	static void eten(BBQbaar b) {
		System.out.println(b.barbequen());
		b.barbequen();
	}
}
interface BBQbaar{
	public abstract int barbequen();
}
class Mais implements BBQbaar{
	int barbequen() {
		System.out.println("lekker bbq-en");
		return 3;
	}
}

