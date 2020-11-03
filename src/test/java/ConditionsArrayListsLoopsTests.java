import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConditionsArrayListsLoopsTests {

    @Test
    public void test1() {         //ConditionsStrings
        String boat1 = "Freshwater Fishing Boat";
        String boat2 = "Sail Boat";
        String boat3 = "Speed Boat";
        if (boat2.contains("Freshwater Fishing Boat") && boat3.contains("Sail Boat")) {
            System.out.println("I love fishing !");
        }
        if (boat1.contains("Freshwater Fishing Boat") || boat2.contains("Sail Boat")) {
            System.out.println("I love all boats!");
        }
        if (boat3.contains("Speed Boat") == boat2.contains("Sail Boat")) {
            System.out.println("I love deep water!");
        } else {
            Assert.fail("I don't like boats!");
        }
    }

    @Test
    public void test2() {          //ConditionsInts
        int agemin = 18;
        int agemax = 60;
        if (agemin == 18) {
            if (agemax <= 65) {
                System.out.println("You can work with us!");
            } else if (agemin <= 19 && agemax >= 66) {
                System.out.println("You cannot work with us!");
            } else {
                Assert.fail("Invalid inputs!");
            }
        }
    }

    @Test
    public void test3() {          //ArrayListStrings
        List<String> yachts = new ArrayList<>(Arrays.asList("Azimut", "Mangusta", "Benetti", "VanDutch"));
        if (yachts.contains("VanDutch")) {
            System.out.println(yachts + yachts.set( 1, "Ferretti"));
        }

    }

    @Test
    public void test4() {          //ArrayListInts
        List<Integer> ages = new ArrayList<>(Arrays.asList(16, 20, 35, 49));
        int sum = ages.get(1) + ages.get(3);
        System.out.println(sum + ages.get(0));
    }

    @Test
    public void test5(){          //LoopStrings
       List<String> flowers = new ArrayList<>(Arrays.asList("Roses","Tulips","Peonies"));
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println(flowers.get(i));

        }

    }


}






