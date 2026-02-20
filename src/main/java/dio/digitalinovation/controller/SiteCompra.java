package dio.digitalinovation.controller;

import dio.digitalinovation.facade.RealizarCompra;

public class SiteCompra {
    public static void main (String[] args){
        RealizarCompra compra = new RealizarCompra();
        compra.finalizarCompra();
    }
}
