package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import mvc.model.bo.AlunoBO;
import mvc.model.bo.CursoBO;
import mvc.model.bo.DisciplinaAlunoBO;
import mvc.model.bo.DisciplinaBO;
import mvc.model.bo.DisciplinaCursoBO;
import mvc.model.vo.Aluno;
import mvc.model.vo.Curso;
import mvc.model.vo.Disciplina;
import mvc.model.vo.DisciplinaAluno;
import mvc.model.vo.DisciplinaCurso;
import mvc.view.TelaAproveitamentoDisciplinas;
import mvc.view.TelaAtualizarEnderecoAluno;
import mvc.view.TelaAtualizarMensalidadeCurso;
import mvc.view.TelaAtualizarModalidadeDisciplina;
import mvc.view.TelaCadastroAluno;
import mvc.view.TelaCadastroCurso;
import mvc.view.TelaCadastroDisciplina;
import mvc.view.TelaPrincipal;
import mvc.view.TelaRelacionarDisciplinaAluno;
import mvc.view.TelaRelacionarDisciplinaCurso;
import mvc.view.TelaTabelaAlunos;
import mvc.view.TelaTabelaCursos;
import mvc.view.TelaTabelaDisciplinas;
import mvc.view.TelaTabelaDisciplinasAlunos;
import mvc.view.TelaTabelaDisciplinasCursos;
import mvc.view.TelaTabelaQuantidadeAlunosCursos;

public class AppController implements ActionListener {
	
	private TelaPrincipal telaPrincipal;
	
