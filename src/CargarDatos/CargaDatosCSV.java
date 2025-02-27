
package CargarDatos;

import java.io.*;
import java.util.*;

public class CargaDatosCSV {
    public static List<Integer> cargarDatos(String nombreArchivo) {
        List<Integer> datos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    datos.add(Integer.parseInt(linea.trim()));
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Dato inválido en el archivo: " + linea);
                }
            }
            System.out.println("✅ Datos cargados exitosamente desde " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }
        return datos;
    }

    public static void opcionCargarDatos(Scanner scanner, List<Integer> listaDatos) {
        System.out.print("📂 Ingrese el nombre del archivo CSV: ");
        String nombreArchivo = scanner.nextLine();
        List<Integer> datosCargados = cargarDatos(nombreArchivo);
        if (!datosCargados.isEmpty()) {
            listaDatos.clear();
            listaDatos.addAll(datosCargados);
        }
    }
}