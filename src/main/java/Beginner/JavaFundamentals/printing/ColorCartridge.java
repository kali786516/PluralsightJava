package Beginner.JavaFundamentals.printing;

/**
 * Created by kalit_000 on 5/6/17.
 */
public class ColorCartridge implements ICartridge {

    @Override
    public String toString(){
        return "color!";
    }

    @Override
    public String getFillPercentage(){
        return "50%";
    }
}
