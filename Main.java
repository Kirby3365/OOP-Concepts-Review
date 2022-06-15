class Main {
  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    Computer comput = new Computer(16, "1080", "500GB");
    
    System.out.println("Computer");
    System.out.println("Ram: " + comput.GetRamAmount());
    System.out.println("Graphics: " + comput.GetGraphicsCard());
    System.out.println("Storage: " + comput.GetStorageSize());

    comput.SetRamAmount(32);
    comput.SetGraphicsCard("2080");
    comput.SetStorageSize("1TB");

    System.out.println();
    
    System.out.println("New Computer");
    System.out.println("Ram: " + comput.GetRamAmount());
    System.out.println("Graphics: " + comput.GetGraphicsCard());
    System.out.println("Storage: " + comput.GetStorageSize());

    System.out.println();
    
    Phone phone = new Phone("Samsung", "7801234567", 12, "Snapdragon 888", "128GB");

    System.out.println("Phone");
    System.out.println("Type: " + phone.GetPhoneType());
    System.out.println("Number: " + phone.GetPhoneNumber());
    System.out.println("Ram: " + phone.GetRamAmount());
    System.out.println("Graphics: " + phone.GetGraphicsCard());
    System.out.println("Storage: " + phone.GetStorageSize());

    phone.SetPhoneType("Apple");
    phone.SetPhoneNumber("7807654321");
    phone.SetRamAmount(4);
    phone.SetGraphicsCard("A14");
    phone.SetStorageSize("64GB");

    System.out.println();
    
    System.out.println("New Phone");
    System.out.println("Type: " + phone.GetPhoneType());
    System.out.println("Number: " + phone.GetPhoneNumber());
    System.out.println("Ram: " + phone.GetRamAmount());
    System.out.println("Graphics: " + phone.GetGraphicsCard());
    System.out.println("Storage: " + phone.GetStorageSize());

    System.out.println();
    
    Phone secondPhone = new Phone("iPod", 12, "A10", "16GB");

    System.out.println("Second Phone");
    System.out.println("Type: " + secondPhone.GetPhoneType());
    System.out.println("Ram: " + secondPhone.GetRamAmount());
    System.out.println("Graphics: " + secondPhone.GetGraphicsCard());
    System.out.println("Storage: " + secondPhone.GetStorageSize());

    System.out.println();
    
    System.out.println("Total Phones: " + Phone.totalPhones);
  }
}