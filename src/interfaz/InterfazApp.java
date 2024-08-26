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

    PanelGrilla pnlGrilla;
    Controlador ctrl;
    
    public InterfazApp(Controlador ctrl){
    
    this.ctrl = ctrl;
        
    //propidades del frame
    setTitle("Nonogramas");
    getContentPane().setLayout(null);
    setSize(350, 450);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
    pnlGrilla = new PanelGrilla(ctrl);
    
    pnlGrilla.setBounds(120, 165, 215, 215);
    add(pnlGrilla);
    
    ctrl.conectar(pnlGrilla);
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        InterfazApp frmMain = new InterfazApp(new Controlador());
        frmMain.setVisible(true);
    }
    
}
