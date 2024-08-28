package br.com.fabriciocurvello.appcalculadoracimatecjava;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void adicaoTest() {
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.calcular(2.0, 3.0, "Adição");
        Assert.assertEquals(5.0,resultado, 0.01);
    }
}
// Elabore os testes unitários para subtração, multiplicação e divisão.