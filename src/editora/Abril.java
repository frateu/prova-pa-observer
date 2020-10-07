package editora;

import observado.Observado;
import observador.Observador;

public class Abril extends Observado{
	
	private static Abril instancia;

    private Abril(){
    }
    
    public static Abril getInstancia() {
		if (instancia == null)
			instancia = new Abril();
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
