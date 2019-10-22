package practica9pooequipo11;

public class EmpleadoPorComision extends Empleado{
    private int ventasTotales;
    private double tasaComision;
    public EmpleadoPorComision(String nombre, String apellido, String num, int ventasTotales, double tasaComision){
		super(nombre, apellido, num);
                this.ventasTotales=ventasTotales;
		this.tasaComision=tasaComision;
	}
    public int getVentasTotales(){
        return ventasTotales;
    }
    public double getTasaComision(){
        return tasaComision;
    }
    public double ingresos(){
        return getTasaComision()*getVentasTotales();
    }
    public String toString(){
		return super.toString() + "\nTasa comision " + ingresos();
    }
}
