class Animal{
    String colour;
    public void eat(String e) {
        System.out.println("eating "+e);
    }
}

class Cow extends Animal{
    public void age(int a){
        System.out.println("age "+a);
    }
}
public class Main {
	public static void main(String[] args) {
	    Cow c = new Cow();
	    c.colour = "white";
	    c.age(22);
	    c.eat("Grass");
	    String g = c.colour;
	    System.out.println(g);
	}
}
