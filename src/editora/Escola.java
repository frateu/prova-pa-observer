package editora;

import observado.Observado;
import observador.Observador;

public class Escola extends Observado {

	private static Escola instancia;

    private Escola(){
    }
    
    public static Escola getInstancia() {
		if (instancia == null)
			instancia = new Escola();
		return instancia;
	}

    public void addAssinante(Observador sujeito){
        adicionarObservador(sujeito);
    }
    
    public void removerAssinante(String sujeito) {
    	removerObservador(sujeito);
    }

    public void novaEdicao(){
        teveMudanca();
    }
}
