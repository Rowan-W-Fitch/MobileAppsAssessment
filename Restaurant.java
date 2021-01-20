class Restaurant{

  String name;
  String phoneNumber;
  String address;
  double balance;

  public Restaurant(String name, String phone, String addy){

    this.name = name;
    this.phoneNumber = phone;
    this.address = addy;
    this.balance = 0.0;

  }

  public Robot hireRobot(int serial){

    Robot robo = new Robot(this, serial);
    return robo;

  }

  public Chef hireChef(int serial){

    Chef chf = new Chef(this, serial);
    return chf;

  }

  public Customer seatCustomer(Robot r){

    Customer c = new Customer(this, r);
    return c;

  }

}
