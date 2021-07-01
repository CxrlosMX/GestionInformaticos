/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import clasePadre.Informaticos;
import clasesHijas.AdministradorBD;
import clasesHijas.Programador;
import control.ControlEmpleados;
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
public class Main {

    public static void main(String[] args) {
        int op = 0, opi = 0;
        String n;
        Informaticos a;
        ControlEmpleados control = new ControlEmpleados();
        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU PRINCIPAL\n"
                        + "1.-Agregar Informatico"
                        + "\n2.-Eliminar "
                        + "\n3.-Buscar"
                        + "\n4.-Mostrar"
                        + "\n5.-Precio Total"
                        + "\n6.-Precio Instancias"
                        + "\n7.-Salir"
                        + "\n¿Que desea realizar?", "MENU", 3));
                switch (op) {
                    case 1: {
                        do {
                            try {

                                opi = Integer.parseInt(JOptionPane.showInputDialog(null, "AGREGAR\n"
                                        + "1.-Agregar Programador"
                                        + "\n2.-Agregar Administrador BD"
                                        + "\n3.-Salir al menu principal\n¿Que desea realizar?", "Agregar", 3));
                                switch (opi) {
                                    case 1: {
                                        a = control.insertValues(1);
                                        control.addInformatico(a);
                                        break;
                                    }
                                    case 2: {
                                        a = control.insertValues(2);
                                        control.addInformatico(a);
                                        break;
                                    }
                                    case 3: {
                                        JOptionPane.showMessageDialog(null, "Saliendo al menu Principal", "Saliendo", 1);
                                        break;
                                    }
                                    default: {
                                        JOptionPane.showMessageDialog(null, "Introduce valores validor", "Valores no validos", 2);
                                        break;
                                    }
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", 0);
                            }
                        } while (opi != 3);

                        break;
                    }
                    case 2: {
                        if (control.haveElements()) {
                            n = JOptionPane.showInputDialog(null, "Introduce el nombre el nombre del usuario a eliminar", "Eliminando", 1);
                            control.deleteInformatic(n);
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista Vacia", "Lista Vacia", 0);

                        }
                        break;
                    }
                    case 3: {
                        if (control.haveElements()) {
                            n = JOptionPane.showInputDialog(null, "Introduce el nombre el nombre del usuario", "Buscando", 1);
                            control.serchName(n);
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista Vacia", "Lista Vacia", 0);
                        }
                        break;
                    }
                    case 4: {
                        if (control.haveElements()) {
                            control.showInformaticos();
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista Vacia", "Lista Vacia", 0);
                        }
                        break;
                    }
                    case 5: {
                        if (control.haveElements()) {
                            control.salaryTotal();
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista Vacia", "Lista Vacia", 0);
                        }
                        break;
                    }
                    case 6: {
                        if (control.haveElements()) {
                          control.priceEachInstance();
                        } else {
                            JOptionPane.showMessageDialog(null, "Lista Vacia", "Lista Vacia", 0);
                        }
                        break;
                    }
                    case 7: {
                        JOptionPane.showMessageDialog(null, "Cerrando programa", "Saliendo", 2);
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Introduce valores validor", "Valores no validos", 2);

                        break;
                    }

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", 0);
            }

        } while (op != 7);

        /*   ControlEmpleados control = new ControlEmpleados();
         Programador p = new Programador("a", "a", "FullStack", "Carlos", "Rendon", 20, 100);
         AdministradorBD a = new AdministradorBD("", 5, "Luis", "Rendon", 20, 100);
         control.addInformatico(a);
         control.addInformatico(p);
         control.showInformaticos();
         control.priceEachInstance();
         control.salaryTotal();*/
    }

}
