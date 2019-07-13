
package CapaLogica.Interfaces;

//Classes
/* #include "DtProducto.hpp"
#include "DtProductoCantidad.hpp"
#include "DtProductoSimple.hpp"
#include "Producto.hpp"
#include "CantidadProducto.hpp" */

class ProductI {
    protected ProductI();
    
    abstract public void cancelarBajaProducto();
    abstract public void cancelarMenu();
    abstract public void cancelarProductoSimple();
    abstract public boolean eliminarProducto();
    abstract public void eliminarProductoDeMenu(int cod);
    abstract public Producto encontrarProducto(DtProductoCantidad producto_cantidad);
    abstract public boolean existeProductoSimple();
    abstract public Map<int, DtProducto> getProductosDisponibles();
    abstract public Map<int, DtProducto> getProductosSimples();
    abstract public void ingresarDatosProducto(DtProductoSimple datos);
    abstract public void ingresarProductoSimple();
    abstract public void ingresarDatosMenu(int codigo, std::string desc);
    abstract public void ingresarMenu();
    abstract public void seleccionarProducto(int codigo_producto);
    abstract public void seleccionarProductoYCantidad(DtProductoCantidad producto_cantidad);
    abstract public boolean ingresarCodigoProductoAConsultar(int codigo);
    abstract public void cancelarInformacion();
    abstract public DtProducto getProducto();
    abstract public int getCantidadProductoTotalVendidos();
    abstract public Map<int, CantidadProducto> getProductosAlmacenados(boolean &tiene_menu);
    abstract public void borrarProductos();
    abstract public Map<int, DtProductoCantidad> getDatosIngresadosMenu();
};