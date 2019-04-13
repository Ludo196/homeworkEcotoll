package Components;

public class Pedaggio {
		private int IDPedaggio; 
		private String tariffa_unitaria;
		private String arrotondamento;
		private String classe_veicolo;
		
public Pedaggio(int IDPedaggio, String tariffa_unitaria,String arrotondamento,String classe_veicolo) {
		this.IDPedaggio=IDPedaggio;
		this.tariffa_unitaria=tariffa_unitaria;
		this.arrotondamento=arrotondamento;
		this.classe_veicolo=classe_veicolo;
	}
		
}
