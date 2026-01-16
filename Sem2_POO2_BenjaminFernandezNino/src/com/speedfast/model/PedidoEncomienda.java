package com.speedfast.model;

/**
 * Pedido especializado en trasnpoorte de alimentos.
 */
public class PedidoEncomienda extends Pedido {
    public PedidoEncomienda(String idPedido, String direccionEntrega, double distanciaKm){
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * calcular el tiempo de entrega
     * @return 20 min base + 1.5 min por km, redondeado a entero.
     */
    @Override
    public int calcularTiempoEntrega() {
        return 20 + (int) Math.round(getDistanciaKm() * 1.5);  //math.round redondea los números hacia arriba desde el .5, asi queda en entero.
    }
}
