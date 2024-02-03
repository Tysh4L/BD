package archivo;

import java.io.*;
import javax.swing.JOptionPane;

public class Archivo {

    private File archivoQuejas;
    private File archivoDenuncias;
    private File archivoReclamaciones;
    private File archivoSugerencias;

    public void crearArchivos() {
        archivoQuejas = new File("Quejas.txt");
        archivoDenuncias = new File("Denuncias.txt");
        archivoReclamaciones = new File("Reclamaciones.txt");
        archivoSugerencias = new File("Sugerencias.txt");

        crearArchivo(archivoQuejas);
        crearArchivo(archivoDenuncias);
        crearArchivo(archivoReclamaciones);
        crearArchivo(archivoSugerencias);
    }

    public void crearArchivo(File archivo) {
        try {
            if (!archivo.exists() && archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Archivo creado: " + archivo.getName());
            }

        } catch (IOException e) {
            System.out.println(e);

        }
    }

    public void escribirEnArchivo(Denuncia denuncia) {
        try {
            FileWriter escritura;

            switch (denuncia.getTipoFeedback()) {
                case "Queja":
                    escritura = new FileWriter(archivoQuejas, true);
                    break;
                case "Denuncia":
                    escritura = new FileWriter(archivoDenuncias, true);
                    break;
                case "Reclamación":
                    escritura = new FileWriter(archivoReclamaciones, true);
                    break;
                case "Sugerencia":
                    escritura = new FileWriter(archivoSugerencias, true);
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de feedback no válido: " + denuncia.getTipoFeedback());
            }

            escritura.write(denuncia.getNombre() + "%" + denuncia.getTelefono() + "%"
                    + denuncia.getCorreo() + "%" + denuncia.getDomicilio() + "%" + denuncia.getDetalles() + "\r\n");
            escritura.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
    

