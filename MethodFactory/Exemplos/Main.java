class Main175 {
    public static void main(String[] args) {
      MaquinaBebida maquinaCafe = new MaquinaCafe();
      Bebida b1 = maquinaCafe.entregaBebiba();
  
      MaquinaBebida maquinaRefrigerante = new MaquinaRefrigerante();
      Bebida b2 = maquinaRefrigerante.entregaBebiba();
  
      Bebida b3 = maquinaRefrigerante.entregaBebiba();
    }
  }