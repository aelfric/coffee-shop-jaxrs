package edu.stevens.friccobo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/hello-resteasy")
public class CoffeeResource {

  private final Map<String, Coffee> menu = Map.of(
      "Latte", new Coffee("Latte", 295),
      "Cappuccino", new Coffee("Cappuccino", 275),
      "Macchiato", new Coffee("Macchiato", 375),
      "Flat White", new Coffee("Flat White", 375)
  );

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Collection<Coffee> takeOrder() {
    return menu.values();
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Order takeOrder(Order order) {
    order.addMenu(menu);
    return order;
  }
}