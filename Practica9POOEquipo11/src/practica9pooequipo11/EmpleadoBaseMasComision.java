/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9pooequipo11;

/**
 *
 * @author velaz
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salario;
    public EmpleadoBaseMasComision(String nombre, String apellido, String num, double salario, double tasaComision, int ventasTotales) {
        super(nombre, apellido, num, ventasTotales, tasaComision);
        this.salario=salario;
    }
    public double getSalarioBase() {
        return salario;
    }

    public void setSalarioBase(double d) {
        this.salario=d;
    }
    public double ingresos(){
        return getSalarioBase()+super.ingresos();
    }
    public String toString(){
		return super.toString();
    }


   

    
}
