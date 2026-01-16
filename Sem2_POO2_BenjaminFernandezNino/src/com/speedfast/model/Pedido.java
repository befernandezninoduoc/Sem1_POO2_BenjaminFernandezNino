package com.speedfast.model;

/**
 * Representa la base abstracta para todos los pedidos de SpeedFast
 * Define los atributos comunes y el contrato para calcular tiempos de entrega.
 * * @author Benjamín Fernández-Niño
 * * @version 1.0
 */
public abstract class Pedido {
    private String idPedido;
    private String direccionEntrega;
    private double distanciaKm;

    /**
     * Constructor para inicializar un pedido base.
     * @param idPedido  Identificador único.
     * @param direccionEntrega Destino final.
     * @param distanciaKm Distancia en kilómetros.
     */
    public Pedido(String idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    /**
     * Imprime en consola los datos básicos del pedido.
     */
    public void mostrarResumen(){
        System.out.println("--------------------------------------");
        System.out.println("ID Pedido: " + idPedido);
        System.out.println("Direccion Entrega: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " km");
    }

    /**
     * Método abstracto para calcular el tiempo de entrega estimado.
     * @return tiempo en minutos .
     * Getters para que ls subclases puedan acceder a los datos privados.
     */
    public abstract int calcularTiempoEntrega();

    public double getDistanciaKm() {
        return distanciaKm;
    }
    public String getIdPedido() {
        return idPedido;
    }
}
