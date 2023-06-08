package cafeteira;

public class Cafeteira {
	
	private String modelo;
	private String marca;
	private String tipo;

	@Override
	public String toString() {
		return "Cafeteira [modelo=" + modelo + ", marca=" + marca + ", tipo=" + tipo + "]";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
