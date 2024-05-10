package controlador;

import java.util.ArrayList;
import modelo.Usuario;

public class principal {

    private final ArrayList<Usuario> cuentas;

    public principal() {
        this.cuentas = new ArrayList<>();
    }
    
    public void crearCuentasBancarias(){
        cuentas.add(new Usuario("jose001", "12345", 500.0));
        cuentas.add(new Usuario("lopez", "l0pez11", 500.0));
        cuentas.add(new Usuario("luis", "luis001", 500.0));
        cuentas.add(new Usuario("alberto", "alb_3rt02000", 500.0));
        cuentas.add(new Usuario("anabel", "anita555", 500.0));
    }

    public ArrayList<Usuario> getCuentas() {
        return cuentas;
    }
}
