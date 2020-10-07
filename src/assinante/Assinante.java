package assinante;

import observador.Observador;

public class Assinante implements Observador {

    String nome;
    String assinatura;

    public void adicionarDados(String nome, String observado) {
        this.nome = nome;
        this.assinatura = observado;
    }
    
    @Override
    public String retornarNome() {
		return this.nome;
	}

    @Override
    public void atualizar() {
        System.out.println(this.nome + ", a sua assinatura na " + this.assinatura + " teve uma nova edição!");
    }
}
