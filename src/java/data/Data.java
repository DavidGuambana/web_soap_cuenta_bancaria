package data;

import java.util.ArrayList;

public class Data {

    private final ArrayList<Producto> productos = new ArrayList<>();
    
    
    
    public boolean setProducto(Producto p){
        return productos.add(p);
    }

    public ArrayList<Producto> getProductosByClaveValor(String clave, String valor) {
        ArrayList<Producto> productosEncontrados = new ArrayList<>();
        for (Producto producto : productos) {
            switch (clave) {
                case "id":
                    if (producto.getId() == Integer.parseInt(valor)) {
                        productosEncontrados.add(producto);
                    }
                    break;
                case "nombre":
                    if (producto.getNombre().equals(valor)) {
                        productosEncontrados.add(producto);
                    }
                    break;
                case "precio":
                    if (producto.getPrecio() == Double.parseDouble(valor)) {
                        productosEncontrados.add(producto);
                    }
                    break;
                case "stock":
                    if (producto.getStock() == Integer.parseInt(valor)) {
                        productosEncontrados.add(producto);
                    }
                    break;
                case "categoria":
                    if (producto.getCategoria().equals(valor)) {
                        productosEncontrados.add(producto);
                    }
                    break;
                case "proveedor":
                    if (producto.getProveedor().equals(valor)) {
                        productosEncontrados.add(producto);
                    }
                    break;
                default:
                    break;
            }
        }
        for (Producto producto : productosEncontrados) {
            System.out.println(producto);
        }

        return productosEncontrados.isEmpty() ? null : productosEncontrados;
    }

    public void crearProductos() {
        productos.add(new Producto(1, "manzana", 0.30, 40, "Frutas", "Titan"));
        productos.add(new Producto(2, "pera", 0.40, 30, "Frutas", "FruitCo"));
        productos.add(new Producto(3, "banana", 0.20, 50, "Frutas", "LacWorks"));
        productos.add(new Producto(4, "naranja", 0.30, 25, "Frutas", "FruitCo"));
        productos.add(new Producto(5, "zanahoria", 0.15, 60, "Verduras", "Titan"));
        productos.add(new Producto(6, "lechuga", 0.20, 45, "Verduras", "FruitCo"));
        productos.add(new Producto(7, "tomate", 0.20, 60, "Verduras", "Titan"));
        productos.add(new Producto(8, "pan", 0.50, 20, "Panadería", "Titan"));
        productos.add(new Producto(9, "leche", 1.00, 50, "Lácteos", "LacWorks"));
        productos.add(new Producto(10, "yogur", 0.75, 40, "Lácteos", "LacWorks"));
    }
}
