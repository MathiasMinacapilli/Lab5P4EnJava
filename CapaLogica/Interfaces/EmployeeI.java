package CapaLogica.Interfaces;

//Classes
import CapaLogica.Mozo;
import CapaLogica.Repartidor;
/* 
#include "Repartidor.hpp"
#include "Transporte.hpp"
#include "DtFactura.hpp"
#include "DtMesasMozo.hpp"
#include "DtMozo.hpp"
#include "DtRepartidor.hpp" 
*/

class EmployeeI {
    //constructor protected porque es abstracta
    private IEmpleado();

    abstract public Mozo getMozo(int num_mozo);
    abstract public void ingresarNombreEmpleado(string nombre);
    abstract public Set<Transporte> getTransportes();
    abstract public Set<int> getIdsRepartidor();
    abstract public Map<int, Repartidor*> getRepartidoresDisponibles();
    abstract public void seleccionarTransporte(Transporte t);
    abstract public void seleccionarRepartidor(int numero_repartidor);
    abstract public Repartidor getRepartidorRecordado();
    abstract public void borrarNumero();
    abstract public int ingresarRepartidor();
    abstract public void cancelarRepartidor();
    abstract public void ingresarMozo();
    abstract public void cancelarMozo();
    abstract public Set<int> getIdsMozo();
    abstract public void seleccionarIdyFechas(int id, DtFecha fecha_ini, DtFecha fecha_fin);
    abstract public Map<int, DtFactura> getVentasFacturadas();
    abstract public void ingresarIdRepartidor(int id);
    abstract public Map<int, DtDireccion> getVentasRepartidor();
    abstract public void ingresarNumeroPedido(int nro);
    abstract public void avanzarEtapaPedido();
    abstract public void cancelarPedido();
    abstract public DtRepartidor getDatosIngresadosRepartidor();
    abstract public DtMozo getDatosIngresadosMozo();
    abstract public String getNombreMozo(int num_mozo);
    abstract public String getNombreRepartidor(int num_repartidor);
};