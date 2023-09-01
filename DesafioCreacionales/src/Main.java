public class Main {
    public static void main(String[] args) {
        FabricaPersonajes fabricaJugador = new FabricaGuerrero();
        Personaje jugador = fabricaJugador.crearPersonaje();

        FabricaEnemigos fabricaEnemigo = new FabricaEnemigoNormal();
        Enemigo enemigo = fabricaEnemigo.crearEnemigo();

        jugador.atacar();
        enemigo.recibirDaño(50);
    }
}