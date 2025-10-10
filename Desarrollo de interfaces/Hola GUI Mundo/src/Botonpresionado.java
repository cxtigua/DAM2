import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Botonpresionado {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                crearYMostrarGUI();
            }
        });
    }

    private static void crearYMostrarGUI() {
        // Crear la ventana
        JFrame ventana = new JFrame("Mi primera Ventana GUI");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 200);

        // Crear una etiqueta de texto
        JLabel etiqueta = new JLabel("Hola me llamo Carlos Tigua", SwingConstants.CENTER);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 16));

        // Crear un botón
        JButton boton = new JButton("Presionar");

        // Añadir acción al botón para cambiar el texto de la etiqueta
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("!Boton Presionado!");
            }
        });

        // Añadir la etiqueta y el botón al contenido de la ventana
        ventana.getContentPane().setLayout(new BorderLayout());
        ventana.getContentPane().add(etiqueta, BorderLayout.NORTH);
        ventana.getContentPane().add(boton, BorderLayout.SOUTH);

        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);

        // Hacer visible la ventana
        ventana.setVisible(true);

        System.out.println("La ventana GUI debería estar visible");
    }
}
