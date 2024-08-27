package br.com.fabriciocurvello.appcalculadoracimatecjava;

public class Calculadora {

    public Double calcular(Double n1, Double n2, String operacao) {
        switch (operacao) {
            case "Adição":
                return n1 + n2;
            case "Subtração":
                return n1 - n2;
            case "Multiplicação":
                return n1 * n2;
            case "Divisão":
                return n2 != 0 ? n1 / n2 : Double.NaN;
            default:
                return Double.NaN;
        }
    }
}
