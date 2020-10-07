package view;

import javax.swing.JOptionPane;

import assinante.Assinante;
import editora.Abril;
import editora.Escola;
import editora.Veja;

public class Aplicacao {
	public void registrarAssinante() {
		Escola escola = Escola.getInstancia();
		Abril abril = Abril.getInstancia();
		Veja veja = Veja.getInstancia();

		int verf = 0;

		while (verf == 0) {
			Assinante assinante = new Assinante();

			String nome = JOptionPane.showInputDialog("Digite o seu nome:");

			int editoraVerf = Integer.parseInt(JOptionPane.showInputDialog("Insira qual revista deseja assinar:\n" 
					+ "1 - Escola\n2 - Abril\n3 - Veja"));

			if (editoraVerf == 1) {
				assinante.adicionarDados(nome, "Escola");
				escola.addAssinante(assinante);
			} else if (editoraVerf == 2) {
				assinante.adicionarDados(nome, "Abril");
				abril.addAssinante(assinante);
			} else if (editoraVerf == 3) {
				assinante.adicionarDados(nome, "Veja");
				veja.addAssinante(assinante);
			}
			
			verf = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar cadastrando?"
					+ "\n   0 - Sim\n   1 - Não"));
		}
	}

	public void removerAssinante() {
		Escola escola = Escola.getInstancia();
		Abril abril = Abril.getInstancia();
		Veja veja = Veja.getInstancia();

		int editoraVerf = Integer.parseInt(JOptionPane.showInputDialog("Insira de qual revista deseja remover:\n" 
				+ "1 - Escola\n2 - Abril\n3 - Veja"));

		String nome = JOptionPane.showInputDialog("Digite o nome do assinante:");

		if (editoraVerf == 1) {
			escola.removerAssinante(nome);
		} else if (editoraVerf == 2) {
			abril.removerAssinante(nome);
		} else if (editoraVerf == 3) {
			veja.removerAssinante(nome);
		}
	}

	public void atualizarEdicao() {
		Escola escola = Escola.getInstancia();
		Abril abril = Abril.getInstancia();
		Veja veja = Veja.getInstancia();

		System.out.println("Atualização para a editora Escola");
		escola.novaEdicao();
		System.out.println("");
		System.out.println("Atualização para a editora Abril");
		abril.novaEdicao();
		System.out.println("");
		System.out.println("Atualização para a editora Veja");
		veja.novaEdicao();
	}
}
