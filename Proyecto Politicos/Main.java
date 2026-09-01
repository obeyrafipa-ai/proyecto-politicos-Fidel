import java.util.ArrayList; // Importa la clase ArrayList para manejar listas dinámicas de objetos
import java.util.List; // Importa la interfaz List para definir la estructura de la colección

// Clase encargada de almacenar los objetos recibidos y organizarlos en una tabla
class GestorTablaPoliticos {
    // Declara una lista privada para almacenar los objetos de tipo Politico
    private List<Politico> listaPoliticos;

    // Constructor de la clase GestorTablaPoliticos
    public GestorTablaPoliticos() {
        // Inicializa la lista utilizando una instancia de ArrayList
        this.listaPoliticos = new ArrayList<>();
    }

    // Método solicitado en el Paso 4 que recibe como insumos los objetos creados y los guarda
    public void guardarEnTabla(Politico[] objetosPoliticos) {
        // Bucle for-each que recorre cada objeto del arreglo recibido
        for (Politico p : objetosPoliticos) {
            // Guarda el objeto Politico en la lista interna de la tabla
            this.listaPoliticos.add(p);
        }
    }

    // Método solicitado en el Paso 5 para imprimir la tabla con los 10 objetos en la consola
    public void imprimirTabla() {
        // Imprime la línea divisoria superior del marco de la tabla
        System.out.println("+----------------------+------------------+------------------+------+-------------+----------+");
        // Imprime los títulos de cada columna alineados y formateados
        System.out.printf("| %-20s | %-16s | %-16s | %-4s | %-11s | %-8s |%n", "NOMBRE", "PARTIDO", "CARGO", "EDAD", "EXP (AÑOS)", "ACTIVO");
        // Imprime la línea divisoria que separa los encabezados de los datos
        System.out.println("+----------------------+------------------+------------------+------+-------------+----------+");
        
        // Recorre la lista de objetos Politico almacenados para imprimirlos renglón por renglón
        for (Politico p : listaPoliticos) {
            // Imprime una fila con los valores de los 6 atributos de cada objeto formateados
            System.out.printf("| %-20s | %-16s | %-16s | %-4d | %-11d | %-8s |%n", 
                p.getNombre(), 
                p.getPartido(), 
                p.getCargo(), 
                p.getEdad(), 
                p.getAnosExperiencia(), 
                p.isEnActivo() ? "Sí" : "No");
        }
        // Imprime la línea divisoria inferior para cerrar la estructura de la tabla
        System.out.println("+----------------------+------------------+------------------+------+-------------+----------+");
    }
}

// Clase principal del programa requerida para la ejecución
public class Main {
    // Método principal que actúa como punto de entrada de la aplicación
    public static void main(String[] args) {
        // Declara e inicializa un arreglo para almacenar los 10 objetos Politico
        Politico[] grupoPoliticos = new Politico[10];

        // Instanciación del objeto 1 con sus 6 atributos correspondientes
        grupoPoliticos[0] = new Politico("Laura Gómez", "Partido Verde", "Senadora", 45, 12, true);
        // Instanciación del objeto 2
        grupoPoliticos[1] = new Politico("Carlos Mendoza", "Partido Azul", "Diputado", 52, 20, true);
        // Instanciación del objeto 3
        grupoPoliticos[2] = new Politico("Ana Martínez", "Partido Rojo", "Alcaldesa", 39, 8, true);
        // Instanciación del objeto 4
        grupoPoliticos[3] = new Politico("Roberto Silva", "Partido Amarillo", "Gobernador", 61, 25, true);
        // Instanciación del objeto 5
        grupoPoliticos[4] = new Politico("Sofía Torres", "Partido Verde", "Concejal", 29, 3, true);
        // Instanciación del objeto 6
        grupoPoliticos[5] = new Politico("Miguel Ángel", "Partido Blanco", "Ex-Presidente", 70, 40, false);
        // Instanciación del objeto 7
        grupoPoliticos[6] = new Politico("Elena Ríos", "Partido Rojo", "Diputada", 41, 10, true);
        // Instanciación del objeto 8
        grupoPoliticos[7] = new Politico("Javier Morales", "Partido Azul", "Ministro", 48, 15, true);
        // Instanciación del objeto 9
        grupoPoliticos[8] = new Politico("Patricia Vega", "Partido Amarillo", "Senadora", 55, 18, true);
        // Instanciación del objeto 10
        grupoPoliticos[9] = new Politico("Fernando Castro", "Independiente", "Alcalde", 36, 6, true);

        // Crea una instancia de la clase gestora encargada de la tabla
        GestorTablaPoliticos gestor = new GestorTablaPoliticos();

        // Llama al método que recibe el arreglo de objetos como insumo y los guarda
        gestor.guardarEnTabla(grupoPoliticos);

        // Llama al método final para imprimir la tabla formateada en la consola
        gestor.imprimirTabla();
    }
}