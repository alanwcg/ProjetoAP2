package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.bo.CursoBO;
import mvc.model.vo.Curso;
import mvc.view.TelaCadastroCurso;

public class CadastroCursoController implements ActionListener {
	
	private TelaCadastroCurso tela;
	
	public CadastroCursoController(TelaCadastroCurso tela) {
		this.tela = tela;
		this.tela.getBtCadastrar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tela.getBtCadastrar()) {
			try {
				CursoBO cursoBO = new CursoBO();
				Curso curso = getCursoTela();
				cursoBO.salvarCurso(curso);
				tela.limparCampos();
			} catch(Exception ex) {
				ex.printStackTrace();
				tela.exibirAlerta(ex.getMessage());
			}
		}	
	}
	
	public Curso getCursoTela() {
		Curso curso = new Curso();
		curso.setNome(tela.getTfNome().getText());
		curso.setDuracaoAnos(Float.parseFloat(tela.getTfDuracaoAnos().getText()));
		curso.setTurno(tela.getTfTurno().getText());
		curso.setMensalidade(Float.parseFloat(tela.getTfMensalidade().getText()));
		return curso;
	}

}