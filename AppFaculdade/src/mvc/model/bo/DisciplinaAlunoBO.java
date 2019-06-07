package mvc.model.bo;

import java.util.List;

import mvc.model.dao.DisciplinaAlunoDAO;
import mvc.model.vo.DisciplinaAluno;

public class DisciplinaAlunoBO {
	
	public void salvarDisciplinaAluno(DisciplinaAluno da) throws Exception {
		DisciplinaAlunoDAO daDAO = DisciplinaAlunoDAO.getInstance();
		daDAO.inserir(da);	
	}
	
	public List<DisciplinaAluno> retornarDisciplinasAluno(DisciplinaAluno da) throws Exception {
		DisciplinaAlunoDAO daDAO = DisciplinaAlunoDAO.getInstance();
		List<DisciplinaAluno> disciplinas = daDAO.getDisciplinasAluno(da);
		if(disciplinas.isEmpty()) {
			throw new Exception("Não existe um Aluno com essa Matrícula no Sistema!");
		}
		return daDAO.getDisciplinasAluno(da);
	}

}