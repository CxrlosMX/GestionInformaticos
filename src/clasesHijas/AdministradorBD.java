/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesHijas;

import clasePadre.Informaticos;
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
public class AdministradorBD extends Informaticos {

    //Valores por defecto
    private final static String GESTOR_SQL = "Postgresql";
    //Atributos propios 
    private String gestor;
    private int agnos;

    public AdministradorBD(String gestor, int agnos, String nombre, String apellido, int edad, double sueldo) {
        super(nombre, apellido, edad, sueldo);
        comprobarGestor(gestor);
        this.agnos = agnos;
        aumentoSueldo();
    }

    //Metodo para comprobar el gestor de base de datos
    private void comprobarGestor(String gestor) {
        boolean encontrado = false;
        String gestores[] = {"MySql", "PostgresSQL", "SQLserver"};
        for (int i = 0; i < gestores.length && !encontrado; i++) {
            if (gestor.trim().equalsIgnoreCase(gestores[i])) {
                this.gestor = gestor;
                encontrado = true;
            }
        }
        if (!encontrado) {
            this.gestor = GESTOR_SQL;
        }

    }

    @Override
    public void aumentoSueldo() {
        if (this.agnos >= 5) {
            double n = ((super.getSueldo() * 0.3) + super.getSueldo());
            super.setSueldo(n);
            JOptionPane.showMessageDialog(null,"PLUS del 30% aplicado", "PLUS aplicado",1);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nGestor: " + gestor + "\nAños Experiencia: " + agnos ;
    }
    

}
