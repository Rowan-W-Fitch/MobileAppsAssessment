class Robot{

  Restaurant rest;
  int serial;

  public Robot(Restaurant r, int s){

    this.rest = r;
    this.serial = s;

  }

  public Check openCheck(Customer c){

    Check chk = new Check(c, this, this.rest);
    return chk;

  }

  public Item addItem(Check c, String name, double price){

    Item itm = new Item(name, price, this.rest, c);
    c.total += price;
    return itm;

  }

}
