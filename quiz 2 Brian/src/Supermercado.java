/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aulas Heredia
 */
public class Supermercado {
    String nombre;
    String codigo;
    Producto[] productos;
    int totalProductos;

    public Supermercado(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        productos = new Producto[100]; // Capacidad inicial de 100 productos
        totalProductos = 0;
    }
// Método para agregar un producto

    public void agregarProducto(Producto producto) {
        productos[totalProductos] = producto;
        totalProductos++;
    }
// Método para obtener la información de todos los productos

    public String obtenerInformacionProductos() {
        StringBuilder info = new StringBuilder();
        for (int i = 0; i < totalProductos; i++) {
            info.append(productos[i].obtenerInformacion()).append("\n");
        }
        return info.toString();
    }

    // Método para calcular el monto total de ganancia esperada
    public double calcularGananciaTotal() {
        double gananciaTotal = 0;
        for (int i = 0; i < totalProductos; i++) {
            gananciaTotal += productos[i].gananciaEsperada;
        }
        return gananciaTotal;
    }

}
    

