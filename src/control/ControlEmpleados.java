/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import clasePadre.Informaticos;
import clasesHijas.AdministradorBD;
import clasesHijas.Programador;
import java.util.ArrayList;
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
public class ControlEmpleados {

    ArrayList<Informaticos> arreglo;
    int p;

    public ControlEmpleados() {
        arreglo = new ArrayList<Informaticos>();
        p = -1;
    }

    //Rellenar Objetos
    public Informaticos insertValues(int i) {
        Informaticos a = null;
        String nombre = JOptionPane.showInputDialog(null, "Introduce el Nombre", ((i == 1) ? "Programador" : "Administrador BD"), 1); //Uso operador ternario
        String apellido = JOptionPane.showInputDialog(null, "Introduce el Apellido", ((i == 1) ? "Programador" : "Administrador BD"), 1);
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la edad", ((i == 1) ? "Programador" : "Administrador BD"), 1));
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el sueldo", ((i == 1) ? "Programador" : "Administrador BD"), 1));
        if (i == 1) {
            String nivel = JOptionPane.showInputDialog(null, "Introduce tu experiencia", "Programador", 1);
            String lenguaje = JOptionPane.showInputDialog(null, "Introduce el Lenguaje que dominas", "Programador", 1);
            String tipo = JOptionPane.showInputDialog(null, "Introduce el tipo de Programador", "Programador", 1);
            a = new Programador(nivel, lenguaje, tipo, nombre, apellido, edad, sueldo);
        } else {
            String gestor = JOptionPane.showInputDialog(null, "Introduce el gestor especializado", "Administrador BD", 1);
            int agnos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce los años de experiencia", "Administrador BD", 1));
            a = new AdministradorBD(gestor, agnos, nombre, apellido, edad, sueldo);
        }
        return a;

    }

    //Metodo para agregar Informaticos
    public void addInformatico(Informaticos a) {
        arreglo.add(a);
        p++;
    }

    //Metodo para eliminar un Informatico por el nombre
    public void deleteInformatic(String n) {
        if (haveElements()) {
            boolean encontrado = false;
            for (int i = 0; i < arreglo.size() && !encontrado; i++) {
                if (n.trim().equalsIgnoreCase(arreglo.get(i).getNombre())) {
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado\n " + arreglo.get(i).getNombre(), "Usuario Eliminado", 1);
                    arreglo.remove(i);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Error al eliminar", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista Vacia", "Lista Vacia", 0);
        }
    }

    //Metodo para buscar un Informatico
    public void serchName(String n) {
        if (haveElements()) {
            boolean encontrado = false;
            for (int i = 0; i < arreglo.size() && !encontrado; i++) {
                if (n.trim().equalsIgnoreCase(arreglo.get(i).getNombre())) {
                    JOptionPane.showMessageDialog(null, "Informatico Encontrado\n " + arreglo.get(i).toString(), "Usuario Encontrado", 1);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Error en busqueda", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista Vacia", "Lista Vacia", 0);
        }
    }

    //Metodo para mostrar a todo el personal
    public void showInformaticos() {
        if (haveElements()) {
            String m = "";
            for (Informaticos a : arreglo) {
                m = m  + a+ "\n------------\n";
            }
            JOptionPane.showMessageDialog(null, m, "Mostrando Informacion", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Lista Vacia", "Lista Vacia", 0);
        }
    }

    //Metodo que muestra  salarios
    public void salaryTotal() {
        if (haveElements()) {
            double n = 0;
            for (Informaticos a : arreglo) {
                n += a.getSueldo();
            }
            JOptionPane.showMessageDialog(null, "Total Salarios: " + n + "$", "Salario", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Lista Vacia", "Lista Vacia", 0);
        }

    }

    public void priceEachInstance() {
        if (haveElements()) {
            double a = 0, b = 0;
            for (Informaticos o : arreglo) {
                if (o instanceof Programador) {
                    a += o.getSueldo();
                } else {
                    b = +o.getSueldo();
                }
            }
            JOptionPane.showMessageDialog(null, "Total Salarios:\n" + "Programador: " + a
                    + "$\n" + "Administrador Base de datos: " + b + "$", "Salario Instancias", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Lista Vacia", "Lista Vacia", 0);
        }

    }

    //Verificar vacio
    public boolean haveElements() {
        return (p >= 0);
    }
}
