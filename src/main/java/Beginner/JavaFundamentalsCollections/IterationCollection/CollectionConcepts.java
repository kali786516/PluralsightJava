package Beginner.JavaFundamentalsCollections.IterationCollection;

/**
 * Created by kalit_000 on 4/21/17.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class CollectionConcepts {

    public static void main(String[] args){

        Product door=new Product("door",35);
        Product floorPanel=new Product("Floor Panel",25);
        Product window=new Product("Glass Window",10);

       Collection<Product> products = new ArrayList<>();

       products.add(door);
       products.add(floorPanel);
       products.add(window);

       products.forEach(x -> System.out.println(x));




       for(Product product:products){
           System.out.println(product);

       }

       // iterators are used to filter out the records
       final Iterator<Product> productIterator=products.iterator();
       while (productIterator.hasNext()){

           Product product=productIterator.next();
           if (product.getWeight() > 20){
               System.out.println(product);
           }
           else {
               productIterator.remove();
           }

       }

       System.out.println(products.size());
       System.out.println(products.isEmpty());

       System.out.println(products.contains(window));
       System.out.println(products.contains(door));

       Collection<Product> otherProducts=new ArrayList<>();
       otherProducts.add(window);
       otherProducts.add(door);

       products.removeAll(otherProducts);
       System.out.println(products);



    }




}
