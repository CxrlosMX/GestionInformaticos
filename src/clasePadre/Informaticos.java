/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasePadre;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 30/06/2021
 *
 */
public  class Informaticos {

    private String nombre;
    private String apellido;
    private int edad;
    private double sueldo;

    public Informaticos(String nombre, String apellido, int edad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public  void aumentoSueldo(){
    
    }
    
    

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido:" + apellido + "\nEdad: " + edad + "\nSueldo:" + sueldo;
    }

}
