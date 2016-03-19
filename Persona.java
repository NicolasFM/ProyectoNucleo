package ProyectTests.Tests;

public class Persona {
	protected String nombre;
	protected int tel1;
	protected int tel2;
	protected int documento;
	
	public Persona(String nNombre, int nTel1, int nTel2, int nDocumento)
	{
		this.nombre = nNombre;
		this.tel1 = nTel1;
		this.tel2 = nTel2;
		this.documento = nDocumento;
	}
	
	public void modificar(Persona persona,String nombre, int tel1, int tel2, int documento)
	{
		persona.setNombre(nombre);
		persona.setTel1(tel1);
		persona.setTel2(tel2);
		persona.setDocumento(documento);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTel1() {
		return tel1;
	}

	public void setTel1(int tel1) {
		this.tel1 = tel1;
	}

	public int getTel2() {
		return tel2;
	}

	public void setTel2(int tel2) {
		this.tel2 = tel2;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}
	
	
}
