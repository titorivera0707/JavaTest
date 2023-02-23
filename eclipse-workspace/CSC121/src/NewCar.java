
public class NewCar {
	
		private static int vinCounter =1000;
		
		private String make;
		private String color;
		private String model;
		private String VIN;
		
		public NewCar(String make, String color, String model) {
			
			this.make = make;
			this.color = color;
			this.model = model;
			this.VIN = "VIN" + (vinCounter++);
			
		}
		
		
		
		public int getVinCounter() {
			return vinCounter;
		}



		public void setVinCounter(int vinCounter) {
			this.vinCounter = vinCounter;
		}



		public String getMake() {
			return make;
		}



		public void setMake(String make) {
			this.make = make;
		}



		public String getColor() {
			return color;
		}



		public void setColor(String color) {
			this.color = color;
		}



		public String getModel() {
			return model;
		}



		public void setModel(String model) {
			this.model = model;
		}



		public String getVIN() {
			return VIN;
		}



		public void setVIN(String vIN) {
			VIN = vIN;
		}



		public boolean equals(Object o) {
			
			NewCar other = (NewCar)o;
			
			return other.make == this.make&&
					other.color == this.color&&
					other.model == this.model&&
					other.VIN == this.VIN;
			
		}
		
		public String toString() {
			
			return make+" : "+color+" : "+model+" : "+VIN;
			
		}
	
}
