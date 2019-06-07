package mvc.model.bo;

import java.util.List;

import mvc.model.dao.AlunoDAO;
import mvc.model.vo.Aluno;

public class AlunoBO {
	
	public void salvarAluno(Aluno aluno) throws Exception {
		AlunoDAO alunoDAO = AlunoDAO.getInstance();
		List<Aluno> alunos = alunoDAO.getAlunos();
		for(Aluno a : alunos) {
			if(aluno.equals(a)) {
				throw new Exception("Aluno já Cadastrado no Sistema!");
			}
		}
		alunoDAO.inserir(aluno);
	}
	
	public void atualizarAluno(Aluno aluno) throws Exception {
		AlunoDAO alunoDAO = AlunoDAO.getInstance();
		alunoDAO.atualizarEndereco(aluno);
	}
	
	public void deletarAluno(Aluno aluno) throws Exception {
		AlunoDAO alunoDAO = AlunoDAO.getInstance();
		List<Aluno> alunos = alunoDAO.getAlunos();
		boolean existe = false;
		for(Aluno a : alunos) {
			if(aluno.getMatricula() == a.getMatricula()) {
				existe = true;
			} 
		}
		if(existe) {
			alunoDAO.deletar(aluno);
		} else {
			throw new Exception("Não existe um Aluno com essa Matrícula no Sistema!");
		}	
	}
	
	public List<Aluno> retornarAlunos() throws Exception {
		AlunoDAO alunoDAO = AlunoDAO.getInstance();
		return alunoDAO.getAlunos();
	}

}