import com.academy.Menu;
import com.models.Room;
import com.models.enums.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws IOException {

        Menu.showLoginMenu();

        String path = "resources/room-types.txt";
        String line = "";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
        while((line = br.readLine()) != null) {
            String[] values = line.split(", ");
            String roomType = values[0];
            int maxOccupancy = Integer.parseInt(values[1]);
            String[] amenities = new String[values.length - 2];
            // Store amenities in another array
            for (int i = 2; i < values.length; i++) {
                amenities[i-2] = values[i];
            }
            System.out.println(Arrays.toString(amenities));
        }

        } catch(IOException e) {
            e.printStackTrace();
        }

        Room room1 = new Room(101, RoomType.SINGLE, new BigDecimal("110.50"), new BigDecimal("35.50"));




    }
}