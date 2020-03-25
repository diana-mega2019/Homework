
import java.io.*;
import java.util.*;

public class FinalResult<athlete, finalScore> {
    public static void main(String[] args) {
        returnRanking();
        calculateFinalScore();
        countPenalty();
        calculateSkiTimeInSeconds();
        athleteSerialization();
    }

    private HashMap<athlete, finalScore> returnRanking(HashMap<athlete, finalScore> hm){
        Athlete athlete = new Athlete();
        byte finalScore;
        List<Map.Entry<athlete, finalScore> > list =
                new LinkedList<Map.Entry<athlete, finalScore> >(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<athlete, finalScore>>() {
            public int compare(Map.Entry<athlete, finalScore> o1,
                               Map.Entry<athlete, finalScore> o2)
            {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        HashMap<athlete, finalScore> ranking = new LinkedHashMap<>();
        for (Map.Entry<athlete, finalScore> aa : list) {
            ranking.put(aa.getKey(), aa.getValue());
        }
        return ranking;

    }

    private static byte calculateFinalScore() {
        Object skiTimeResult = new Object();
        byte count = countPenalty();
        byte finalScore = (byte) (calculateSkiTimeInSeconds() + 10 * countPenalty());

        return finalScore;

    }

    private static byte countPenalty() {
        String[] tokens = new String[0];
        String firstShootingRange = tokens[4];
        String secondShootingRange = tokens[5];
        String thirdShootingRange = tokens[6];
        char miss = 'o';
        byte count = 0;
        for (int i = 0; i < firstShootingRange.length(); i++) {
            if (firstShootingRange.charAt(i) == miss) {
                count++;
            }
        }
        for (int i = 0; i < secondShootingRange.length(); i++) {
            if (secondShootingRange.charAt(i) == miss) {
                count++;
            }
        }
        for (int i = 0; i < thirdShootingRange.length(); i++) {
            if (thirdShootingRange.charAt(i) == miss) {
                count++;
            }
        }
        return count;
    }



        private static byte calculateSkiTimeInSeconds () {
            SkiTimeResult skiTimeResult = new SkiTimeResult();
            byte skiTimeInSeconds = (byte) (skiTimeResult.getSeconds() + 60 * skiTimeResult.getMinutes());
            return skiTimeInSeconds;

        }

        private static void athleteSerialization () {
            String fileName = "SkiBiathlon.csv";

            AthleteCSVReader athleteCSVReader = new AthleteCSVReader();
            List<Athlete> athleteList = AthleteCSVReader.readAthlete(fileName);

            for (Athlete athlete : athleteList) {

            }

            try {
                ObjectOutputStream objectOutputStream =
                        new ObjectOutputStream(new FileOutputStream("athlete.obj"));

                objectOutputStream.writeObject(athleteList.get(1));
                objectOutputStream.flush();
                objectOutputStream.close();

                // Client
                ObjectInputStream objectInputStream =
                        new ObjectInputStream(new FileInputStream("athlete.obj"));

                try {
                    Object o = objectInputStream.readObject();
                    Athlete athlete = (Athlete) o;
                    System.out.println(athlete);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }



