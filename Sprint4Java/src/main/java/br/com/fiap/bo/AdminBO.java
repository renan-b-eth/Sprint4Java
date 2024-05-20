package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Admin;
import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AdminDAO;

public class AdminBO {
	AdminDAO adminDao;
	
	
	// Selecionar
	public ArrayList<Admin> selecionarBo() throws SQLException, ClassNotFoundException{
		adminDao = new AdminDAO();
		return  (ArrayList<Admin>) adminDao.selecionar();
	}
	
	public void inserirBo(Admin admin) throws ClassNotFoundException, SQLException  {
		AdminDAO adminDAO = new AdminDAO();
		adminDAO.inserir(admin);
	}
	
	public void atualizarBo(Admin admin) throws ClassNotFoundException, SQLException  {
		AdminDAO adminDAO = new AdminDAO();
		adminDAO.atualizar(admin);
	}
	
	public void deletarBo(int id) throws ClassNotFoundException, SQLException {
		AdminDAO adminDAO = new AdminDAO();
		adminDAO.deletar(id);
	}	

}
