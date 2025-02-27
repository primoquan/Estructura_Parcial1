import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProyectoOrdenamiento {

    public static void mostrarInformacion() {
        // Datos fijos del proyecto
        String universidad = "Universidad Da Vinci de Guatemala";
        String curso = "Estructura de Datos";
        String docente = "Ing. Brandon Chitay";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del estudiante
        System.out.print("Ingrese su nombre: ");
        String estudiante = scanner.nextLine();

        // Listas de tareas completadas y pendientes
        List<String> puntosHechos = new ArrayList<>();
        List<String> puntosFaltantes = new ArrayList<>();

        // Se inicia el proyecto con el Punto 1 completado
        puntosHechos.add("1. Información del Desarrollador");

        // Lista de tareas restantes
        puntosFaltantes.add("2. Menú Principal");
        puntosFaltantes.add("3. Carga de Datos desde un CSV");
        puntosFaltantes.add("4. Algoritmo de Ordenamiento - Bubble Sort");
        puntosFaltantes.add("5. Algoritmo de Ordenamiento - Enhanced Bubble Sort");
        puntosFaltantes.add("6. Algoritmo de Ordenamiento - Quick Sort");
        puntosFaltantes.add("7. Algoritmo de Ordenamiento - Selection Sort");
        puntosFaltantes.add("8. Algoritmo de Ordenamiento - Merge Sort");
        puntosFaltantes.add("9. Algoritmo de Búsqueda - Binary Search");
        puntosFaltantes.add("10. Presentación Final en YouTube");

        // Mostrar la información en consola
        System.out.println("\n========================================");
        System.out.println(universidad);
        System.out.println(curso);
        System.out.println(docente + "\n");
        System.out.println("Nombre del estudiante: " + estudiante + "\n");

        // Mostrar tareas completadas
        System.out.println("PUNTOS HECHOS:");
        for (String punto : puntosHechos) {
            System.out.println("✅ " + punto);
        }

        // Mostrar tareas pendientes
        System.out.println("\nPUNTOS FALTANTES:");
        for (String punto : puntosFaltantes) {
            System.out.println("❌ " + punto);
        }

        System.out.println("========================================");

        // Esperar a que el usuario presione Enter antes de continuar
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();  // Captura la entrada del usuario

        // Cerrar el scanner
        scanner.close();
    }

    public static void main(String[] args) {
        mostrarInformacion();  // Llamamos a la función para ejecutarla
    }
}