package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.stereotype.Controller;

@Controller
public class BuyNowController {

    @Autowired
    private ProductService productService;

    @PostMapping("/buy/{id}")
    public String buyProduct(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) {
        Product product = productService.findById(id);

        if (product == null) {
            redirectAttributes.addFlashAttribute("errorMessage", "Product not found");
        } else if (product.getInv() <= 0) { // use getInv() here
            redirectAttributes.addFlashAttribute("errorMessage", "Sorry, this product is out of stock");
        } else {
            product.setInv(product.getInv() - 1); // and setInv() here
            productService.save(product); // use save(), not saveProduct()
            redirectAttributes.addFlashAttribute("successMessage", "Product purchased successfully");
        }

        return "redirect:/mainscreen";
    }
}


