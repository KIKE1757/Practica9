package practica9pooequipo11;

public class EmpleadoAsalariado extends Empleado{
	public double salario;
	public EmpleadoAsalariado(String nombre, String apellido, String num, double salario){
		super(nombre, apellido, num);
		this.salario=salario;
	}
	public double ingresos(){
		return salario;
	}
	public String toString(){
		return super.toString() + "\nSalario: " + ingresos();
	}
}