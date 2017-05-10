package Beginner.JavaFundamentals.printing;

/**
 * Created by kalit_000 on 5/6/17.
 */
public class Machiene implements IMachine{

    protected boolean isOn;

    public Machiene(boolean isOn){
        this.isOn=isOn;
    }

    public void TurnOn(){
        isOn=true;
        System.out.println("Machine is on!");
    }

    public void TurnOff(){
        isOn=false;
    }

    @Override
    public boolean isOn(){
        return isOn;
    }


}
