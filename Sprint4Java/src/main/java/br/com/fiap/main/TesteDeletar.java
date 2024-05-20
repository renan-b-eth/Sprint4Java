package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Admin;
import br.com.fiap.dao.AdminDAO;

public class TesteDeletar {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos 
		Admin objAdmin = new Admin(null);
		
		AdminDAO dao = new AdminDAO();
		
		objAdmin.setId(inteiro("Digite o ID do aluno a ser deletado"));
		
		System.out.println(dao.deletar(objAdmin.getId()));

	}

}
