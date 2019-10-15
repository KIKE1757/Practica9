public class EmpleadoAsalariado extends Empleado{
	public float salario;
	public EmpleadoAsalariado(String nombre, String apellido, String num, float salario){
		super(nombre, apellido, num);
		this.salario=salario;
	}
	public float ingresos(){
		return salario;
	}
	public String toString(){
		return super.toString() + ", Salario: " + ingresos();
	}
}