package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.bo.AlunoBO;
import mvc.model.vo.Aluno;
import mvc.view.TelaCadastroAluno;

public class CadastroAlunoController implements ActionListener {
	
	private TelaCadastroAluno tela;
	
	public CadastroAlunoController(TelaCadastroAluno tela) {
		this.tela = tela;
		this.tela.getBtCadastrar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tela.getBtCadastrar()) {
			try {
				AlunoBO alunoBO = new AlunoBO();
				Aluno aluno = getAlunoTela();
				alunoBO.salvarAluno(aluno);
				tela.limparCampos();
			} catch(Exception ex) {
				ex.printStackTrace();
				tela.exibirAlerta(ex.getMessage());
			}
		}
	}
	
	public Aluno getAlunoTela() {
		Aluno aluno = new Aluno();
		aluno.setNome(tela.getTfNome().getText());
		aluno.setCpf(tela.getTfCpf().getText());
		aluno.setDataNascimento(tela.getTfDataNascimento().getText());
		aluno.setRua(tela.getTfRua().getText());
		aluno.setNumero(Integer.parseInt(tela.getTfNumero().getText()));
		aluno.setCep(tela.getTfCep().getText());
		aluno.setBairro(tela.getTfBairro().getText());
		aluno.setCidade(tela.getTfCidade().getText());
		aluno.setUf(tela.getTfUf().getText());
		aluno.setDataMatriculaCurso(tela.getTfDataMatriculaCurso().getText());
		aluno.setCodigoCurso(Integer.parseInt(tela.getTfCodigoCurso().getText()));
		return aluno;
	}

}