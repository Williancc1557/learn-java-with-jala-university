package polymofirms.sobrecarga;

public class Main {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B("willian");

        b1.emitirSom();
        b1.emitirSom("Buaaaaa");
    }
}
