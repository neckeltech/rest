package tech.neckel.rest.easy;

import org.springframework.web.bind.annotation.*;
import tech.neckel.rest.product.ProductDTO;

@RestController
@RequestMapping("/easy")
public class EasyController {

    @GetMapping
    public String search() {
        return "Andre";
    }

    @PostMapping
    public ProductDTO create(@RequestBody ProductDTO productDto) {
        return productDto;
    }

    @PutMapping
    public ProductDTO update(@RequestBody ProductDTO productDto) {
        return productDto;
    }

    @DeleteMapping
    public void delete(long id) {
        System.out.println(id);
    }
}
