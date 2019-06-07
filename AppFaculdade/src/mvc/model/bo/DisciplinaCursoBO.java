package mvc.model.bo;

import java.util.List;

import mvc.model.dao.DisciplinaCursoDAO;
import mvc.model.vo.DisciplinaCurso;

public class DisciplinaCursoBO {
	
	public void salvarDisciplinaCurso(DisciplinaCurso dc) throws Exception {
		DisciplinaCursoDAO dcDAO = DisciplinaCursoDAO.getInstance();
		dcDAO.inserir(dc);	
	}
	
	public List<DisciplinaCurso> retornarDisciplinasCurso(DisciplinaCurso dc) throws Exception {
		DisciplinaCursoDAO dcDAO = DisciplinaCursoDAO.getInstance();
		List<DisciplinaCurso> disciplinas = dcDAO.getDisciplinasCurso(dc);
		if(disciplinas.isEmpty()) {
			throw new Exception("N�o existe um Curso com esse C�digo no Sistema!");
		}
		return dcDAO.getDisciplinasCurso(dc);
	}

}
