import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Malte on 12.12.2015.
 */
public class writeFile {


    public void writeData(User userTemp, Damage damageTemp) {

        FileWriter writer;
        File datei = new File("DamageReportData.txt");
        try {
            writer = new FileWriter(datei, true);
            writer.write(userTemp.getName()
                    + "   " + userTemp.getGender()
                    + "   " + userTemp.getBirthday()
                    + "   " + userTemp.getMatricNumber()
                    + "   " + damageTemp.getDate()
                    + "   " + damageTemp.getCategorie()
                    + "   " + damageTemp.getDescription()
                    + "   " + damageTemp.getRoom().getHouseNr()
                    + "." + damageTemp.getRoom().getStage()
                    + "." + damageTemp.getRoom().getRoomNr());
            writer.write(System.getProperty("line.separator"));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
