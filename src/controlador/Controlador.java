/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import interfaz.PanelGrilla;
import mundo.Nonograma;

/**
 *
 * @author ACER
 */
public class Controlador {

    private Nonograma nono;
    private PanelGrilla pnlGrilla;

    public Controlador() {
        nono = new Nonograma();
    }

    public void conectar(PanelGrilla pnlGrilla) {
        nono.readNono("nonogramas/nono0.in");
        this.pnlGrilla = pnlGrilla;
    }

    public boolean click(int x, int y, boolean clic) {
        if (clic) {
            if (nono.verificarClicDerecho(x, y)) {
                return true;

            } else {
                return false;
            }
        } else {
            if (nono.verificarClicIzquierdo(x, y)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void restarVida() {
        nono.restarVida();
    }

    public int getVidas() {
        return nono.getVidas();
    }

    public String[][] getRows() {
        return nono.getRows();
    }

    public String[][] getCols() {
        return nono.getCols();
    }

    public boolean ganar() {
        return nono.ganar();
    }

}
