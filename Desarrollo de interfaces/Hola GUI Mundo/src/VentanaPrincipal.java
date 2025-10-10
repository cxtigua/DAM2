import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal {

    public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            crearYMostrarGUI();
        }
    });
    }
    private static void crearYMostrarGUI() {
    //crear la ventana
        JFrame ventana = new JFrame("Mi primera Ventana GUI");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 200);

        //Crear una etiqueta de texto
        JLabel etiqueta = new JLabel("Mi primera Ventana GUI con swing", SwingConstants.CENTER);
        etiqueta.setFont(new Font("Arial", Font.BOLD,16));
        //Añadir la etiqueta al contenido de la ventana
        ventana.getContentPane().add(etiqueta, BorderLayout.CENTER);

        //Centrar la ventana en el pantalla

        ventana.setLocationRelativeTo(null);

        //Hacer visible la ventana

        ventana.setVisible(true);

        System.out.println("La ventana GUI deberia estar visible");

    }
    }
