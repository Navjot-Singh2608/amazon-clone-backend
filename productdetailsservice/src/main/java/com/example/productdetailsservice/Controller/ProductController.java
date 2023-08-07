package com.example.productdetailsservice.Controller;

import com.example.productdetailsservice.Entity.Product;
import com.example.productdetailsservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/amazon/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/save")
    public Product saveData(@RequestBody Product product) {
        return productService.saveDataToDB(product);
    }

    @GetMapping("/getAllProducts")
    public ArrayList<Product> getAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/search/{productId}")
    public Product getProductById(@PathVariable UUID productId) {
        return productService.getProductDetails(productId);
    }

}
