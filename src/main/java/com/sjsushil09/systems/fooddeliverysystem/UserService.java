package com.sjsushil09.systems.fooddeliverysystem;

import lombok.Data;

import java.util.List;

@Data
public class UserService {

    List<User> userList;
    public void createUser(User user){
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public void updateUser(User user) {

        userList.forEach((u->{
            if(u.getId() == user.getId()){
                u.setName(user.getName());
                u.setEmail(user.getEmail());
                u.setPassword(user.getPassword());
            }
        }));
    }

    public void checkout(Cart cart) {
        int orderId = cart.placeOrder();
        System.out.println("Order with id " + orderId + " has been placed");
    }
}
