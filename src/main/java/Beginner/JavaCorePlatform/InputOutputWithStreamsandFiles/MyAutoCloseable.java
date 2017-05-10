package Beginner.JavaCorePlatform.InputOutputWithStreamsandFiles;

/**
 * Created by kalit_000 on 4/16/17.
 */

import java.io.IOException;

public class MyAutoCloseable implements  AutoCloseable{
    public void saySomething() throws IOException{
        System.out.println("soemthing");

    }

    @Override
    public void close() throws IOException {
        System.out.println("close");
    }


}
