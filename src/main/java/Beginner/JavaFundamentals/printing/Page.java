package Beginner.JavaFundamentals.printing;

/**
 * Created by kalit_000 on 5/10/17.
 */
public class Page {

    private String printedText;

    public Page(String Text){
        printedText = Text;
    }


    public String getText(){
        return printedText;
    }

}
