package com.speedfast.app;

import com.speedfast.model.Pedido;
import com.speedfast.model.PedidoComida;
import com.speedfast.model.PedidoEncomienda;
import com.speedfast.model.PedidoExpress;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos  = new ArrayList<>();

        pedidos.add(new PedidoComida("C001", "Los Pintores 5356", 5.6));
        pedidos.add(new PedidoEncomienda("A003", "Carlos Leon 6230", 10.0));
        pedidos.add(new PedidoExpress("A004", "Carlos Segundo 5730", 1.1));
        pedidos.add(new PedidoExpress("B774", "las Praderas 569", 6.7));

        System.out.println("==* SISTEMA DE GESTION SPEEDFAST *==");
        for (Pedido p : pedidos) {
            p.mostrarResumen();
            System.out.println("Tipo: " + p.getClass().getSimpleName());
            System.out.println("Tiempo estimado: " + p.calcularTiempoEntrega() + " minutos.");
        }
        System.out.println("--------------------------------------");
    }
}
