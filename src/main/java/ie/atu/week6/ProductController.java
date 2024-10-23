package ie.atu.week6;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private ProductService myProduct;

    private List<Product> myList = new ArrayList<>();
    public ProductController(ProductService myProduct) {
        this.myProduct = myProduct;
    }

    @PostMapping("/newProduct")

    public List<Product> mewProduct(@RequestBody Product product)
    {
        //business logic to add this to database
        // return list of all products from the database
        return myProduct.addProduct(product);

    }

    @PutMapping("/{id}")
    public List<Product> updateProduct(@Valid @PathVariable int id, @RequestBody Product product){
        return myProduct.putProduct(product, id);
    }


    @DeleteMapping("/deleteProduct/{id}")
    public List<Product> deleteProduct(@PathVariable int id)
    {
        return myProduct.deleteProduct(id);
    }

}
