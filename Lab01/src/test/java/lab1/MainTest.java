package lab1;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Logger;
import java.io.IOException;

import static lab1.Main.main;

public class MainTest {
    @Test(invocationCount = 10, threadPoolSize = 80)
    public static void Test01(){
        Vehiculo nissan = new Automovil(100, 0, 0.9);
        //logger.info(nissan.abastecer(20));
        Assert.assertEquals(nissan.abastecer(90),"La cantidad de combustible del automóvil es: 90.00");   
        Assert.assertEquals(nissan.abastecer(100),"Automóvil no se puede reabastecer el tanque, está lleno.");   
        Assert.assertEquals(nissan.viajar(4),"Automovil viajo  4.0 km y aún tiene 86.40 de combustible");   
    }

    @Test(invocationCount = 10, threadPoolSize = 80)
    public static void Test02(){
        Vehiculo volvo = new Camion(100, 0, 0.9);
        //logger.info(nissan.abastecer(20));
        Assert.assertEquals(volvo.abastecer(100),"La cantidad de combustible del camión es: 95.00");   
        Assert.assertEquals(volvo.abastecer(150),"Camión no se puede reabastecer el tanque, está lleno.");   
        Assert.assertEquals(volvo.viajar(12),"Camion viajo  12.0 km y aún tiene 84.20 de combustible");   
    }

    @Test(invocationCount = 10, threadPoolSize = 80)
    public static void Test03(){
        Vehiculo auto = new Vehiculo(100, 0, 0.9);
        //logger.info(nissan.abastecer(20));
        Assert.assertEquals(auto.viajar(12),"Vehiculo necesita reabastecimiento de combustible");   
        Assert.assertEquals(auto.abastecer(100),"Vehiculo no se puede reabastecer el tanque, está lleno");   
        Assert.assertEquals(auto.viajar(12),"Vehiculo viajo  12.0 km y aún tiene 89.20 de combustible");   
    }

    @Test(invocationCount = 10, threadPoolSize = 80)
    public static void Test04(){
        Assert.assertEquals(Main.test(),true);   
    }
    
}
