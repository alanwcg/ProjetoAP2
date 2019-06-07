package mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mvc.ConnectionFactory;
import mvc.model.vo.Aluno;

public class AlunoDAO {
	
	private Connection connection;
	private static AlunoDAO instance;
	
	private AlunoDAO() {
		connection = new ConnectionFactory().getConnection();
	}
	
	public static AlunoDAO getInstance() {
		if(instance == null) {
			instance = new AlunoDAO();
		}
		return instance;
	}
	
	public void inserir(Aluno aluno) throws Exception {
		String sql = "INSERT INTO aluno(nome, cpf, data_nascimento, rua, numero, cep, bairro, cidade, uf,"
				+ " data_matricula_curso, codigo_curso) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getCpf());
			stmt.setString(3, aluno.getDataNascimento());
			stmt.setString(4, aluno.getRua());
			stmt.setInt(5, aluno.getNumero());
			stmt.setString(6, aluno.getCep());
			stmt.setString(7, aluno.getBairro());
			stmt.setString(8, aluno.getCidade());
			stmt.setString(9, aluno.getUf());
			stmt.setString(10, aluno.getDataMatriculaCurso());
			stmt.setInt(11, aluno.getCodigoCurso());
			stmt.execute();
			stmt.close();
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}
	
    public void atualizarEndereco(Aluno aluno) throws Exception {
		String sql = "UPDATE aluno SET rua = ?, numero = ?, cep = ?, bairro = ?, cidade = ?, uf = ? WHERE matricula = ?;";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, aluno.getRua());
			stmt.setInt(2, aluno.getNumero());
			stmt.setString(3, aluno.getCep());
			stmt.setString(4, aluno.getBairro());
			stmt.setString(5, aluno.getCidade());
			stmt.setString(6, aluno.getUf());
			stmt.setInt(7, aluno.getMatricula());
			stmt.execute();
			stmt.close();
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}
    
    public void deletar(Aluno aluno) throws Exception {
    	String sql = "DELETE FROM aluno WHERE matricula = ?;";
    	try {
    		PreparedStatement stmt = connection.prepareStatement(sql);
    		stmt.setInt(1, aluno.getMatricula());
    		stmt.execute();
    		stmt.close();
    	} catch(SQLException e) {
    		throw new Exception(e);
    	}
    }
	
	public List<Aluno> getAlunos() throws Exception {
		try {
			List<Aluno> lista = new ArrayList<>();
			String sql = "SELECT matricula, nome, cpf, data_nascimento, rua, numero, cep, bairro, cidade, uf,"
					+ " data_matricula_curso FROM aluno;";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setMatricula(rs.getInt("matricula"));
				aluno.setNome(rs.getString("nome"));
				aluno.setCpf(rs.getString("cpf"));
				aluno.setDataNascimento(rs.getString("data_nascimento"));
				aluno.setRua(rs.getString("rua"));
				aluno.setNumero(rs.getInt("numero"));
				aluno.setCep(rs.getString("cep"));
				aluno.setBairro(rs.getString("bairro"));
				aluno.setCidade(rs.getString("cidade"));
				aluno.setUf(rs.getString("uf"));
				aluno.setDataMatriculaCurso(rs.getString("data_matricula_curso"));
				lista.add(aluno);
			}
			rs.close();
			stmt.close();
			return lista;
		} catch(SQLException e) {
			throw new Exception(e);
		}
	}
	
}