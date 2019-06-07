package mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mvc.ConnectionFactory;
import mvc.model.vo.Disciplina;

public class DisciplinaDAO {
	
	private Connection connection;
	private static DisciplinaDAO instance;
	
	private DisciplinaDAO() {
		connection = new ConnectionFactory().getConnection();
	}
	
	public static DisciplinaDAO getInstance() {
		if(instance == null) {
			instance = new DisciplinaDAO();
		}
		return instance;
	}
	
	public void inserir(Disciplina disciplina) throws Exception {
		String sql = "INSERT INTO disciplina(nome, carga_horaria, modalidade) VALUES (?, ?, ?);";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, disciplina.getNome());
			stmt.setInt(2, disciplina.getCargaHoraria());
			stmt.setString(3, disciplina.getModalidade());
			stmt.execute();
			stmt.close();
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}
	
	public List<Disciplina> getDisciplinas() throws Exception {
		try {
			List<Disciplina> lista = new ArrayList<>();
			String sql = "SELECT codigo, nome, carga_horaria, modalidade FROM disciplina;";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Disciplina disciplina = new Disciplina();
				disciplina.setCodigo(rs.getInt("codigo"));
				disciplina.setNome(rs.getString("nome"));
				disciplina.setCargaHoraria(rs.getInt("carga_horaria"));
				disciplina.setModalidade(rs.getString("modalidade"));
				lista.add(disciplina);
			}
			rs.close();
			stmt.close();
			return lista;
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}
	
	public void atualizarModalidade(Disciplina disciplina) throws Exception {
		String sql = "UPDATE disciplina SET modalidade = ? WHERE codigo = ?;";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, disciplina.getModalidade());
			stmt.setInt(2, disciplina.getCodigo());
			stmt.execute();
			stmt.close();
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}
	
	public void deletar(Disciplina disciplina) throws Exception {
    	String sql = "DELETE FROM disciplina WHERE codigo = ?;";
    	try {
    		PreparedStatement stmt = connection.prepareStatement(sql);
    		stmt.setInt(1, disciplina.getCodigo());
    		stmt.execute();
    		stmt.close();
    	} catch(SQLException e) {
    		throw new Exception(e);
    	}
    }
	
	public List<Disciplina> getAproveitamento() throws Exception {
		try {
			List<Disciplina> lista = new ArrayList<>();
			String sql = "SELECT * from vw_aproveitamento;";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Disciplina d = new Disciplina();
				d.setCodigo(rs.getInt(1));
				d.setNome(rs.getString(2));
				d.setMedia(rs.getFloat(3));
				d.setAvaliacao(rs.getString(4));
				lista.add(d);
			}
			rs.close();
			stmt.close();
			return lista;
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}

}