package Components;

public class Veicolo {
			public String targa;
			public String marca;
			public String modello;
			public String assi;
			public String peso;
			public String altezza;
			
	public Veicolo (String targa,String marca,String modello,String assi, String peso, String altezza ) {
		
				this.targa=targa;
				this.modello=modello;
				this.marca=marca;
				this.assi=assi;
				this.peso=peso;
				this.altezza=altezza;
	}
		public String getarga() {
				return this.targa;
}
		public void setTarga(String targa) {
				this.targa=targa;
}
		public String getmarca() {
				return marca;
}
		public void setMarca(String marca) {
				this.marca=marca;
}
		public String getassi() {
				return assi;
}
		public void setAssi(String assi) {
				this.assi=assi;
}
		public String getpeso() {
				return peso;
}
		public void setPeso(String peso) {
				this.peso=peso;
}
		public String getaltezza() {
				return altezza;
}
		public void setAltezza(String altezza) {
				this.altezza=altezza;
}
		
}
