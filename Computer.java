class Computer {
  private int ramAmount;
  private String graphicsCard;
  private String storageSize;

  Computer(int ram, String graphics, String storage){
    ramAmount = ram;
    graphicsCard = graphics;
    storageSize = storage;
  }

  public int GetRamAmount(){
    return ramAmount;
  }
  
  public String GetGraphicsCard(){
    return graphicsCard;
  }
  
  public String GetStorageSize(){
    return storageSize;
  }

  public void SetRamAmount(int ram){
    ramAmount = ram;
  }
  
  public void SetGraphicsCard(String graphics){
    graphicsCard = graphics;
  }
  
  public void SetStorageSize(String storage){
    storageSize = storage;
  }
}