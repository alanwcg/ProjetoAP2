package mvc.model.vo;

public class Aluno {
	
	private int matricula;
	private String nome, cpf, dataNascimento, rua;
	private int numero;
	private String cep, bairro, cidade, uf, dataMatriculaCurso;
	private int codigoCurso;
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getDataMatriculaCurso() {
		return dataMatriculaCurso;
	}
	
	public void setDataMatriculaCurso(String dataMatriculaCurso) {
		this.dataMatriculaCurso = dataMatriculaCurso;
	}
	
	public int getCodigoCurso() {
		return codigoCurso;
	}
	
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
	@Override
	public boolean equals(Object o) {
		Aluno aluno = (Aluno) o;
		if(nome.equals(aluno.getNome()) && rua.equals(aluno.getRua()) && numero == aluno.getNumero()
				&& cidade.equals(aluno.getCidade())) {
			return true;
		}
		return false;
	}
	
}