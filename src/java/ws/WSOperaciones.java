package ws;

import data.Data;
import data.Producto;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    public Data data = new Data();

    public WSOperaciones() {
        data.crearProductos();
    }
    
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        return username.equals("david777") && password.equals("1234");
    }

    @WebMethod(operationName = "getProductosByClaveValor")
    public ArrayList<Producto> getProductosByClaveValor(@WebParam(name = "clave") String clave, @WebParam(name = "valor") String valor) {
        return data.getProductosByClaveValor(clave, valor);
    }

    @WebMethod(operationName = "setProducto")
    public Boolean setProducto(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "precio") double precio, @WebParam(name = "stock") int stock, @WebParam(name = "categoria") String categoria, @WebParam(name = "proveedor") String proveedor) {
        Producto producto = new Producto(id, nombre, precio, stock, categoria, proveedor);
        return data.setProducto(producto);
    }
}
    
    
