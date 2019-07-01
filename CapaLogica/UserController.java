package CapaLogica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import DataTypes.DataUser;

public class UserController implements UserI {
	Set<User> users = new HashSet<User>();
	int cantidadUsuarios = 0;
	
	public UserController() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		this.users.add(new User("Mathias", LocalDateTime.now()));
		this.users.add(new User("Roberto", LocalDateTime.now()));
		this.users.add(new User("El wachin", LocalDateTime.now()));
		this.cantidadUsuarios++;
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
