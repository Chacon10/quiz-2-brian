/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg2.brian;

/**
 *
 * @author Aulas Heredia
 */
public class Producto {
    // Enum para los tipos de productos
enum TipoProducto {
    ALIMENTOS, BEBIDAS, HIGIENE, LIMPIEZA
}
    String codigo;
    String nombre;
    String nombreEmpleado;
    String cedulaEmpleado;
    int cantidad;
    double precioBase;
    TipoProducto tipo;
    double precioBruto;
    double gananciaEsperada;

    // Constructor
    public Producto(String codigo, String nombre, String nombreEmpleado, String cedulaEmpleado, int cantidad,
                    double precioBase, TipoProducto tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.tipo = tipo;
        calcularPrecioBruto();
        calcularGananciaEsperada();
    }
     // Método para calcular el precio bruto del producto
    private void calcularPrecioBruto() {
        switch (tipo) {
            case ALIMENTOS:
                precioBruto = precioBase * 0.20 + precioBase;
                break;
            case BEBIDAS:
                precioBruto = precioBase * 0.30 + precioBase;
                break;
            case HIGIENE:
                precioBruto = precioBase * 0.25 + precioBase + 500;
                break;
            case LIMPIEZA:
                precioBruto = precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
                break;
        }
    }

    // Método para calcular la ganancia esperada
    private void calcularGananciaEsperada() {
        gananciaEsperada = (precioBruto - precioBase) * cantidad;
    }
 // Método para obtener la información del producto
    public String obtenerInformacion() {
        return "Código: " + codigo + "\n" +
                "Nombre: " + nombre + "\n" +
                "Nombre del empleado: " + nombreEmpleado + "\n" +
                "Cédula del empleado: " + cedulaEmpleado + "\n" +
                "Cantidad: " + cantidad + "\n" +
                "Precio base: " + precioBase + "\n" +
                "Tipo: " + tipo + "\n" +
                "Precio bruto: " + precioBruto + "\n" +
                "Ganancia esperada: " + gananciaEsperada + "\n" +
                "--------------------";
    }
}
    

