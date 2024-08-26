/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import interfaz.PanelGrilla;
import javax.swing.ImageIcon;
import mundo.Nonograma;

/**
 *
 * @author ACER
 */
public class Controlador {

    private Nonograma nono;
    private PanelGrilla pnlGrilla;
    private ImageIcon imgBlock;

    public Controlador() {
        nono = new Nonograma();
    }

    public void conectar(PanelGrilla pnlGrilla) {
        nono.readNono("nonogramas/nono0.in");
        imgBlock = new ImageIcon("data/Block.gif");
        this.pnlGrilla = pnlGrilla;
    }

    public void click(int x, int y, boolean clic) {
        if (clic) {
            if (nono.verificarClicDerecho(x, y)) {
                pnlGrilla.setIcon(x, y, imgBlock);
                //opcion correcta
            } else {
                pnlGrilla.setText(x, y);
                //opcion incorrecta, restar vida
            }
        } else {
            if(nono.verificarClicIzquierdo(x, y)){
                pnlGrilla.setText(x, y);
                //opcion correcta
            }else{
                pnlGrilla.setIcon(x, y, imgBlock);
                //opcion incorrecta, restar vida
            }
        }
    }

}
