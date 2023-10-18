import com.sirma.academy.RoomType;
import com.sirma.academy.Menu;

import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {

        Menu.showLoginMenu();

//        String path = "resources/room-types";
//        String line = "";
//        BufferedReader br = new BufferedReader(new FileReader(path));
//        while((line = br.readLine()) != null) {
//            String[] values = line.split(", ");
//            String roomType = values[0];
//            int maxOccupancy = Integer.parseInt(values[1]);
//            String[] amenities = new String[values.length - 2];
//            // Store amenities in another array
//            for (int i = 2; i < values.length; i++) {
//                amenities[i-2] = values[i];
//            }
//            System.out.println(Arrays.toString(amenities));
//        }
        RoomType roomType = new RoomType("Single");

    }
}