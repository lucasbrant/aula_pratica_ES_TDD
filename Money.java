class Dollar extends Money {
  Dollar(int amount) {
    this.amount= amount;
  }
  
  Dollar times(int multiplier) {
      return new Dollar(amount * multiplier);
  }

  public boolean equals(Object object)  {
    Dollar dollar = (Dollar) object;
    return amount == dollar.amount;
  }

}

class Franc extends Money {
  Franc(int amount) {      
    this.amount= amount;
  }					
  
  Franc times(int multiplier)  {      
     return new Franc(amount * multiplier);					
  }   
  
  public boolean equals(Object object) {					
    Franc franc = (Franc) object;      
    return amount == franc.amount;					
  }					
}

class Money  {
  protected int amount;
   
  public boolean equals(Object object)  {
    Money money = (Money) object;
    return amount == money.amount;
  }

}
