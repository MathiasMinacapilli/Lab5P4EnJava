package CapaLogica.Controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

//Interface
import CapaLogica.Interfaces.UserI;

//Classes
import CapaLogica.User;

//Datatypes
import DataTypes.DataUser;

public class UserController implements UserI {

	private static UserController instance = null;

	private Set<User> users = new HashSet<User>();
	private int cantidadUsuarios = 0;
	
	private UserController() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		this.users.add(new User("Mathias", LocalDateTime.now()));
		this.users.add(new User("Roberto", LocalDateTime.now()));
		this.users.add(new User("El wachin", LocalDateTime.now()));
		this.cantidadUsuarios++;
	}
	
	public static UserController getInstance() {
		if(UserController.instance == null) {
			UserController.instance = new UserController();
		}
		return UserController.instance;
	}

	//Getters
	@Override
	public int getCantidadUsuarios() {
		return this.cantidadUsuarios;
	}
	
	//Metodos
	@Override
	public void addUser(String name) {
		this.users.add(new User(name, LocalDateTime.now()));
		this.cantidadUsuarios++;
	}
	
	@Override
	public Set<DataUser> getUsersData() {
		Set<DataUser> ret = new HashSet<DataUser>();
		for(User user: this.users) {
			DataUser dt_user = new DataUser(user.getName(), user.getDateCreated());
			ret.add(dt_user);
		}
		return ret;
	}
}
