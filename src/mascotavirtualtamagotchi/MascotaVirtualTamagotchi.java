package mascotavirtualtamagotchi;

public class MascotaVirtualTamagotchi {

    public static void main(String[] args) {
        Tamagotchi t = new Tamagotchi("Mametchi", 10, 10, 10);
        System.out.println(t.mostrarEstado());
        t.dormir();
        System.out.println(t.mostrarEstado());
        t.jugar();
        System.out.println(t.mostrarEstado());
        t.alimentar();
        System.out.println(t.mostrarEstado());
        t.pasar();
        System.out.println(t.mostrarEstado());
    }

}
