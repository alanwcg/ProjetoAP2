package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.bo.AlunoBO;
import mvc.model.vo.Aluno;
import mvc.view.TelaAtualizarEnderecoAluno;

public class AtualizarEnderecoAlunoController implements ActionListener {
	
	private TelaAtualizarEnderecoAluno tela;
	
	public AtualizarEnderecoAlunoController(TelaAtualizarEnderecoAluno tela) {
		this.tela = tela;
		this.tela.getBtAtualizar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tela.getBtAtualizar()) {
			try {
				AlunoBO alunoBO = new AlunoBO();
				Aluno aluno = getEnredecoAlunoTela();
				alunoBO.atualizarAluno(aluno);
				tela.limparCampos();
			} catch(Exception ex) {
				ex.printStackTrace();
				tela.exibirAlerta(ex.getMessage());
			}
		}	
	}
	
	public Aluno getEnredecoAlunoTela() {
		Aluno aluno = new Aluno();
		aluno.setRua(tela.getTfRua().getText());
		aluno.setNumero(Integer.parseInt(tela.getTfNumero().getText()));
		aluno.setCep(tela.getTfCep().getText());
		aluno.setBairro(tela.getTfBairro().getText());
		aluno.setCidade(tela.getTfCidade().getText());
		aluno.setUf(tela.getTfUf().getText());
		aluno.setMatricula(Integer.parseInt(tela.getTfMatricula().getText()));
		return aluno;
	}

}