/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ACER
 */
public class Nonograma {

    private String rows[][], cols[][];
    private String nono[][];

    public Nonograma() {
        cols = new String[5][];
        rows = new String[10][];
        nono = new String[10][];
    }

    public String[][] getRows() {
        return rows;
    }

    public String[][] getCols() {
        return cols;
    }

    public String[][] getNono() {
        return nono;
    }

    public void readNono(String fileIn) {
        BufferedReader buffer = null;
        String line;

        try {
            buffer = new BufferedReader(new FileReader(fileIn));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            for (int i = 0; i < 5; i++) // Lee pistas de las filas
            {
                line = buffer.readLine();
                cols[i] = line.split(" ");
            }
            for (int i = 0; i < 10; i++) // Lee pistas de las columnas
            {
                line = buffer.readLine();
                rows[i] = line.split(" ");
            }
            for (int i = 0; i < 10; i++) // Lee el nonograma
            {
                line = buffer.readLine();
                nono[i] = line.split(" ");
                System.out.println(nono[i][9]);
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean verificarClicDerecho(int x, int y) {
        if (nono[x][y].equals("0")) {
            return true;
        }
        return false;
    }

    public boolean verificarClicIzquierdo(int x, int y) {
        if (nono[x][y].equals("X")) {
            return true;
        }
        return false;
    }
}
