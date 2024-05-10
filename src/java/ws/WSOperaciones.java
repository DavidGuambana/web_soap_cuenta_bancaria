package ws;

import controlador.principal;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Usuario;

@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    public principal control = new principal();

    public WSOperaciones() {
        control.crearCuentasBancarias();
    }

    @WebMethod(operationName = "addCuenta")
    public Boolean addCuenta(@WebParam(name = "Usuario") Usuario usuario) {
        System.out.println(usuario);
        control.getCuentas().add(usuario);
        return true;
    }

    @WebMethod(operationName = "getCuenta")
    public Usuario getCuenta(@WebParam(name = "usuario") String user, @WebParam(name = "clave") String clave) {
        for (Usuario usuario : control.getCuentas()) {
            if (usuario.getUsuario().equals(user) && usuario.getClave().equals(clave)) {
                return usuario;
            }
        }
        return null;
    }
    
    @WebMethod(operationName = "updateUsuario")
    public boolean updateCuenta(@WebParam(name = "Usuario") Usuario user) {
        for (Usuario usuario : control.getCuentas()) {
            if (usuario.getUsuario().equals(user.getUsuario()) && usuario.getClave().equals(user.getClave())) {
                usuario.setDinero(user.getDinero());
                return true;
            }
        }
        return false;
    }
}
