package UI;

import javax.swing.*;
import java.awt.*;

public class BotonBackground extends JButton {
    private Image imagenFondo;

    public BotonBackground(String rutaImagen) {
        try {
            imagenFondo = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
        } catch (Exception e) {
            e.printStackTrace();
        }
        setContentAreaFilled(false); // evita que el look and feel dibuje su propio fondo encima
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (imagenFondo != null) {
            g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
        }
        super.paintComponent(g);
    }
}