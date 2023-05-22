package edu.pe.idat.model;
//Nª2
//aqui colocaremos nuestro modelo de datos de nuestra tabla
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity                //anotacion de jpa para que pueda comunicar con la BD
@Table(name ="curso") //para relacionarme con mi BD, aqui va el nombre real de mi tabla
public class Curso {
	
	@Id                                                  //identifica el id de la tabla
	@GeneratedValue(strategy = GenerationType.IDENTITY) //para manejar el autoIncremental
	private int idcurso;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "ciclo")
	private int ciclo;
	
	@Column(name = "creditos")
	private int creditos;

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(int idcurso, String nombre, int ciclo, int creditos) {
		super();
		this.idcurso = idcurso;
		this.nombre = nombre;
		this.ciclo = ciclo;
		this.creditos = creditos;
	}

	public int getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCiclo() {
		return ciclo;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	
	
}
