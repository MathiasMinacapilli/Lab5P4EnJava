package CapaLogica.Interfaces;

import java.util.Set;

//Datatypes
import DataTypes.DtClient;
import DataTypes.DtDireccion;

public interface ClientI {
    abstract void ingresarDatosCliente(string telefono, string nombre, DtDireccion direccion);
    abstract DtCliente getDatosIngresados();
    abstract void ingresarCliente();
    abstract void cancelarCliente();
    abstract boolean existeCliente(string telefono);

    //destructor
    ~ICliente();
}