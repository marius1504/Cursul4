package car;

public class Vehicle {
	private final String producedBy;
	private static int productionYear;
	private static int vin;
	private String plateNumber;
	private int kilometers;
	private int lastSoldYear;
	private int positionX;
	private int positionY;
	
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public int getKilometers() {
		return kilometers;
	}
	
	public Vehicle(String producedBy, int vin) {
		this.producedBy = producedBy;
		this.vin = vin;
	}
	
	public Vehicle(String producedBy, int vin, int productionYear) {
		this(producedBy, vin);
		this.productionYear = productionYear;
	}
	
	public Vehicle(String producedBy, int vin, int productionYear, String plateNumber) {
		this(producedBy, vin, productionYear);
		this.plateNumber = plateNumber;
	}
}



