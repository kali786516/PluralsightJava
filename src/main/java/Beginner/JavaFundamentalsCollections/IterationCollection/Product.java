package Beginner.JavaFundamentalsCollections.IterationCollection;

/**
 * Created by kalit_000 on 4/21/17.
 */
public class Product {

    public String name;
    public Integer weight;


    //constrcutor
    public Product(String name,Integer weight){

        this.name=name;
        this.weight=weight;
    }

    public String getName() { return name;}

    public Integer getWeight() { return weight;}


    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){

        return "Product{" +
                "name=" + name + '\'' +
                "weight=" + weight +
                '}' ;


    }





}
