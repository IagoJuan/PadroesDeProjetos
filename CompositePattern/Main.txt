class Main {
  public static void main(String[] args) 
    {
        try {
          // Creating a component tree
          Component component = new FolderItem("Root");
  
          // Adding all accounts of a customer to component
          component.add(new FileItem("DA001", 100));
          component.add(new FileItem("DA002", 150));

          // Creating a component tree
          Component subFolder = new FolderItem("subFolder");
          component.add(subFolder);
  
          subFolder.add(new FileItem("SA001", 200));
          subFolder.add(new FileItem("SA002", 100));
          subFolder.add(new FileItem("SA003", 300));
  
          // getting composite balance for the customer
          float totalSize = component.getSize();
          System.out.println("Total Size : " + totalSize);

          component.list(0);
        }
        catch (Exception e) {
          e.printStackTrace();
        }
    }
}