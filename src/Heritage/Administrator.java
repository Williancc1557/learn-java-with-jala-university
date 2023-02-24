package Heritage;

public class Administrator extends User {
    public Boolean canKick;
    public Boolean canMute;

    public void adminSpeak() {
        System.out.println("Olá, sou o administrador " + this.name);
    }
}
