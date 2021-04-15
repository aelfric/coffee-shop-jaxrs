package edu.stevens.friccobo;

public class Coffee {
  public final String coffeeType;
  private final int priceCents;


  public Coffee(String name, int priceCents) {
    this.coffeeType = name;
    this.priceCents = priceCents;
  }

  public int getPriceCents(){
    return this.priceCents;
  }
}
