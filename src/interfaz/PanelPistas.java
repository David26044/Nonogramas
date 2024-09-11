/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author ACER
 */
public class PanelPistas extends JPanel {

    private JLabel lblPistas[][];
    private String pistas[][];
    private boolean orientacion;

    public PanelPistas(boolean orientacion, String[][] pistas) {
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
        setLayout(new GridLayout(10, 10));
        this.orientacion = orientacion;
        this.pistas = pistas;
        System.out.println(pistas.length);
        lblPistas = new JLabel[10][10];
        
        if (orientacion) {
            setLayout(new GridLayout(5, 10)); // 5 filas, 10 columnas para pistas horizontales
            pistasColumnas();
        }else{
             setLayout(new GridLayout(10, 5)); // 10 filas, 5 columnas para pistas verticales
            pistasFilas();
        }

    }

    private void pistasFilas() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                lblPistas[i][j] = new JLabel("");
                //lblPistas[i][j].setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
                lblPistas[i][j].setHorizontalAlignment(JLabel.CENTER);
                lblPistas[i][j].setVerticalAlignment(JLabel.CENTER);
                lblPistas[i][j].setEnabled(true);
                if (!pistas[i][j].equals("0")) {
                    lblPistas[i][j].setText(pistas[i][j]);
                }
                add(lblPistas[i][j]);
            }
        }
    }

    private void pistasColumnas() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                lblPistas[i][j] = new JLabel("");
               // lblPistas[i][j].setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
                lblPistas[i][j].setHorizontalAlignment(JLabel.CENTER);
                lblPistas[i][j].setVerticalAlignment(JLabel.CENTER);
                lblPistas[i][j].setEnabled(true);
                if (!pistas[i][j].equals("0")) {
                    lblPistas[i][j].setText(pistas[i][j]);
                }
                add(lblPistas[i][j]);
            }
        }

    }
}
