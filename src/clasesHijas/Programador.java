/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesHijas;

import clasePadre.Informaticos;
import com.sun.xml.internal.ws.util.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 30/06/2021
 *
 */
public class Programador extends Informaticos {

    //Valores por defecto
    private final static String LENGUAJE_DEF = "Java";
    private final static String NIVEL_PROGRAMADOR = "Semi-Junior";
    private final static String TIPO = "FrontEnd";
    //Atributos propios de nuestra clase programador
    private String nivel;
    private String lenguaje;
    private String tipo;

    public Programador(String nivel, String lenguaje, String tipo, String nombre, String apellido, int edad, double sueldo) {
        super(nombre, apellido, edad, sueldo);
        comprobarNivel(nivel);
        comprobarLenguaje(lenguaje);
        comprobarTipo(tipo);
        aumentoSueldo();
    }

    //Metodo para comprobar Nivel
    private void comprobarNivel(String nivel) {
        boolean encontrado = false;
        String niveles[] = {"Junior", "Semi-Junior", "Senior"};
        for (String n : niveles) {
            if (nivel.equalsIgnoreCase(n)) {
                this.nivel = nivel;
                encontrado = true;
            }
        }
        if (!encontrado) {
            this.nivel = NIVEL_PROGRAMADOR;
        }
    }

    //Metodo para comprobar Lenguaje
    private void comprobarLenguaje(String lenguaje) {
        boolean encontrado = false;
        String niveles[] = {"Java", "Phyton", "Go", "Ruby", "JavaScript"};
        for (String n : niveles) {
            if (lenguaje.equalsIgnoreCase(n)) {
                this.lenguaje = lenguaje;
                encontrado = true;
            }
        }
        if (!encontrado) {
            this.lenguaje = LENGUAJE_DEF;
        }
    }

    //Metodo para comprobar Lenguaje
    private void comprobarTipo(String tipo) {
        boolean encontrado = false;
        String niveles[] = {"FrontEnd", "BackEnd", "FullStack"};
        for (String n : niveles) {
            if (tipo.trim().equalsIgnoreCase(n)) {
                this.tipo = tipo;
                encontrado = true;
            }
        }
        if (!encontrado) {
            this.tipo = TIPO;
        }
    }
    //Metodos get y set

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void aumentoSueldo() {
        if (this.tipo.equalsIgnoreCase("FullStack")) {
            double n = ((super.getSueldo() * 0.5) + super.getSueldo());
            JOptionPane.showMessageDialog(null, "PLUS del 50% aplicado", "PLUS aplicado", 1);
            super.setSueldo(n);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nNivel: " + nivel + "\nLenguaje: " + lenguaje + "\nTipo: " + tipo;
    }

}
