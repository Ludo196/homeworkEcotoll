package Interface;

import Components.Autostrada;
import Components.Casello;
import Components.Veicolo;


public interface PedaggioM {
	public Integer setPercorso(Casello c1, Casello c2);
	public Integer setPedaggio(Veicolo v, Autostrada a);
	

}

