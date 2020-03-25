import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AthleteCSVReader {


    static List<Athlete> readAthlete(String fileName){
        List<Athlete> athletes = new ArrayList<Athlete>();
        try{
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(fileName));
            String line = bufferedReader.readLine();
            while(line != null){
                String[] tokens = line.split(",");
                Athlete athlete = new Athlete(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6]);
                athletes.add(athlete);

                line = bufferedReader.readLine();
                System.out.println(athletes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return athletes;
    }

}
