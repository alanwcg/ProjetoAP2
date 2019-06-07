package mvc.model.bo;

import java.util.List;

import mvc.model.dao.CursoDAO;
import mvc.model.vo.Curso;

public class CursoBO {
	
	public void salvarCurso(Curso curso) throws Exception {
		curso.validarCurso();
		CursoDAO cursoDAO = CursoDAO.getInstance();
		List<Curso> cursos = cursoDAO.getCursos();
		for(Curso c : cursos) {
			if(curso.equals(c)) {
				throw new Exception("Curso j� Cadastrado no Sistema!");
			}
		}
		cursoDAO.inserir(curso);	
	}
	
	public void atualizarCurso(Curso curso) throws Exception {
		CursoDAO cursoDAO = CursoDAO.getInstance();
		cursoDAO.atualizarMensalidade(curso);
	}
	
	public void deletarCurso(Curso curso) throws Exception {
		CursoDAO cursoDAO = CursoDAO.getInstance();
		List<Curso> cursos = cursoDAO.getCursos();
		boolean existe = false;
		for(Curso c : cursos) {
			if(curso.getCodigo() == c.getCodigo()) {
				existe = true;
			}
		}
		if(existe) {
			cursoDAO.deletar(curso);
		} else {
			throw new Exception("N�o existe um Curso com esse C�digo no Sistema!");
		}
	}
	
	public List<Curso> retornarCursos() throws Exception {
		CursoDAO cursoDAO = CursoDAO.getInstance();
		return cursoDAO.getCursos();
	}
	
	public List<Curso> retornarQuantidadeAlunosCursos() throws Exception {
		CursoDAO cursoDAO = CursoDAO.getInstance();
		return cursoDAO.getQuantidadeAlunosCursos();
	}

}