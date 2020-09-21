class Main {
  public static void main(String[] args) {
    //illegal construct
    //Compile Time Error: The constructor SingleObject() is not visible
    //SingleObject object = new SingleObject();

    try {
      //Get the only object available
      MyFile object = MyFile.getInstance();

      // read the file
      String content = object.readFile();

      // update content and write to file
      System.out.println(content);
      content += "(NOVO)";
      object.writeFile(content);

      // read the file again and print content
      content = object.readFile();
      System.out.println(content);
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}