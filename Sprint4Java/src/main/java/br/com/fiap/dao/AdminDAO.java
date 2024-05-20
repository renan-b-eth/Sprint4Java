package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Admin;
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
				(" Insert into T_CADASTRO_ADMIN values (?, ?, ?, ?, ?, ?, ?, ? ,?)");
			stmt.setInt(1, admin.getId());
			stmt.setString(2, admin.getNome());
			stmt.setString(3, admin.getDataNasc());
			stmt.setString(4, admin.getSexo());
			stmt.setString(5, admin.getEmail());
			stmt.setString(6, admin.getTelefone());
			stmt.setString(7, admin.getSenha());
			stmt.setString(8, "ADMIN");
			stmt.setInt(9, 3); // colocar numero aleatorio
			stmt.execute();
			stmt.close();			
		return "Cadastrado com Sucesso!";
	}
	
	// Delete
	public String deletar(int id) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("Delete from T_CADASTRO_ADMIN where RM = ?");
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();		
		return "Deletado com Sucesso!";
	}
	// UpDate 
	public String atualizar(Admin admin) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				(" Update T_CADASTRO_ADMIN set NOME_CADASTRO_ADMIN = ?, SENHA_CADASTRO_ADMIN = ?,  where ID = ?");
				stmt.setString(1, admin.getNome());
				stmt.setString(2, admin.getSenha());
				stmt.setInt(3, admin.getId());
				stmt.executeUpdate();
				stmt.close();	
		return "Atualizado com Sucesso!";
	}
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
