package CapaLogica;

import java.util.Set;

import DataTypes.DataUser;

public interface UserI {
	public int getCantidadUsuarios();
	public void addUser(String name);
	public Set<DataUser> getUsersData();
}
