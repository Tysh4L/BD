package archivo;

import java.io.*;
import javax.swing.JOptionPane;

public class Archivo {

    File archivo;

    public void crearArchivo() {
        try {
            archivo = new File("Registros.txt");
            if (archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Archivo creado");
            }

        } catch (IOException e) {
            System.out.println(e);

        }
    }

    public void escribirEnArchivo(Denuncia denuncia) {
        try {
            FileWriter escritura = new FileWriter(archivo, true);
            escritura.write(denuncia.getNombre() + "%" + denuncia.getTelefono() + "%" + denuncia.getCorreo() + 
                    "%" + denuncia.getDomicilio() + "%" + denuncia.getDetalles() + "\r\n");
            escritura.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
