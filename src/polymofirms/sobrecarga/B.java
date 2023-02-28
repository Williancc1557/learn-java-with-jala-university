package polymofirms.sobrecarga;

public class B extends A {
    public B() {
        System.out.println("Controller sem parâmetro");
    }

    public B(String name) {
        System.out.println("Controller com parâmetro nome " + name);
    }

    public void emitirSom() {
        System.out.println("Emitindo um som sem parâmetro");
    }

    public void emitirSom(String song) {
        System.out.println("Emitindo um som: " + song);
    }
}
