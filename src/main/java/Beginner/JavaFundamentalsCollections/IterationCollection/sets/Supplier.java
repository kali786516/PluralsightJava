package Beginner.JavaFundamentalsCollections.IterationCollection.sets;

/**
 * Created by kalit_000 on 4/21/17.
 */

import java.util.ArrayList;
import java.util.List;

public class Supplier {

    private final String name;
    private final List<Product> products = new ArrayList<>();

    public Supplier(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public List<Product> products()
    {
        return products;
    }

    @Override
    public String toString()
    {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

}
