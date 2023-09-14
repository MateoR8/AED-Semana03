package semana_03;

public class Asesor {
	
	private String nomAsesor;
	private int dni, codigo;
	private double dolares;
	
	private static int cantidad;
	private static double acumulador;
	
	public static final String institucion;
	
	static {
		institucion = "Cibertec";
		cantidad = 0;
		acumulador = 0;
	}

	public Asesor(String nomAsesor, int dni, int codigo, double dolares) {
		this.nomAsesor = nomAsesor;
		this.dni = dni;
		this.codigo = codigo;
		this.dolares = dolares;
		cantidad++;
		acumulador+=dolares;;
	}
	
	public Asesor(String nomAsesor, int dni) {
		this(nomAsesor, dni, 55555, 2000.0);
	}
	
	public Asesor() {
		this("NN" , 88888888);
	}

	public String getNomAsesor() {
		return nomAsesor;
	}

	public void setNomAsesor(String nomAsesor) {
		this.nomAsesor = nomAsesor;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getDolares() {
		return dolares;
	}

	public void setDolares(double dolares) {
		this.dolares = dolares;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Asesor.cantidad = cantidad;
	}

	public static double getAcumulador() {
		return acumulador;
	}

	public static void setAcumulador(double acumulador) {
		Asesor.acumulador = acumulador;
	}

}
