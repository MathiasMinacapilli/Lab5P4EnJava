package DataTypes;

public class DataUser {
	
	String name, dateCreated;
	
	//Constructor
	public DataUser(String name, String dateCreated) {
		this.name = name;
		this.dateCreated = dateCreated;
	}
	
	//Getters
	public String getName() {
		return this.name;
	}
	public String getDateCreated() {
		return this.dateCreated;
	}
}
