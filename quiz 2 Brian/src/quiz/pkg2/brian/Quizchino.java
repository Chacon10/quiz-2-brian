/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package quizchino
Import Javax. swing. Joptiontane;
import javax.swing.JOptionPane;
import quiz.pkg2.brian.Producto;
import quizchino. Producto. TipoProducto;
public class Quizchino {

/**
 *
 * @author Aulas Heredia
 */
public class Quiz2Brian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar información del supermercado
        String nombreSupermercado = JOptionPane.showInputDialog("Ingrese el nombre del supermercado:");
        String codigoSupermercado = JOptionPane.showInputDialog("Ingrese el código del supermercado:");

        // Crear objeto de supermercado
        Supermercado supermercado = new Supermercado(nombreSupermercado, codigoSupermercado);

        // Solicitar información del empleado
        String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String cedulaEmpleado = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");

        // Solicitar información de los productos
        while (true) {
            String codigoProducto = JOptionPane.showInputDialog("Ingrese el código del producto (o 'fin' para terminar):");
            if (codigoProducto.equalsIgnoreCase("fin")) {
                break;
            }
            String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
            int cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos a ingresar:"));
            double precioBaseProducto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio base del producto:"));
            String tipoString = JOptionPane.showInputDialog("Ingrese el tipo de producto (Alimentos, Bebidas, Higiene, Limpieza):");
            TipoProducto tipoProducto = TipoProducto.valueOf(tipoString.toUpperCase());

            // Crear objeto de producto y agregarlo al supermercado
            Producto producto = new Producto(codigoProducto, nombreProducto, nombreEmpleado, cedulaEmpleado,
                    cantidadProducto, precioBaseProducto, tipoProducto);
            supermercado.agregarProducto(producto);
        }

        // Mostrar los productos agregados
        JOptionPane.showMessageDialog(null, "Productos agregados:\n" + supermercado.obtenerInformacionProductos());

        // Calcular y mostrar la ganancia total esperada
        JOptionPane.showMessageDialog(null, "Ganancia total esperada: $" + supermercado.calcularGananciaTotal());
    }

    
    
    

