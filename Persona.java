package ProyectTests.Tests;

import java.util.List;

public class Persona {
	protected String nombre;
	protected int tel1;
	protected int tel2;
	protected int documento;
	protected String usuario;
	protected String contrasenia;
	protected String correo;
	protected List<Producto> listaProductos;
	
	
	public Persona(String nNombre, int nTel1, int nTel2, int nDocumento,String nUsuario, String nContrasenia, String nCorreo)
	{
		this.nombre = nNombre;
		this.tel1 = nTel1;
		this.tel2 = nTel2;
		this.documento = nDocumento;
		this.usuario = nUsuario;
		this.contrasenia = nContrasenia;
		this.correo = nCorreo;
		this.listaProductos = null;
	}
	
	public void modificar(Persona persona,String nombre, int tel1, int tel2, int documento,String usurio, String contrasenia, String correo)
	{
		persona.setNombre(nombre);
		persona.setTel1(tel1);
		persona.setTel2(tel2);
		persona.setDocumento(documento);
		persona.setUsuario(usurio);
		persona.setContrasenia(contrasenia);
		persona.setCorreo(correo);
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
}
