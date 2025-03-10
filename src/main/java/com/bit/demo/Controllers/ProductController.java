package com.bit.demo.Controllers;

import com.bit.demo.Entities.Product;
import com.bit.demo.Services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;


    @GetMapping
    public String home(Model model) {

        model.addAttribute("message", "2345678");
        return "index";
    }
}
