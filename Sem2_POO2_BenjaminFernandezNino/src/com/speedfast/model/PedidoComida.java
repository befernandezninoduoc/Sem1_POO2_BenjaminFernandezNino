package com.speedfast.model;

/**
 * Pedido especializado en transporte de alimentos.
 */
public class PedidoComida extends Pedido {
    public PedidoComida(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Calcular tiempo de entegra
     * @return 15 min base + 2 min por cada km
     */
    @Override
    public int calcularTiempoEntrega() {
        return 15 + (int)(getDistanciaKm() * 2);
    }
}


