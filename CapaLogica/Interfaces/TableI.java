
package CapaLogica.Interfaces;

//Classes
/* #include "DtMesasMozo.hpp"
#include "Venta.hpp" */

class TableI {
    protected TableI();
    
    abstract public Map<int, DtMesasMozo> asignarMozosAMesas();
    abstract public void cancelarVenta();
    abstract public void finalizarVenta();
    abstract public Set<int> getMesasMozoSinVentas(int num_mozo);
    abstract public Set<int> getMesasSeleccionadas();
    abstract public void iniciarVenta();
    abstract public Venta *obtenerVenta(int numero);
    abstract public void seleccionarMesasVenta(Set<int> numeros);
    abstract public Set<int> getNumeroMesas();
}