	public AppController(TelaPrincipal telaPrincipal) {
		this.telaPrincipal = telaPrincipal;
		this.telaPrincipal.getBtAlunoCadastrar().addActionListener(this);
		this.telaPrincipal.getBtAlunoListar().addActionListener(this);
		this.telaPrincipal.getBtAlunoAtualizar().addActionListener(this);
		this.telaPrincipal.getBtAlunoDeletar().addActionListener(this);
		
		this.telaPrincipal.getBtCursoCadastrar().addActionListener(this);
		this.telaPrincipal.getBtCursoListar().addActionListener(this);
		this.telaPrincipal.getBtCursoAtualizar().addActionListener(this);
		this.telaPrincipal.getBtCursoDeletar().addActionListener(this);
		
		this.telaPrincipal.getBtDisciplinaCadastrar().addActionListener(this);
		this.telaPrincipal.getBtDisciplinaListar().addActionListener(this);
		this.telaPrincipal.getBtDisciplinaAtualizar().addActionListener(this);
		this.telaPrincipal.getBtDisciplinaDeletar().addActionListener(this);
		
		this.telaPrincipal.getBtDARelacionar().addActionListener(this);
		this.telaPrincipal.getBtDCRelacionar().addActionListener(this);
		
		this.telaPrincipal.getBtMostrar1().addActionListener(this);
		this.telaPrincipal.getBtMostrar2().addActionListener(this);
		this.telaPrincipal.getBtMostrar3().addActionListener(this);
		this.telaPrincipal.getBtMostrar4().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Aluno:
		if(e.getSource() == telaPrincipal.getBtAlunoCadastrar()) {
			try {
				TelaCadastroAluno tela = new TelaCadastroAluno();
				new CadastroAlunoController(tela);
				tela.setVisible(true);
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		if(e.getSource() == telaPrincipal.getBtAlunoAtualizar()) {
			try {
				TelaAtualizarEnderecoAluno tela = new TelaAtualizarEnderecoAluno();
				new AtualizarEnderecoAlunoController(tela);
				tela.setVisible(true);
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		if(e.getSource() == telaPrincipal.getBtAlunoListar()) {
			try {
				carregarAlunos();
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		if(e.getSource() == telaPrincipal.getBtAlunoDeletar()) {
			try {
				AlunoBO alunoBO = new AlunoBO();
				Aluno aluno = getMatriculaTela();
				alunoBO.deletarAluno(aluno);
				telaPrincipal.getTfAluno().setText("");
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		
		//Curso:
		if(e.getSource() == telaPrincipal.getBtCursoCadastrar()) {
			try {
				TelaCadastroCurso tela = new TelaCadastroCurso();
				new CadastroCursoController(tela);
				tela.setVisible(true);
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		if(e.getSource() == telaPrincipal.getBtCursoListar()) {
			try {
				carregarCursos();
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		if(e.getSource() == telaPrincipal.getBtCursoAtualizar()) {
			try {
				TelaAtualizarMensalidadeCurso tela = new TelaAtualizarMensalidadeCurso();
				new AtualizarMensalidadeCursoController(tela);
				tela.setVisible(true);
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		if(e.getSource() == telaPrincipal.getBtCursoDeletar()) {
			try {
				CursoBO cursoBO = new CursoBO();
				Curso curso = getCodigoCursoTela();
				cursoBO.deletarCurso(curso);
				telaPrincipal.getTfCurso().setText("");
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		if(e.getSource() == telaPrincipal.getBtMostrar1()) {
			try {
				carregarQuantidadeAlunosCursos();
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		
		//Disciplina:
		if(e.getSource() == telaPrincipal.getBtDisciplinaCadastrar()) {
			try {
				TelaCadastroDisciplina tela = new TelaCadastroDisciplina();
				new CadastroDisciplinaController(tela);
				tela.setVisible(true);
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		if(e.getSource() == telaPrincipal.getBtDisciplinaListar()) {
			try {
				carregarDisciplinas();
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		if(e.getSource() == telaPrincipal.getBtDisciplinaAtualizar()) {
			try {
				TelaAtualizarModalidadeDisciplina tela = new TelaAtualizarModalidadeDisciplina();
				new AtualizarModalidadeDisciplinaController(tela);
				tela.setVisible(true);
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		if(e.getSource() == telaPrincipal.getBtDisciplinaDeletar()) {
			try {
				DisciplinaBO disciplinaBO = new DisciplinaBO();
				Disciplina disciplina = getCodigoDisciplinaTela();
				disciplinaBO.deletarDisciplina(disciplina);
				telaPrincipal.getTfDisciplina().setText("");
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		
		//Disciplina - Aluno:
		if(e.getSource() == telaPrincipal.getBtDARelacionar()) {
			try {
				TelaRelacionarDisciplinaAluno tela = new TelaRelacionarDisciplinaAluno();
				new RelacionarDisciplinaAlunoController(tela);
				tela.setVisible(true);
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		if(e.getSource() == telaPrincipal.getBtMostrar2()) {
			try {
				carregarDisciplinasAluno();
				telaPrincipal.getTfPesquisa2().setText("");
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		if(e.getSource() == telaPrincipal.getBtMostrar4()) {
			try {
				carregarAproveitamentoDisciplinas();
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		
		//Disciplina - Curso:
		if(e.getSource() == telaPrincipal.getBtDCRelacionar()) {
			try {
				TelaRelacionarDisciplinaCurso tela = new TelaRelacionarDisciplinaCurso();
				new RelacionarDisciplinaCursoController(tela);
				tela.setVisible(true);
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
		if(e.getSource() == telaPrincipal.getBtMostrar3()) {
			try {
				carregarDisciplinasCurso();
				telaPrincipal.getTfPesquisa3().setText("");
			} catch(Exception ex) {
				ex.printStackTrace();
				telaPrincipal.exibirAlerta(ex.getMessage());
			}
		}
	}
	
	public void carregarAlunos() {
		try {
			TelaTabelaAlunos tela = new TelaTabelaAlunos();
			AlunoBO alunoBO = new AlunoBO();
			List<Aluno> lista = alunoBO.retornarAlunos();
			for(Aluno aluno : lista) {
				tela.adicionarAlunoTabela(aluno);
			}
			tela.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
			telaPrincipal.exibirAlerta(e.getMessage());
		}	
	}
	
	public void carregarCursos() {
		try {
			TelaTabelaCursos tela = new TelaTabelaCursos();
			CursoBO cursoBO = new CursoBO();
			List<Curso> lista = cursoBO.retornarCursos();
			for(Curso curso : lista) {
				tela.adicionarCursoTabela(curso);
			}
			tela.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
			telaPrincipal.exibirAlerta(e.getMessage());
		}	
	}
	
	public void carregarQuantidadeAlunosCursos() {
		try {
			TelaTabelaQuantidadeAlunosCursos tela = new TelaTabelaQuantidadeAlunosCursos();
			CursoBO cursoBO = new CursoBO();
			List<Curso> lista = cursoBO.retornarQuantidadeAlunosCursos();
			for(Curso curso : lista) {
				tela.adicionarQuantidadeAlunosTabela(curso);;
			}
			tela.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
			telaPrincipal.exibirAlerta(e.getMessage());
		}	
	}
	
	public void carregarDisciplinas() {
		try {
			TelaTabelaDisciplinas tela = new TelaTabelaDisciplinas();
			DisciplinaBO disciplinaBO = new DisciplinaBO();
			List<Disciplina> lista = disciplinaBO.retornarDisciplinas();
			for(Disciplina disciplina : lista) {
				tela.adicionarDisciplinaTabela(disciplina);
			}
			tela.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
			telaPrincipal.exibirAlerta(e.getMessage());
		}	
	}
	
	public void carregarDisciplinasAluno() {
		try {
			TelaTabelaDisciplinasAlunos tela = new TelaTabelaDisciplinasAlunos();
			DisciplinaAlunoBO daBO = new DisciplinaAlunoBO();
			List<DisciplinaAluno> lista = daBO.retornarDisciplinasAluno(getDisciplinaAluno());
			for(DisciplinaAluno da : lista) {
				tela.adicionarDisciplinaAlunoTabela(da);
			}
			tela.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
			telaPrincipal.exibirAlerta(e.getMessage());
		}	
	}
	
	public void carregarDisciplinasCurso() {
		try {
			TelaTabelaDisciplinasCursos tela = new TelaTabelaDisciplinasCursos();
			DisciplinaCursoBO dcBO = new DisciplinaCursoBO();
			List<DisciplinaCurso> lista = dcBO.retornarDisciplinasCurso(getDisciplinaCurso());
			for(DisciplinaCurso dc : lista) {
				tela.adicionarDisciplinaCursoTabela(dc);
			}
			tela.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
			telaPrincipal.exibirAlerta(e.getMessage());
		}	
	}
	
	public void carregarAproveitamentoDisciplinas() {
		try {
			TelaAproveitamentoDisciplinas tela = new TelaAproveitamentoDisciplinas();
			DisciplinaBO disciplinaBO = new DisciplinaBO();
			List<Disciplina> lista = disciplinaBO.retornarAproveitamento();
			for(Disciplina d : lista) {
				tela.adicionarAproveitamentoDisciplinaTabela(d);
			}
			tela.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
			telaPrincipal.exibirAlerta(e.getMessage());
		}	
	}
	
	public Aluno getMatriculaTela() {
		Aluno aluno = new Aluno();
		aluno.setMatricula(Integer.parseInt(telaPrincipal.getTfAluno().getText()));
		return aluno;
	}
	
	public Curso getCodigoCursoTela() {
		Curso curso = new Curso();
		curso.setCodigo(Integer.parseInt(telaPrincipal.getTfCurso().getText()));
		return curso;
	}
	
	public Disciplina getCodigoDisciplinaTela() {
		Disciplina disciplina = new Disciplina();
		disciplina.setCodigo(Integer.parseInt(telaPrincipal.getTfDisciplina().getText()));
		return disciplina;
	}
	
	public DisciplinaAluno getDisciplinaAluno() {
		DisciplinaAluno da = new DisciplinaAluno();
		da.setMatriculaAluno(Integer.parseInt((telaPrincipal.getTfPesquisa2().getText())));
		return da;
	}
	
	public DisciplinaCurso getDisciplinaCurso() {
		DisciplinaCurso dc = new DisciplinaCurso();
		dc.setCodigoCurso(Integer.parseInt((telaPrincipal.getTfPesquisa3().getText())));
		return dc;
	}

}