package Calculo;

public class Calcular {
    
    double resultado;
    double primeiroValor;
    double segundovalor;

    public void somar(){
        resultado = getPrimeiroValor() + getSegundovalor();
        System.out.println(" o resultado da soma é de " + resultado);
    }


    public double getPrimeiroValor() {
        return primeiroValor;
    }

    public void setPrimeiroValor(double primeiroValor) {
        this.primeiroValor = primeiroValor;
    }

    public double getSegundovalor() {
        return segundovalor;
    }

    public void setSegundovalor(double segundovalor) {
        this.segundovalor = segundovalor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
