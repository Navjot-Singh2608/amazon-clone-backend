package com.example.addToCart.Controller;

import com.example.addToCart.Entity.Cart;
import com.example.addToCart.Entity.CartDetails;
import com.example.addToCart.Service.AddToCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/amazon/addToCart")
public class AddToCartController {

    @Autowired
    AddToCartService addToCartService;

    @PostMapping("/add")
    public void addToCart(@RequestBody Cart cart) {
        addToCartService.addItemTOCartService(cart);
    }

    @DeleteMapping("/remove")
    public void removeFromCart(@RequestBody Cart cart) {
        addToCartService.removeItemFromCartService(cart);
    }

    @GetMapping("/show/{userId}")
    public CartDetails showItems(@PathVariable UUID userId) {
        return addToCartService.displayAllProductsInCart(userId);
    }
}