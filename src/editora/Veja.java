package editora;

import observado.Observado;
import observador.Observador;

public class Veja extends Observado {

	private static Veja instancia;

    private Veja(){
    }
    
    public static Veja getInstancia() {
		if (instancia == null)
			instancia = new Veja();
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
