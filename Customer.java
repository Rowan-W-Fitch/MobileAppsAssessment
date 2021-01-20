class Customer{

  Restaurant rest;
  Robot waiter;

  public Customer(Restaurant r, Robot w){

    this.rest = r;
    this.waiter = w;

  }

  public void payCheck(Check c){

    if(c.isPaid == true){
      return;
    }
    c.isPaid = true;
    this.r.balance += c.total;

  }

}
