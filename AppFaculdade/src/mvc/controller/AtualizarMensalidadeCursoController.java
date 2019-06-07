package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.bo.CursoBO;
import mvc.model.vo.Curso;
import mvc.view.TelaAtualizarMensalidadeCurso;

public class AtualizarMensalidadeCursoController implements ActionListener {
	
	private TelaAtualizarMensalidadeCurso tela;
	
	public AtualizarMensalidadeCursoController(TelaAtualizarMensalidadeCurso tela) {
		this.tela = tela;
		this.tela.getBtAtualizar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tela.getBtAtualizar()) {
			try {
				CursoBO cursoBO = new CursoBO();
				Curso curso = getMensalidadeTela();
				cursoBO.atualizarCurso(curso);
				tela.limparCampos();
			} catch(Exception ex) {
				ex.printStackTrace();
				tela.exibirAlerta(ex.getMessage());
			}
		}
	}
	
	public Curso getMensalidadeTela() {
		Curso curso = new Curso();
		curso.setCodigo(Integer.parseInt(tela.getTfCodigo().getText()));
		curso.setMensalidade(Float.parseFloat(tela.getTfMensalidade().getText()));
		return curso;
	}

}