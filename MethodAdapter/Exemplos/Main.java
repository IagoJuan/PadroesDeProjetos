package Exercicios;

class Main1 {
    public static void main(String args[]) {
          MedidorTemperatura medidor = new AdaptadorFarenheit();
          System.out.println("Temperatura Celsius = " + medidor.temperaturaCelsius());
      }
  }