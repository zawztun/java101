package web.products;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import web.utils.Product;

@RestController
public class ProductController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/product")
    public Product getProduct(@RequestParam(value = "hello", defaultValue= "World" ) String name) {
    return new Product(counter.incrementAndGet(), String.format(template, name));
    }


        @RequestMapping("/product")
        public String home(){
            return "Hello World!";
        }

}
