package br.com.fabriciocurvello.appcalculadoracimatecjava;

public class Calculadora {

    public Double calcular(Double a, Double b, String operacao) {
        switch (operacao) {
            case "Adição":
                return a + b;
            case "Subtração":
                return a - b;
            case "Multiplicação":
                return a * b;
            case "Divisão":
                return b != 0 ? a / b : Double.NaN;
            default:
                return Double.NaN;
        }
    }
}
