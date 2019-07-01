package CapaPresentacion;

import java.util.*;

import CapaLogica.Factory;
import CapaLogica.UserI;
import DataTypes.DataUser;

public class Principal {
	
	static Factory factory = new Factory();
	static UserI useri = factory.getUserI();
    
	public Principal() {
	}
	
    public static void main(String[] args) {
    	Set<DataUser> users = useri.getUsersData();
    	VentanaPrincipal vp = new VentanaPrincipal(users);
    }
    
    
}