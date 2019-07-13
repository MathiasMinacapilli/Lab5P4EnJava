
package CapaLogica.Interfaces;

//Classes
/* #include "VentaLocal.hpp"
#include "Repartidor.hpp"
#include "DtFactura.hpp"
#include "DtActualizacion.hpp"
#include "Producto.hpp"
#include "DtProducto.hpp"
#include "DtProductoCantidad.hpp" */

class SaleI {
    protected SaleI();

    abstract public void agregarProductoAVenta();
    abstract public void cancelarEliminarProductoDeVenta();
    abstract public void cancelarProductoAVenta();
    abstract public VentaLocal crearVenta();
    abstract public void eliminarProductoDeVenta();
    abstract public boolean estaEnVentaSinFacturar(Producto p);
    abstract public DtFactura generarFactura();
    abstract public DtFactura generarFacturaADomicilio();
    abstract public Map<int, DtFactura> getFacturasYTotalFecha(float totalfacturado);
    abstract public Vector<DtActualizacion> getListadoActualizaciones();
    abstract public Vector<DtActualizacion> getActualizacionesCliente(string telefono);
    abstract public Map<int, DtProducto> getProductosVenta(int numMesa);
    abstract public void ingresarFecha(DtFecha fecha);
    abstract public void ingresarNumeroMesa(int numero);
    abstract public void ingresarPorcentajeDescuento(float descuento);
    abstract public boolean ingresarTelefono(string telefono);
    abstract public void almacenarProducto(DtProductoCantidad prod_y_cant);
    abstract public void elegirRepartidor(int numero_repartidor);
    abstract public void crearVentaADomicilio(boolean quiere_repartidor, float descuento);
    abstract public void cancelarVentaADomicilio();
    abstract public Map<int, DtProducto> obtenerProductosDisponibles();
    abstract public Map<int, Repartidor> obtenerRepartidores();
    abstract public void seleccionarProdYCant(DtProductoCantidad producto_cantidad);
};