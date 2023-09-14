package semana_03;

public class Consultor {
	
	private int codigo, horasTrabajadas;
	private double tarifaHora;
	private String nombre; 
	
	private static int cantidadConsultor;
	private static double acumuladorSueldo;
	
	public static final double AFP, EPS;
	
	static {
		
		AFP = 0.10;
		EPS = 0.05;
		cantidadConsultor = 0;
		acumuladorSueldo = 0;
	}

	public Consultor(int codigo, int horasTrabajadas, double tarifaHora, String nombre) {
		this.codigo = codigo;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
		this.nombre = nombre;
		cantidadConsultor++;
		acumuladorSueldo+=sueldoNeto();
	}
	
	public Consultor(int codigo, String nombre, int horasTrabajadas) {
		this(codigo, horasTrabajadas, 65.0, nombre);
		
	}

	public Consultor() {
		this(333, "Juan", 30);
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getTarifaHora() {
		return tarifaHora;
	}

	public void setTarifaHora(double tarifaHora) {
		this.tarifaHora = tarifaHora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getCantidadConsultor() {
		return cantidadConsultor;
	}

	public static void setCantidadConsultor(int cantidadConsultor) {
		Consultor.cantidadConsultor = cantidadConsultor;
	}

	public static double getAcumuladorSueldo() {
		return acumuladorSueldo;
	}

	public static void setAcumuladorSueldo(double acumuladorSueldo) {
		Consultor.acumuladorSueldo = acumuladorSueldo;
	}
	
	public double sueldoBruto() {
		return horasTrabajadas * tarifaHora;
	}
	
	public double descuentoAFP() {
		return sueldoBruto() * AFP;
	}
	
	public double descuentoEPS() {
		return sueldoBruto() * EPS;
	}
	
	public double sueldoNeto() {
		return sueldoBruto() - descuentoAFP() - descuentoEPS();
	}
	
}
