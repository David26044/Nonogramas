package interfaz;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
import controlador.Controlador;

public class PanelGrilla extends JPanel {
    // Constantes

    private static final String BLOCK = "data/Block.gif";

    // Atributos de la clase 		
    private JLabel lblMundo[][];
    private ImageIcon imgCell;

    // Relaciones   
    private Controlador controlador;

    /**
     * Constructor
     */
    public PanelGrilla(Controlador controlador) {
        // ..............................................( T, L, B, R ).............................................
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
        setLayout(new GridLayout(10, 10));

        // Enlaza el Controlador y el Panle de Simulación
        this.controlador = controlador;

        // Instancia atributos de la clase   
        lblMundo = new JLabel[10][10];

        // Agrega los atributos al panel   
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                lblMundo[i][j] = new JLabel("");
                lblMundo[i][j].setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
                lblMundo[i][j].setHorizontalAlignment(JLabel.CENTER);
                lblMundo[i][j].setVerticalAlignment(JLabel.CENTER);
                lblMundo[i][j].setEnabled(true);
                lblMundo[i][j].addMouseListener(new LabelClicMouse(i, j, lblMundo[i][j], controlador, this));
                add(lblMundo[i][j]);
            }
        }
    }

    public void setIcon(int x, int y, ImageIcon icon) {
        lblMundo[x][y].setIcon(icon);
    }

    public void setText(int x, int y) {
        lblMundo[x][y].setText("X");
    }

    public void removeLabelClicMouse() {
        for (int i = 0; i < 35; i++) {
            for (int j = 0; j < 35; j++) {
                lblMundo[i][j].removeMouseListener(lblMundo[i][j].getMouseListeners()[0]);
            }
        }
    }

}

/**
 * Controlador de eventos del Mouse
 *
 * @author Giovanni Fajardo Utria
 */
class LabelClicMouse extends MouseAdapter {

    private JLabel label;
    private Controlador ctrl;
    private int x, y;
    private PanelGrilla pnlMundo;

    public LabelClicMouse(int x, int y, JLabel label, Controlador ctrl, PanelGrilla pnlMundo) {
        this.label = label;
        this.ctrl = ctrl;
        this.x = x;
        this.y = y;

        this.pnlMundo = pnlMundo;
    }

    public void mouseClicked(MouseEvent evento) {
        if (evento.isMetaDown()) {
            System.out.println("Clic derecho en: (" + x + "," + y + ")");
            ctrl.click(x, y, true);
        } else {
            System.out.println("Click izquierdo en: (" + x + "," + y + ")");
            ctrl.click(x, y, false);
            //poner x en la celda
        }
    }
}

