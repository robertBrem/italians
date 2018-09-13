package ch.open.italians.food.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("food")
public class FoodResource {

    @GET
    public String getFood() {
        return "pasta";
    }
}
