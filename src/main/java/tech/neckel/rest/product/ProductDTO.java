package tech.neckel.rest.product;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class ProductDTO implements Serializable {
    private Long id;
    private String description;

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
