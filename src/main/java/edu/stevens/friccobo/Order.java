package edu.stevens.friccobo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
  public List<String> coffees;
  private Map<String, Coffee> menu = new HashMap<>();

  public void addMenu(Map<String, Coffee> menu){
    this.menu.putAll(menu);
  }

  public int getPrice(){
    int price = 0;
    for(String coffee : coffees){
      price += menu.get(coffee).getPriceCents();
    }
    return price;
  }
}
