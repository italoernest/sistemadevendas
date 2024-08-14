package br.com.sistema.jdbc;

import javax.swing.JOptionPane;

public class TestarConexao {

	public static void main(String[] args) {
		try {
			new ConexaoBanco().pegarconexao();
			JOptionPane.showMessageDialog(null, 
					"Conectado com Sucesso ao banco de dados!");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, 
					"Erro ao tentar se conectar ao banco de dados!" + erro);
		}

	}

}
