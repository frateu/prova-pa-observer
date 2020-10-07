package view;

import javax.swing.*;

public class Client {
	public static void main(String[] args) {
		int escolha;
		
		Aplicacao app = new Aplicacao();

		JOptionPane.showMessageDialog(null, "Cadastro de Assinante");

		do {
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual ação deseja realizar?" 
					+ "\n   1 - Cadastrar Assinante\n   2 - Remover Assinante\n   3 - Atualizar Edições\n   4 - Sair"));

			switch (escolha) {
			case 1:
				app.registrarAssinante();
				break;
			
			case 2:
				app.removerAssinante();
				break;
			
			case 3: 
				app.atualizarEdicao();
				break;
			}
		}while (escolha != 4);
	}
}
