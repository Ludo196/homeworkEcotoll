package Components;

public class Casello {
		public Integer IDCasello;
		public String km_casello;
		public String coordinate;

public Casello(int IDCasello,String km_casello,String coordinate) {
		this.IDCasello=IDCasello;
		this.km_casello=km_casello;
		this.coordinate=coordinate;
}

		public Integer getIDCasello() {
			return IDCasello;
}
		public void setIDCasello(Integer IDCasello) {
//			this.IDCasello=IDCasello;
}
		public String getkm_casello() {
			return km_casello;
}
		public void setkm_casello(String km_casello) {
			this.km_casello=km_casello;
}
		public String getcoordinate() {
			return coordinate;
}
		public void setcoordinate(String coordinate) {
			this.coordinate=coordinate;
}

	}
