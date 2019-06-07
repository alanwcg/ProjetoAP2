package mvc.model.bo;

import java.util.List;

import mvc.model.dao.DisciplinaDAO;
import mvc.model.vo.Disciplina;

public class DisciplinaBO {
	
	public void salvarDisciplina(Disciplina disciplina) throws Exception {
		disciplina.validarDisciplina();
		DisciplinaDAO disciplinaDAO = DisciplinaDAO.getInstance();
		List<Disciplina> disciplinas = disciplinaDAO.getDisciplinas();
		for(Disciplina d : disciplinas) {
			if(disciplina.equals(d)) {
				throw new Exception("Disciplina já Cadastrada no Sistema!");
			}
		}
		disciplinaDAO.inserir(disciplina);	
	}
	
	public void atualizarDisciplina(Disciplina disciplina)  throws Exception {
		DisciplinaDAO disciplinaDAO = DisciplinaDAO.getInstance();
		List<Disciplina> disciplinas = disciplinaDAO.getDisciplinas();
		for(Disciplina d : disciplinas) {
			if(disciplina.equals(d)) {
				throw new Exception("Disciplina já Cadastrada com essa Modalidade!");
			}
		}
		disciplinaDAO.atualizarModalidade(disciplina);
	}
	
	public void deletarDisciplina(Disciplina disciplina) throws Exception {
		DisciplinaDAO disciplinaDAO = DisciplinaDAO.getInstance();
		List<Disciplina> disciplinas = disciplinaDAO.getDisciplinas();
		boolean existe = false;
		for(Disciplina d : disciplinas) {
			if(disciplina.getCodigo() == d.getCodigo()) {
				existe = true;
			} 
		}
		if(existe) {
			disciplinaDAO.deletar(disciplina);
		} else {
			throw new Exception("Não existe uma Disciplina com esse Código no Sistema!");
		}
	}
	
	public List<Disciplina> retornarDisciplinas() throws Exception {
		DisciplinaDAO disciplinaDAO = DisciplinaDAO.getInstance();
		return disciplinaDAO.getDisciplinas();
	}
	
	public List<Disciplina> retornarAproveitamento() throws Exception {
		DisciplinaDAO disciplinaDAO = DisciplinaDAO.getInstance();
		return disciplinaDAO.getAproveitamento();
	}

}