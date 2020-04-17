package universitario.models;

public class Universitario {
	
	private String nome;
	private String curso;
	
	public Universitario(String nome, String curso) {
		super();
		this.nome = nome;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public Boolean sono() {
		return true;
	}
	
	public String piorMateria() {
		return "todas";
	}
	
	
	public String avaliarNota(Double nota) {
		if (nota >= 8 && nota <=10) {
			return "mentiroso";
		}
		else if (nota < 8 && nota > 5) {
			return "ta bom, 6 passa";
		}
		
		else if (nota < 5 && nota >= 0) {
			return "boa sorte ano que vem";
		}
		
		else {
			return "Coloca um valor valido cabaço";
		}
	}
	
	
}
