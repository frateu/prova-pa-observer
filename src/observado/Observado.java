package observado;

import observador.Observador;

import java.util.ArrayList;

public class Observado {
    public ArrayList<Observador> listaObservadores = new ArrayList<Observador>();

    public void adicionarObservador(Observador observador){
        this.listaObservadores.add(observador);
    }
    
    public void removerObservador(String nomeObservador) {
    	
    	for(int i = 0; i < this.listaObservadores.size(); i++) {
    		if(this.listaObservadores.get(i).retornarNome().equals(nomeObservador)) {
    			this.listaObservadores.remove(i);
    		}
    	}
    }

    public void notificarObservadores(){
        for(Observador observador : listaObservadores){
            observador.atualizar();
        }
    }

    public void teveMudanca(){
        notificarObservadores();
    }
}
