
package CapaLogica.Interfaces;

//Archivos
/* #include "DtActualizacion.hpp" */

class IObserverActualizaciones {
    protected IObserverActualizaciones();

	abstract public void notificar(DtActualizacion actualizacion);
};