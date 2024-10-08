/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import controlador.Controlador;
import javax.swing.JFrame;

/**
 *
 * @author ACER
 */
public class InterfazApp extends JFrame{

    private PanelGrilla pnlGrilla;
    private PanelPistas pnlPistasColumnas;
    private PanelPistas pnlPistasFilas;
    private PanelVidas pnlVidas;
    private Controlador ctrl;
    
    public InterfazApp(Controlador ctrl){
    
    this.ctrl = ctrl;
        
    //propidades del frame
    setTitle("Nonogramas");
    getContentPane().setLayout(null);
    setSize(350, 450);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    pnlVidas = new PanelVidas(ctrl);
    pnlVidas.setBounds(10, 10, 320, 50);
    add(pnlVidas);
    
    pnlGrilla = new PanelGrilla(ctrl, pnlVidas);
    pnlGrilla.setBounds(120, 165, 215, 215);
    add(pnlGrilla);
    
    pnlVidas = new PanelVidas(ctrl);
    pnlVidas.setBounds(10, 10, 320, 50);
    add(pnlVidas);
    
    ctrl.conectar(pnlGrilla);
    
    pnlPistasColumnas = new PanelPistas(true,ctrl.getCols());
    pnlPistasColumnas.setBounds(120, 65, 215, 100);
    add(pnlPistasColumnas);
    
    pnlPistasFilas = new PanelPistas(false, ctrl.getRows());
    pnlPistasFilas.setBounds(20, 165, 100, 215);
    add(pnlPistasFilas);
    }
    
    public static void main(String[] args) {
        InterfazApp frmMain = new InterfazApp(new Controlador());
        frmMain.setVisible(true);
    }
    
}
