package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class LocationsEx1 {

    public static void main(String[] args) throws IOException {

        Path inputpath = Path.of("locations.txt");                    //Input-path creation that refers to locations.txt
        Path outputPath = Path.of("locations_formatted.txt");         //Output-path creation

        List<String> lines = Files.readAllLines(inputpath);  //loads all lines referring to locations.txt in a List<String>
                                                             // in a single call. List -> is like an array!

        for (int i = 1; i < lines.size(); i++) {       // with a for we traverse every line and split it into
            String line = lines.get(i);                // segments with the line.split(",")command. Assuming that every
            String[] split = line.split(",");          //line has the location,latitude and longitude. From i=1  because
            String city = split[0];                    //i=0 is the title Location, Latitude, Longitude. We do not need it.
            String latitude = split[1];
            String longitude = split[2];

            String result = String.format("{ location: '%s' , latitude: %s , longitude: %s },\n", city, latitude, longitude);

            Files.writeString(
                    outputPath,
                    result,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        }
    }
}
