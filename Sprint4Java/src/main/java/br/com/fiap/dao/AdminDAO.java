package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Admin;
import br.com.fiap.beans.Aluno;
import br.com.fiap.conexoes.ConexaoFactory;

public class AdminDAO {
	
	public Connection minhaConexao;
	
	public AdminDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// Insert 
	public String inserir (Admin admin) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				(" Insert into T_CADASTRO_ADMIN values (?, ?, ?, ?, ?, ?, ?)");
			stmt.setInt(1, admin.getId());
			stmt.setString(2, admin.getNome());
			stmt.setString(3, admin.getDataNasc());
			stmt.setString(4, admin.getSexo());
			stmt.setString(5, admin.getEmail());
			stmt.setString(6, admin.getTelefone());
			stmt.setString(7, admin.getSenha());
			stmt.execute();
			stmt.close();			
		return "Cadastrado com Sucesso!";
	}
	
	// Delete
	/*public String deletar(int rm) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("Delete from T_FIAP_ALUNO where RM = ?");
			stmt.setInt(1, rm);
			stmt.execute();
			stmt.close();		
		return "Deletado com Sucesso!";
	}*/
	// UpDate 
	/*public String atualizar(Aluno aluno) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				(" Update T_FIAP_ALUNO set NOME = ?, TURMA = ?, "
						+ "  NOTA = ? where RM = ?");
				stmt.setString(1, aluno.getNome());
				stmt.setString(2, aluno.getTurma());
				stmt.setDouble(3, aluno.getNota());
				stmt.setInt(4, aluno.getRm());
				stmt.executeUpdate();
				stmt.close();	
		return "Atualizado com Sucesso!";
	}*/
	// Select 
	public List<Admin> selecionar() throws SQLException{
		List<Admin> listaAdmin = new ArrayList<Admin>();
		PreparedStatement stmt = minhaConexao.prepareStatement
				("SELECT * FROM T_CADASTRO_ADMIN");
		
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Admin admin = new Admin(null);
				admin.setId(rs.getInt(1));
				admin.setNome(rs.getString(2));
				admin.setDataNasc(rs.getString(3));
				admin.setSexo(rs.getString(4));
				admin.setEmail(rs.getString(5));
				admin.setTelefone(rs.getString(6));
				admin.setSenha(rs.getString(7));
				
				listaAdmin.add(admin);
			}		
		return listaAdmin;		
	}
	

}
