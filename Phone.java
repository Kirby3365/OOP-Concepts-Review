class Phone extends Computer{
  private String phoneType;
  private String phoneNumber;
  static int totalPhones;

  Phone(String pType, String pNum, int ram, String graphics, String storage){
    super(ram, graphics, storage);
    phoneType = pType;
    phoneNumber = pNum;
    totalPhones++;
  }

  Phone(String pType, int ram, String graphics, String storage){
    super(ram, graphics, storage);
    phoneType = pType;
    totalPhones++;
  }

  public String GetPhoneType(){
    return phoneType;
  }
  
  public String GetPhoneNumber(){
    return phoneNumber;
  }

  public void SetPhoneType(String pType){
    phoneType = pType;
  }

  public void SetPhoneNumber(String pNum){
    phoneNumber = pNum;
  }
}