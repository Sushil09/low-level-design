package com.sjsushil09.systems.fooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliverySystem {
    private UserService userService;
    private List<Restaurant> restaurants;
    private Search search;

    //1) User registration
    public void register(User user) {
        userService.createUser(user);
    }


    //2) Order/Cancel food order
    public void orderOrCancel(String type, Order order) {
        if (type.equals("place")) {
            userService.checkout(order.getUser().getCart());
        } else {
            //Cancel the order
        }
    }


    public List<SearchResult> search(String query) {
        List<SearchResult> searchResults = new ArrayList<>();

        for (Restaurant r : restaurants) {
            if (r.getName().contains(query)) {
                searchResults.add(r);
                for (Item i : r.getItems()) {
                    if (i.getName().contains(query))
                        searchResults.add(i);
                }
            }

        }

        return searchResults;
    }

}
