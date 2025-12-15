package Principal.juego;

import Principal.juego.red.ServidorAjedrez;
import com.badlogic.gdx.Game;

public class Principal extends Game {

    private ServidorAjedrez servidor;

    @Override
    public void create() {
        servidor = new ServidorAjedrez();
        servidor.start();
    }

    @Override
    public void dispose() {
        if (servidor != null) {
            servidor.cerrarServidor();
        }
        super.dispose();
    }
}
