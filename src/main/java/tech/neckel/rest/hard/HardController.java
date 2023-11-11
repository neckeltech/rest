package tech.neckel.rest.hard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.neckel.rest.product.ProductDTO;

import java.util.List;

@RestController
@RequestMapping("/hard")
public class HardController {

    @GetMapping("example-one")
    public ResponseEntity<List<ProductDTO>> listProducts(){
        return ResponseEntity.ok(List.of(new ProductDTO(1l, "JBL")));
    }

    @GetMapping("example-two")
    public ResponseEntity<List<ProductDTO>> listProductsNotFound(){
        return ResponseEntity.notFound().build();
    }

    @GetMapping("example-three")
    public ResponseEntity<List<ProductDTO>> listProducts400(){
        return ResponseEntity.status(400).build();
    }
}
