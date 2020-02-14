package product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import product.object.Product;
import product.parser.Parser;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    Parser parser;

    @RequestMapping("/")
    public String main(Model model) {
        model.addAttribute("products", parser.productList);
        return "main";
    }

    @PostMapping("/filter")
    public String find(@RequestParam String filter, Model model) {
        filter = filter.toLowerCase();
        List<Product> filteredProductList = new ArrayList<Product>();
        for(Product product: parser.productList) {
            if (product.name.contains(filter)) {
                filteredProductList.add(product);
            }
        }
        model.addAttribute("products", filteredProductList);
        return "main";
    }

}
