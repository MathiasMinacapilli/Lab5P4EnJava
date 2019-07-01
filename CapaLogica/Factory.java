package CapaLogica;

public class Factory {
	
	public UserI getUserI() {
		return new UserController();
	}
	
}
