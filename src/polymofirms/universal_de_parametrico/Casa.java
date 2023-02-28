package polymofirms.universal_de_parametrico;

public class Casa <Animal> {
    private Animal animalAllowed;

    public void setAnimalAllowed(Animal animal) {
        this.animalAllowed = animal;
    }

    public Animal getAnimalAllowed() {
        return animalAllowed;
    }
}
