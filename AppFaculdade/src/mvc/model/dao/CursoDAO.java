package mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mvc.ConnectionFactory;
import mvc.model.vo.Curso;

public class CursoDAO {
	
	private Connection connection;
	private static CursoDAO instance;
	
	private CursoDAO() {
		connection = new ConnectionFactory().getConnection();
	}
	
	public static CursoDAO getInstance() {
		if(instance == null) {
			instance = new CursoDAO();
		}
		return instance;
	}
	
	public void inserir(Curso curso) throws Exception {
		String sql = "INSERT INTO curso(nome, duracao_anos, turno, mensalidade) VALUES (?, ?, ?, ?);";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, curso.getNome());
			stmt.setFloat(2, curso.getDuracaoAnos());
			stmt.setString(3, curso.getTurno());
			stmt.setFloat(4, curso.getMensalidade());
			stmt.execute();
			stmt.close();
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}
	
	public List<Curso> getCursos() throws Exception {
		try {
			List<Curso> lista = new ArrayList<>();
			String sql = "SELECT codigo, nome, duracao_anos, turno, mensalidade FROM curso;";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Curso curso = new Curso();
				curso.setCodigo(rs.getInt("codigo"));
				curso.setNome(rs.getString("nome"));
				curso.setDuracaoAnos(rs.getFloat("duracao_anos"));
				curso.setTurno(rs.getString("turno"));
				curso.setMensalidade(rs.getFloat("mensalidade"));
				lista.add(curso);
			}
			rs.close();
			stmt.close();
			return lista;
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}
	
	public void atualizarMensalidade(Curso curso) throws Exception {
		String sql = "UPDATE curso SET mensalidade = ? WHERE codigo = ?;";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setFloat(1, curso.getMensalidade());
			stmt.setInt(2, curso.getCodigo());
			stmt.execute();
			stmt.close();
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}
	
	public void deletar(Curso curso) throws Exception {
    	String sql = "DELETE FROM curso WHERE codigo = ?;";
    	try {
    		PreparedStatement stmt = connection.prepareStatement(sql);
    		stmt.setInt(1, curso.getCodigo());
    		stmt.execute();
    		stmt.close();
    	} catch(SQLException e) {
    		throw new Exception(e);
    	}
    }
	
	public List<Curso> getQuantidadeAlunosCursos() throws Exception {
		try {
			List<Curso> lista = new ArrayList<>();
			String sql = "SELECT c.codigo, c.nome, count(*) "
					+ "FROM curso c "
					+ "LEFT JOIN aluno a "
					+ "ON c.codigo = a.codigo_curso "
					+ "GROUP BY a.codigo_curso "
					+ "ORDER BY c.codigo ASC;";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Curso curso = new Curso();
				curso.setCodigo(rs.getInt(1));
				curso.setNome(rs.getString(2));
				curso.setQtdAlunos(rs.getInt(3));
				lista.add(curso);
			}
			rs.close();
			stmt.close();
			return lista;
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}

}