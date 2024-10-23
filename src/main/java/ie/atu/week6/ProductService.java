package ie.atu.week6;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product)
    {
        // imagine we have a connection to a database
        myList.add(product);
        return myList;
    }

    public List<Product> putProduct(Product product, int id){

        for (int i = 0; i < myList.size(); i++){
            if (myList.get(i).getId() == id)
                myList.set(i, product);
        }
        return myList;
    }

    public List<Product> deleteProduct(int id)
    {
        for (int count = 0; count < myList.size(); count++)
        {
            if (myList.get(count).getId() == id) myList.remove(count);
        }
        return myList;
    }

}
