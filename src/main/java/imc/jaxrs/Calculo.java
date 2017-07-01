package imc.jaxrs;

import java.util.Date;

public class Calculo {

    private double altura;
    private double peso;   
    private String sexo;
    private double imc;
    private String resultado;
    private String dataDeProcessamento;

    Calculo(double altura, double peso, String sexo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double Peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String Sexo) {
        this.peso = peso;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getDataDeProcessamento() {
        return dataDeProcessamento;
    }

    public void setDataDeProcessamento(String dataDeProcessamento) {
        this.dataDeProcessamento = dataDeProcessamento;
    }

    public Calculo() {
    }

    public Calculo(double imc) {
        imc = peso / Math.pow(altura, 2);
    }

    public void calcular() {

        if (sexo.equals("M")) {
            if (imc < 20.7) {
                setResultado("Abaixo do peso");
            } else if (imc >= 20.7 && imc < 26.4) {
                setResultado("No peso normal");
            } else if (imc >= 26.4 && imc < 27.8) {
                setResultado("Marginalmente acima do peso");
            } else if (imc >= 27.8 && imc < 31.1) {
                setResultado("acima do peso ideal");
            } else if (imc >= 31.1) {
                setResultado("Obeso");
            }
        } else if (sexo.equals("F")) {
            if (imc < 19.1) {
                setResultado("Abaixo do peso");
            } else if (imc >= 19.1 && imc < 25.8) {
                setResultado("No peso normal");
            } else if (imc >= 25.8 && imc < 27.3) {
                setResultado("Marginalmente acima do peso");
            } else if (imc >= 27.3 && imc < 32.3) {
                setResultado("acima do peso ideal");
            } else if (imc >= 32.3) {
                setResultado("Obeso");
            }
        }
        //setResultado("Houve algum erro");
        setDataDeProcessamento(new Date().toString()); 
    }
    
  }

