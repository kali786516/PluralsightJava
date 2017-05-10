package Beginner.JavaCorePlatform.InputOutputWithStreamsandFiles;

/**
 * Created by kalit_000 on 4/16/17.
 */

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        doTryCatchFinally();
        //doTryWithResources();
        //doTryWithResourcesMulti();
        //doCloseThing();
    }

    public static void doTryCatchFinally() {
        char[] buff = new char[8];
        int length;
        Reader reader = null;
        try  {
            reader = Helper.openReader("/Users/kalit_000/Downloads/java-fundamentals-core-platform/2-java-fundamentals-core-platform-m2-exercise-files/before/ExerciseTryWithResources/file1.txt");
            while((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                for(int i=0; i < length; i++)
                    System.out.print(buff[i]);
            }
        } catch(IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch(IOException e2) {
                System.out.println(e2.getClass().getSimpleName() + " - " + e2.getMessage());
            }
        }
    }

    public static void doTryWithResources() {
        char[] buff=new char[8]; // a char array we shpuld probably use list of char array
        ArrayList<Character> glist=new ArrayList<Character>(); //array list should do
        int length;
        try(Reader reader=Helper.openReader("/Users/kalit_000/Downloads/java-fundamentals-core-platform/2-java-fundamentals-core-platform-m2-exercise-files/before/ExerciseTryWithResources/file1.txt")){
            while ((length=reader.read(buff)) >= 0){
                System.out.println(" Length ="+length);
                for(int i=0;i<length;i++){
                    System.out.println(buff[i]);
                }

            }


        } catch (IOException e){
            System.out.println(e.getClass().getSimpleName()+" - "+e.getMessage());
        }





    }

    public static void doTryWithResourcesMulti() {
        char[] buff=new char[8];
        int length;
        try(Reader reader=Helper.openReader("/Users/kalit_000/Downloads/java-fundamentals-core-platform/2-java-fundamentals-core-platform-m2-exercise-files/before/ExerciseTryWithResources/file1.txt");
            Writer write=Helper.openWriter("/Users/kalit_000/Downloads/java-fundamentals-core-platform/2-java-fundamentals-core-platform-m2-exercise-files/before/ExerciseTryWithResources/file2.txt")){
            while ((length=reader.read(buff)) >= 0){
                System.out.println("Length "+length);
                write.write(buff,0,length);
            }


        }catch (IOException e){
            System.out.println(e.getClass().getSimpleName()+" - "+e.getMessage());
        }



        }

    private static void doCloseThing() {
        try(MyAutoCloseable ac = new MyAutoCloseable()) {
            ac.saySomething();
        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }


}
