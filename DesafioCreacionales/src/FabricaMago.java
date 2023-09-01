abstract class FabricaMago extends FabricaPersonajes {
    @Override
    public Personaje crearPersonaje() {
        return new Jugador();
    }

    public abstract void atacar();
}