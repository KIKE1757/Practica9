
public class Empleado(){
	public String nombre;
	public String apellido;
	public int num_seguro;
	public Empleado(String n, String a, int num){
		nombre = n;
		apellido = a;
		num_seguro = num;
	}
	public abstract int ingresos(){}
	public String getNombre(){
		return Empleado.nombre;
	}
	public String getApellido(){
		return Empleado.apellido;
	}
	public int getNumSeguro(){
		return Empleado.num_seguro;
	}
	public abstract String toString(){
		return "Nombre: "+getNombre() +", Apellido: "+getApellido()+", Numero de Seguro social: "+getNumSeguro();  
	}
}