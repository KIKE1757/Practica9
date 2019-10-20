public class Empleadoporhora extends Empleado{
	private float salario;
	private int horas;
	public Empleadoporhora(String nombre, String apellido, String numseg, int horas, int salario){
	super(nombre, apellido, numseg);
	this.salario=salario;
	this.horas=horas;
	}
	private int gethoras(){
		return horas;
	}
	private float ingresos(){
		return (salario*horas);
	}
	public String toString(){
		return super.toString()+"Salario por hora"+ ingresos()+"Las horas que fueron"+ gethoras();
	}
}