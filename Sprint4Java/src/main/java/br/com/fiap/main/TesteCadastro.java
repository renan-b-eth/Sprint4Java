package br.com.fiap.main;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

import br.com.fiap.beans.Admin;
import br.com.fiap.bo.AdminBO;
import java.util.Date;
public class TesteCadastro {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos
		Admin objAdmin = new Admin(null);
		
		AdminBO dao = new AdminBO();
		
		objAdmin.setId(inteiro("ID"));
		objAdmin.setNome(texto("Nome"));
		objAdmin.setDataNasc(texto("Data"));
		objAdmin.setSexo(texto("Sexo"));
		objAdmin.setEmail(texto("Email"));
		objAdmin.setTelefone(texto("Telefone"));
		objAdmin.setSenha(texto("Senha"));
		
		dao.inserirBo(objAdmin);

	}

}
