package mvc.model.vo;

public class DisciplinaCurso {
	
	private int codigoDisciplina, codigoCurso;
	
	private String nomeCurso, nomeDisciplina, modalidadeDisciplina;

	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getModalidadeDisciplina() {
		return modalidadeDisciplina;
	}

	public void setModalidadeDisciplina(String modalidadeDisciplina) {
		this.modalidadeDisciplina = modalidadeDisciplina;
	}

}