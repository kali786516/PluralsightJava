package FaceBook;

import java.util.ArrayList;

/**
 * Created by kalit_000 on 4/29/17.
 */
public class OddElementsInAList {

    public static void main(String[] args){


        ArrayList<Integer> numbers=new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        if (numbers.size()%2 == 0) {
            for (Integer test : numbers) {
                 //System.out.println(test);

            }
        }

        long[] digits=new long[5];

        digits[0]=10;
        digits[1]=12;
        digits[2]=15;
        digits[3]=20;
        digits[4]=25;

        for(int i=0;i <digits.length;i++){
            if(digits[i]%2==0){
                System.out.println(digits[i]);
            }

        }




    }


}
