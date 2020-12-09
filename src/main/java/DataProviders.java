import org.testng.annotations.DataProvider;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataProviders {


    @DataProvider(name = "JoinToday")
    public static Object[][] testRegistration() {
        return new Object[][]{
                {Data.email1, Data.username, true},
                {Data.email2, Data.username, false},
                {Data.email3, Data.username, true}
        };
    }

    @DataProvider(name = "JoinToday2")
    public static Object[][] testRegistration2() throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("JoinToday.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]});
        });
        return out.toArray(new Object[out.size()][]);
    }
}
