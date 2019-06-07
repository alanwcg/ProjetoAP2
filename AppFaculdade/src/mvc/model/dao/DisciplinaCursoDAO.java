package mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mvc.ConnectionFactory;
import mvc.model.vo.DisciplinaCurso;

public class DisciplinaCursoDAO {
	
	private Connection connection;
	private static DisciplinaCursoDAO instance;
	
	private DisciplinaCursoDAO() {
		connection = new ConnectionFactory().getConnection();
	}
	
	public static DisciplinaCursoDAO getInstance() {
		if(instance == null) {
			instance = new DisciplinaCursoDAO();
		}
		return instance;
	}
	
	public void inserir(DisciplinaCurso dc) throws Exception {
		String sql = "INSERT INTO disciplina_curso(codigo_disciplina, codigo_curso) VALUES (?, ?);";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, dc.getCodigoDisciplina());
			stmt.setInt(2, dc.getCodigoCurso());
			stmt.execute();
			stmt.close();
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}
	
	public List<DisciplinaCurso> getDisciplinasCurso(DisciplinaCurso dc) throws Exception {
		try {
			List<DisciplinaCurso> lista = new ArrayList<>();
			String sql = "SELECT c.nome, d.nome, d.modalidade "
					+ "FROM curso c "
					+ "INNER JOIN disciplina_curso dc "
					+ "ON c.codigo = dc.codigo_curso "
					+ "INNER JOIN disciplina d "
					+ "ON d.codigo = dc.codigo_disciplina "
					+ "WHERE c.codigo = ? "
					+ "ORDER BY c.nome ASC;";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, dc.getCodigoCurso());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				dc = new DisciplinaCurso();
				dc.setNomeCurso(rs.getString("c.nome"));
				dc.setNomeDisciplina(rs.getString("d.nome"));
				dc.setModalidadeDisciplina(rs.getString("d.modalidade"));
				lista.add(dc);
			}
			rs.close();
			stmt.close();
			return lista;
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}

}