package mascotavirtualtamagotchi;
public class Tamagotchi {
    private String nombre = "";
    private int hambre = 0;
    private int animo = 0;
    private int energia = 0;

    public Tamagotchi(String nombre, int hambre, int animo, int energia) {
        this.nombre = nombre;
        this.energia = energia;
        this.animo = animo;
        this.hambre = hambre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void jugar() {
        animo += 1;
        energia -= 1;
        System.out.println("Estoy jugando");
    }

    public void alimentar() {
        animo += 1;
        hambre -= 1;
        System.out.println("Me estoy alimentando");
    }

    public void dormir() {
        hambre += 1;
        energia += 1;
        System.out.println("Estoy durmiendo");
    }

    public void pasar() {
        animo -= 1;
        hambre += 1;
        energia -= 1;
        System.out.println("Estoy pasando el tiempo");
    }

    public String mostrarEstado() {
        return "Nombre: " + nombre + " Estado: Hambre: " + hambre + " Animo: " + animo + " Energia: " + energia;
    }
}
