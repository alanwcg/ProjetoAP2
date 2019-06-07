package mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mvc.ConnectionFactory;
import mvc.model.vo.DisciplinaAluno;

public class DisciplinaAlunoDAO {
	
	private Connection connection;
	private static DisciplinaAlunoDAO instance;
	
	private DisciplinaAlunoDAO() {
		connection = new ConnectionFactory().getConnection();
	}
	
	public static DisciplinaAlunoDAO getInstance() {
		if(instance == null) {
			instance = new DisciplinaAlunoDAO();
		}
		return instance;
	}
	
	public void inserir(DisciplinaAluno da) throws Exception {
		String sql = "INSERT INTO disciplina_aluno(codigo_disciplina, matricula_aluno, frequencia, nota)"
				+ " VALUES (?, ?, ?, ?);";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, da.getCodigoDisciplina());
			stmt.setInt(2, da.getMatriculaAluno());
			stmt.setInt(3, da.getFrequencia());
			stmt.setFloat(4, da.getNota());
			stmt.execute();
			stmt.close();
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}
	
	public List<DisciplinaAluno> getDisciplinasAluno(DisciplinaAluno da) throws Exception {
		try {
			List<DisciplinaAluno> lista = new ArrayList<>();
			String sql = "SELECT a.nome, d.nome, d.modalidade, da.nota, da.situacao "
					+ "FROM aluno a "
					+ "INNER JOIN disciplina_aluno da "
					+ "ON a.matricula = da.matricula_aluno "
					+ "INNER JOIN disciplina d "
					+ "ON d.codigo = da.codigo_disciplina "
					+ "WHERE a.matricula = ? "
					+ "ORDER BY a.nome ASC;";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, da.getMatriculaAluno());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				da = new DisciplinaAluno();
				da.setNomeAluno(rs.getString("a.nome"));
				da.setNomeDisciplina(rs.getString("d.nome"));
				da.setModalidade(rs.getString("d.modalidade"));
				da.setNota(rs.getFloat("da.nota"));
				da.setSituacao(rs.getString("da.situacao"));
				lista.add(da);
			}
			rs.close();
			stmt.close();
			return lista;
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}

}