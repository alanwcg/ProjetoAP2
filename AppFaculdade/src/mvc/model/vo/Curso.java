package mvc.model.vo;

public class Curso {
	
	private int codigo;
	private String nome;
	private float duracaoAnos;
	private String turno;
	private float mensalidade;
	
	private int qtdAlunos;
	
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
	
	public float getDuracaoAnos() {
		return duracaoAnos;
	}
	
	public void setDuracaoAnos(float duracaoAnos) {
		this.duracaoAnos = duracaoAnos;
	}
	
	public String getTurno() {
		return turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public float getMensalidade() {
		return mensalidade;
	}
	
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	
	public void validarCurso() throws Exception{
		if((turno.equals("Manhã")) || (turno.equals("Tarde")) || (turno.equals("Noite"))) {
			//Não faz nada
		} else {
			throw new Exception("Turno Inválido!");
		}
	}
	
	@Override
	public boolean equals(Object o) {
		Curso curso = (Curso) o;
		if(nome.equals(curso.getNome())) {
			return true;
		}
		return false;
	}

}