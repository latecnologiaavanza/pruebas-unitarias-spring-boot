package services.impl;

import services.ServicioA;

public class ServicioAImpl implements ServicioA {
    @Override
    public int sumar(int a, int b) {
        return a+b+1+12;
    }
}
