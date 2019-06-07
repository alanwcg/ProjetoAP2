package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.bo.DisciplinaBO;
import mvc.model.vo.Disciplina;
import mvc.view.TelaCadastroDisciplina;

public class CadastroDisciplinaController implements ActionListener {
	
	private TelaCadastroDisciplina tela;
	
	public CadastroDisciplinaController(TelaCadastroDisciplina tela) {
		this.tela = tela;
		this.tela.getBtCadastrar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tela.getBtCadastrar()) {
			try {
				DisciplinaBO disciplinaBO = new DisciplinaBO();
				Disciplina disciplina = getDisciplinaTela();
				disciplinaBO.salvarDisciplina(disciplina);
				tela.limparCampos();
			} catch(Exception ex) {
				ex.printStackTrace();
				tela.exibirAlerta(ex.getMessage());
			}
		}
	}
	
	public Disciplina getDisciplinaTela() {
		Disciplina disciplina = new Disciplina();
		disciplina.setNome(tela.getTfNome().getText());
		disciplina.setCargaHoraria(Integer.parseInt(tela.getTfCargaHoraria().getText()));
		disciplina.setModalidade(tela.getTfModalidade().getText());
		return disciplina;
	}

}