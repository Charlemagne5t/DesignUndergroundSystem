import org.example.UndergroundSystem;
import org.junit.Assert;
import org.junit.Test;

//UndergroundSystem undergroundSystem = new UndergroundSystem();
//undergroundSystem.checkIn(45, "Leyton", 3);
//undergroundSystem.checkIn(32, "Paradise", 8);
//undergroundSystem.checkIn(27, "Leyton", 10);
//undergroundSystem.checkOut(45, "Waterloo", 15);  // Customer 45 "Leyton" -> "Waterloo" in 15-3 = 12
//undergroundSystem.checkOut(27, "Waterloo", 20);  // Customer 27 "Leyton" -> "Waterloo" in 20-10 = 10
//undergroundSystem.checkOut(32, "Cambridge", 22); // Customer 32 "Paradise" -> "Cambridge" in 22-8 = 14
//undergroundSystem.getAverageTime("Paradise", "Cambridge"); // return 14.00000. One trip "Paradise" -> "Cambridge", (14) / 1 = 14
//undergroundSystem.getAverageTime("Leyton", "Waterloo");    // return 11.00000. Two trips "Leyton" -> "Waterloo", (10 + 12) / 2 = 11
//undergroundSystem.checkIn(10, "Leyton", 24);
//undergroundSystem.getAverageTime("Leyton", "Waterloo");    // return 11.00000
//undergroundSystem.checkOut(10, "Waterloo", 38);  // Customer 10 "Leyton" -> "Waterloo" in 38-24 = 14
//undergroundSystem.getAverageTime("Leyton", "Waterloo");    // return 12.00000. Three trips "Leyton" -> "Waterloo", (10 + 12 + 14) / 3 = 12
public class UndergroundSystemTest {
    @Test
    public void undergroundSystemTest1(){
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);  // Customer 45 "Leyton" -> "Waterloo" in 15-3 = 12
        undergroundSystem.checkOut(27, "Waterloo", 20);  // Customer 27 "Leyton" -> "Waterloo" in 20-10 = 10
        undergroundSystem.checkOut(32, "Cambridge", 22); // Customer 32 "Paradise" -> "Cambridge" in 22-8 = 14
        Assert.assertEquals(14.000, undergroundSystem.getAverageTime("Paradise", "Cambridge"), 0.00001);
        undergroundSystem.getAverageTime("Paradise", "Cambridge"); // return 14.00000. One trip "Paradise" -> "Cambridge", (14) / 1 = 14
        Assert.assertEquals(11.000, undergroundSystem.getAverageTime("Leyton", "Waterloo"), 0.00001);
        undergroundSystem.getAverageTime("Leyton", "Waterloo");    // return 11.00000. Two trips "Leyton" -> "Waterloo", (10 + 12) / 2 = 11
        undergroundSystem.checkIn(10, "Leyton", 24);
        Assert.assertEquals(11.000, undergroundSystem.getAverageTime("Leyton", "Waterloo"), 0.00001);
        undergroundSystem.getAverageTime("Leyton", "Waterloo");    // return 11.00000
        undergroundSystem.checkOut(10, "Waterloo", 38);  // Customer 10 "Leyton" -> "Waterloo" in 38-24 = 14
        Assert.assertEquals(12.000, undergroundSystem.getAverageTime("Leyton", "Waterloo"), 0.00001);
        undergroundSystem.getAverageTime("Leyton", "Waterloo");    // return 12.00000. Three trips "Leyton" -> "Waterloo", (10 + 12 + 14) / 3 = 12
    }

}
