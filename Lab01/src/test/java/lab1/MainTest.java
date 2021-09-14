package lab1;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Logger;
import java.io.IOException;

import static lab1.Main.main;

public class MainTest {
    @Test()
    public static void Test01(){
        Vehiculo nissan = new Vehiculo(100, 10, 0.9);
        //logger.info(nissan.abastecer(20));
        Assert.assertEquals("Automóvil no se puede reabastecer el tanque, está lleno.", nissan.viajar(4));
        
    }
    
}
