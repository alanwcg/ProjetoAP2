package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.bo.DisciplinaCursoBO;
import mvc.model.vo.DisciplinaCurso;
import mvc.view.TelaRelacionarDisciplinaCurso;

public class RelacionarDisciplinaCursoController implements ActionListener {
	
	private TelaRelacionarDisciplinaCurso tela;
	
	public RelacionarDisciplinaCursoController(TelaRelacionarDisciplinaCurso tela) {
		this.tela = tela;
		this.tela.getBtRelacionar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tela.getBtRelacionar()) {
			try {
				DisciplinaCursoBO dcBO = new DisciplinaCursoBO();
				DisciplinaCurso dc = getDisciplinaCursoTela();
				dcBO.salvarDisciplinaCurso(dc);
				tela.limparCampos();
			} catch(Exception ex) {
				ex.printStackTrace();
				tela.exibirAlerta(ex.getMessage());
			}
		}
		
	}
	
	public DisciplinaCurso getDisciplinaCursoTela() {
		DisciplinaCurso dc = new DisciplinaCurso();
		dc.setCodigoDisciplina(Integer.parseInt(tela.getTfCodigoDisciplina().getText()));
		dc.setCodigoCurso(Integer.parseInt(tela.getTfCodigoCurso().getText()));
		return dc;
	}

}