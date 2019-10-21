package practica9pooequipo11;

public class EmpleadoPorHoras extends Empleado{
	private double salario;
	private int horas;
	public EmpleadoPorHoras(String nombre, String apellido, String numseg, double salario,int horas){
	super(nombre, apellido, numseg);
	this.salario=salario;
	this.horas=horas;
	}
	private int gethoras(){
            
		return horas;
	}
	public double ingresos(){
            if (horas<40){
                return salario*horas;
            }
		return (40*salario) + (horas-40) * salario * 1.5;
	}
	public String toString(){
		return super.toString()+"Salario por hora"+ ingresos()+"Las horas que fueron"+ gethoras();
	}
}