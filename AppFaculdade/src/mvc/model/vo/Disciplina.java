package mvc.model.vo;

public class Disciplina {
	
	private int codigo;
	private String nome;
	private int cargaHoraria;
	private String modalidade;
	
	private float media;
	private String avaliacao;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getModalidade() {
		return modalidade;
	}
	
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public String getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public float getMedia() {
		return media;
	}
	
	public void setMedia(float media) {
		this.media = media;
	}
	
	public void validarDisciplina() throws Exception {
		if((modalidade.equals("Presencial")) || (modalidade.equals("EAD"))) {
			//Não faz nada
		} else {
			throw new Exception("Modalidade Inválida!");
		}
	}
	
	@Override
	public boolean equals(Object o) {
		Disciplina disciplina = (Disciplina) o;
		if(nome.equals(disciplina.getNome()) && modalidade.equals(disciplina.getModalidade())) {
			return true;
		}
		return false;
	}

}