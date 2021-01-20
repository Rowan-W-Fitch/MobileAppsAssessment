class Check{

  Customer customer;
  Robot robot;
  Restaurant rest;
  double total;
  boolean isPaid;

  public Check(Customer c, Robot r, Restaurant rt){

    this.customer = c;
    this.robot = r;
    this.rest = rt;
    this.total = 0.0;
    this.isPaid = false;

  }

}
