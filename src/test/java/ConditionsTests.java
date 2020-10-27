import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConditionsTests {

    @Test
    public void test1() {
        String car1 = "Ford";
        String car2 = "Maserati";
        if (car1.contains("Ford")) {
            System.out.println("I love Ford cars!");
        }
        if (car2.contains("Maserati")) {
            System.out.println("I love Maserati cars!");
        } else {
            System.out.println("I don't like driving a car !");
        }
    }

    @Test
    public void test2() {
        String car1 = "Ford";
        String car2 = "Maserati";
        if (car1.contains("Maserati")) {
            System.out.println("I love Ford cars!");
        }
        if (car2.contains("Maserati")) {
            System.out.println("I love Maserati cars!");
        } else {
            System.out.println("I don't like driving a car !");
        }
    }

    @Test
    public void test3() {
        String car1 = "BMV";
        String car2 = "Toyota";
        if (car1.contains("Maserati")) {
            System.out.println("I love Ford cars!");
        }
        if (car2.contains("Maserati")) {
            System.out.println("I love Maserati cars!");
        } else {
            Assert.fail("I don't like driving a car !");
        }
    }

    @Test
    public void test4() {
        String animal1 = "Cat";
        String animal2 = "Zebra";
        if (animal1.contains("Cat") && animal2.contains("Zebra")) {
            System.out.println("Animals are our friends!");
        } else {
            Assert.fail("I don't like animals !");
        }
    }

    @Test
    public void test5() {
        String animal1 = "Cat";
        String animal2 = "Cat";
        if (animal1.contains("Cat") || animal2.contains("Zebra")) {
            System.out.println("Animals are our friends!");
        } else {
            Assert.fail("I don't like animals !");
        }
    }

    @Test
    public void test6() {
        int number = 20;
        if (number == 25) {
            System.out.println("The number is valid");
        }
    }

    @Test
    public void test7() {
        int number = 20;
        int sum;
        if (number == 20 + 9) {
            sum = 10 + 35;
        } else {
            sum = 40 - 5;
            System.out.println(sum);
        }
    }

    @Test
    public void test8() {
        boolean lifetime = true;
        if (lifetime) {
            System.out.println("Boolean is true!");
        } else {
            Assert.fail("Boolean is false!");
        }
    }

    @Test
    public void test9() {
        boolean lifetime = false;
        if (!lifetime) {
            System.out.println("Boolean is true!");
        } else {
            Assert.fail("Boolean is false!");
        }
    }

    @Test
    public void test10() {
        List<String> cars = new ArrayList<>(Arrays.asList("BMW", "Ford", "Mazda"));
        String element = cars.get(1);
        System.out.println(element);
    }

    @Test
    public void test11() {
        List<String> cars = new ArrayList<>(Arrays.asList("BMW", "Ford", "Mazda"));
        if (cars.contains("Ford")) {
            System.out.println(cars);
        }
    }

    @Test
    public void test12() {
        List<Integer> cars = new ArrayList<>(Arrays.asList(10, 20, 33));
        int sum = cars.get(1) + cars.get(2);
        System.out.println(sum);
    }


}
