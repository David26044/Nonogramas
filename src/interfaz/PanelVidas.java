/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import controlador.Controlador;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author David
 */
public class PanelVidas extends JPanel {

    private ImageIcon vida;
    private ImageIcon perdida;
    private JLabel jl_vida1, jl_vida2, jl_vida3;
    private JLabel v_perdida;
    private Controlador ctrl;

    public PanelVidas(Controlador ctrl) {

        this.ctrl = ctrl;

        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Vidas")));
        setLayout(null);
        //Atributos
        vida = new ImageIcon("data/live.png");
        perdida = new ImageIcon("data/die.png");
        jl_vida1 = new JLabel();
        jl_vida2 = new JLabel();
        jl_vida3 = new JLabel();

        v_perdida = new JLabel();
        jl_vida1.setBounds(70, 10, 70, 30);
        jl_vida2.setBounds(130, 10, 70, 30);
        jl_vida3.setBounds(195, 10, 70, 30);

        jl_vida1.setIcon(vida);
        jl_vida2.setIcon(vida);
        jl_vida3.setIcon(vida);

        add(jl_vida1);
        add(jl_vida2);
        add(jl_vida3);

    }

    public void descontarVidas(int nlbl) {
        if (nlbl == 3) {
            jl_vida3.setIcon(perdida);
        }
        if (nlbl == 2) {
            jl_vida2.setIcon(perdida);
        }
        if (nlbl == 1) {
            jl_vida1.setIcon(perdida);
            JOptionPane.showMessageDialog(null, "Perdiste");
            System.exit(0);

        }
    }

}
