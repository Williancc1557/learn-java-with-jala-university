package polymofirms.universal_de_parametrico;


public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Casa<Cachorro> b1 = new Casa<Cachorro>();

        b1.setAnimalAllowed(dog);

        b1.getAnimalAllowed().testDog();

    }
}
