package semana_03;

public class Balon {
	
	private String marca;
	private double pesoG, presionL, diametroCM, precio;
	
	private static int cantidadBalones;
	private static double acumuladorImporte;
	
	public static final double pi, descuento;
	
	static {
		
		pi = 3.1416;
		descuento = 0.05;
		cantidadBalones = 0;
		acumuladorImporte = 0;
	}

	public Balon(String marca, double pesoG, double presionL, double diametroCM, double precio) {
		this.marca = marca;
		this.pesoG = pesoG;
		this.presionL = presionL;
		this.diametroCM = diametroCM;
		this.precio = precio;
		cantidadBalones++;
		acumuladorImporte+=importePagar();
	}
	
	public Balon(String marca, double pesoG, double presionL) {
		
		this(marca, pesoG, presionL, 18.5, 100.0);
		
	}
	
	public Balon() {
		
		this("Adidas", 1.5, 4.8);
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPesoG() {
		return pesoG;
	}

	public void setPesoG(double pesoG) {
		this.pesoG = pesoG;
	}

	public double getPresionL() {
		return presionL;
	}

	public void setPresionL(double presionL) {
		this.presionL = presionL;
	}

	public double getDiametroCM() {
		return diametroCM;
	}

	public void setDiametroCM(double diametroCM) {
		this.diametroCM = diametroCM;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static int getCantidadBalones() {
		return cantidadBalones;
	}

	public static void setCantidadBalones(int cantidadBalones) {
		Balon.cantidadBalones = cantidadBalones;
	}

	public static double getAcumuladorImporte() {
		return acumuladorImporte;
	}

	public static void setAcumuladorImporte(double acumuladorImporte) {
		Balon.acumuladorImporte = acumuladorImporte;
	}
	
	public double radio() {
		return diametroCM/2;
	}
	
	public double volumen() {
		return 4*pi*radio()*radio()*radio()/3;
	}
	
	public double descuento() {
		return precio*descuento;
	}
	
	public double importePagar() {
		return precio - descuento();
	}

}
