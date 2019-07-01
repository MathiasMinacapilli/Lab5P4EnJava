package CapaLogica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
	String name;
	LocalDateTime fechaCreacion;
	
	public User(String name, LocalDateTime fechaCreacion) {
		this.name = name;
		this.fechaCreacion = fechaCreacion;
	}
	
	public String getName() {
		return this.name;
	}
	public String getDateCreated() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		return dtf.format(this.fechaCreacion);
	}
}
