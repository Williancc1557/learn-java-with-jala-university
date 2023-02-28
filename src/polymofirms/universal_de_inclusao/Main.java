package polymofirms.universal_de_inclusao;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a); // just use an object inside another object.

        b.a.test();
    }
}
