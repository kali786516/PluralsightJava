package Beginner.JavaFundamentals.printing;

/**
 * Created by kalit_000 on 5/6/17.
 */
public class BWCartridge implements ICartridge {

    @Override
    public String toString(){
        return "BW!";
    }

    @Override
    public String getFillPercentage(){
        return "50%";
    }


}
