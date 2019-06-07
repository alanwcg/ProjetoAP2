package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.bo.DisciplinaAlunoBO;
import mvc.model.vo.DisciplinaAluno;
import mvc.view.TelaRelacionarDisciplinaAluno;

public class RelacionarDisciplinaAlunoController implements ActionListener {
	
	private TelaRelacionarDisciplinaAluno tela;
	
	public RelacionarDisciplinaAlunoController(TelaRelacionarDisciplinaAluno tela) {
		this.tela = tela;
		this.tela.getBtRelacionar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tela.getBtRelacionar()) {
			try {
				DisciplinaAlunoBO daBO = new DisciplinaAlunoBO();
				DisciplinaAluno da = getDisciplinaAlunoTela();
				daBO.salvarDisciplinaAluno(da);
				tela.limparCampos();
			} catch(Exception ex) {
				ex.printStackTrace();
				tela.exibirAlerta(ex.getMessage());
			}
		}
		
	}
	
	public DisciplinaAluno getDisciplinaAlunoTela() {
		DisciplinaAluno da = new DisciplinaAluno();
		da.setCodigoDisciplina(Integer.parseInt(tela.getTfCodigoDisciplina().getText()));
		da.setMatriculaAluno(Integer.parseInt(tela.getTfMatriculaAluno().getText()));
		da.setFrequencia(Integer.parseInt(tela.getTfFrequencia().getText()));
		da.setNota(Float.parseFloat(tela.getTfNotaFinal().getText()));
		return da;
	}

}