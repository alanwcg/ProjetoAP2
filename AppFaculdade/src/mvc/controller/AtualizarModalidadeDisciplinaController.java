package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.bo.DisciplinaBO;
import mvc.model.vo.Disciplina;
import mvc.view.TelaAtualizarModalidadeDisciplina;

public class AtualizarModalidadeDisciplinaController implements ActionListener {
	
	private TelaAtualizarModalidadeDisciplina tela;
	
	public AtualizarModalidadeDisciplinaController(TelaAtualizarModalidadeDisciplina tela) {
		this.tela = tela;
		this.tela.getBtAtualizar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tela.getBtAtualizar()) {
			try {
				DisciplinaBO disciplinaBO = new DisciplinaBO();
				Disciplina disciplina = getModalidadeTela();
				disciplinaBO.atualizarDisciplina(disciplina);
				tela.limparCampos();
			} catch(Exception ex) {
				ex.printStackTrace();
				tela.exibirAlerta(ex.getMessage());
			}
		}
	}
	
	public Disciplina getModalidadeTela() {
		Disciplina disciplina = new Disciplina();
		disciplina.setCodigo(Integer.parseInt(tela.getTfCodigo().getText()));
		disciplina.setModalidade(tela.getTfModalidade().getText());
		return disciplina;
	}

}