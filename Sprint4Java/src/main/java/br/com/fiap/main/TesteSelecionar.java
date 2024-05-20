package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Admin;
import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AdminDAO;

public class TesteSelecionar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Instanciar objetos 
		//AlunoDAO dao = new AlunoDAO();
		AdminDAO dao = new AdminDAO();
		
		List<Admin> listaAdmin = (ArrayList<Admin>) dao.selecionar();
		
		if(listaAdmin != null) {
			// foreach 
			for( Admin admin : listaAdmin) {
				System.out.println(admin.getId() + " " + 
									admin.getNome() + " " + 
						        	admin.getDataNasc() + " " + 
									admin.getSexo() + " " +
									admin.getTelefone() + " " +
									admin.getEmail() + " " +
									admin.getSenha() + " ");
			}
		}

	}

}
