package semana_03;

public class Empleado {
	private int cod, cat, cell;
	private String nombre;
	
	private static int cantidad;
	private static double suma;
	public static final double descuento;
	
	static{
		descuento = 0.15;
		cantidad = 0;
		suma = 0;
	}

	public Empleado(int cod, int cat, int cell, String nombre) {
		this.cod = cod;
		this.cat = cat;
		this.cell = cell;
		this.nombre = nombre;
		cantidad++;
		suma += sueldoNeto();
	}
	public Empleado(int cod,String nombre){
		this(cod,2,999999999,nombre);
	}
	public Empleado(){
		this(4444,"Ninguno");
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getCat() {
		return cat;
	}
	public void setCat(int cat) {
		this.cat = cat;
	}
	public int getCell() {
		return cell;
	}
	public void setCell(int cell) {
		this.cell = cell;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static int getCantidad() {
		return cantidad;
	}
	public static void setCantidad(int cantidad) {
		Empleado.cantidad = cantidad;
	}
	public static double getSuma() {
		return suma;
	}
	public static void setSuma(double suma) {
		Empleado.suma = suma;
	}
	 public double sueldoBruto(){
		 if(cat == 0){
			 return 7200;
		 }else if(cat == 1){
			 return 6300;
		 }else{
			 return 5100;
		 }
		 
	 }
	 public double descuento(){
		 return sueldoBruto() * descuento;
	 }
	 public double sueldoNeto(){
		 return sueldoBruto() - descuento();
	 }
	
}
