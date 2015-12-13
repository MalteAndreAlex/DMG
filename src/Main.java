
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Room room = null;
        Room r5e9 = new Room(5, 0, 9);
        Room r912 = new Room(9, 1, 2);
        Room r931 = new Room(9, 3, 1);

        GregorianCalendar now = new GregorianCalendar();
        /*DATUM SETZEN*/
        DateFormat today = DateFormat.getDateInstance(DateFormat.SHORT);

        User admin = new User("Malte Schäfer", "Männlich", "15.05.1992", 123456);

        String name = JOptionPane.showInputDialog("Bitte Namen eingeben");
        String genders[] = {"Männlich", "Weiblich"};
        String gender = (String) JOptionPane.showInputDialog(null, "Männlich oder Weiblich ?", "Geschlecht auswählen", JOptionPane.PLAIN_MESSAGE, null, genders, genders[0]);
        String birthday = (String) JOptionPane.showInputDialog(null, "Bitte Geburtsdatum eingeben", "01.01.2000");

        String eingabe = JOptionPane.showInputDialog(null, "Bite Matrikelnummer eingeben", "1234567890");
        int mactricNumber = Integer.parseInt(eingabe);
        User userTemp = new User(name, gender, birthday, mactricNumber);

        String damageType[] = {"Beamer", "Sitz", "Tisch","Sonstiges"};
        String categorie = (String) JOptionPane.showInputDialog(null, "Schaden wählen", "Schadensart", JOptionPane.PLAIN_MESSAGE, null, damageType, damageType[0]);
        if(categorie=="Sonstiges")
        {
            categorie=(String) JOptionPane.showInputDialog("Bitte Schadensart eingeben");
        }
        String description = JOptionPane.showInputDialog("Beschreibung des Schadens");
        String roomList[] = {"5.E.09", "9.1.2", "9.3.1"};
        String roomSelect = (String) JOptionPane.showInputDialog(null, "Raum auswählen", "Raumauswahl", JOptionPane.PLAIN_MESSAGE, null, roomList, roomList[0]);
        switch (roomSelect) {
            case "5.E.09":
                room = r5e9;
                break;
            case "9.1.2":
                room = r912;
                break;
            case "9.3.1":
                room = r931;
                break;
        }
        User userGot = userTemp;
        String date = (String) today.format(now.getTime());
        Damage damageTemp = new Damage(date, categorie, description, room, userGot);

        writeFile Test1 = new writeFile();
        Test1.writeData(userTemp, damageTemp);

        System.out.println("Name des Schadensmeldenden " + userTemp.getName());
        System.out.println("Geschlecht: " + userTemp.getGender());
        System.out.println("Geburtsdatum:" + userTemp.getBirthday());
        System.out.println("Matrikelnummer: " + userTemp.getMatricNumber());
        System.out.println("Datum der Meldung: " + damageTemp.getDate());
        System.out.println("Kategorie: " + damageTemp.getCategorie());
        System.out.println("Beschreibung: " + damageTemp.getDescription());
        System.out.println("Raum: " + damageTemp.getRoom().getHouseNr() + "." + damageTemp.getRoom().getStage() + "." + damageTemp.getRoom().getRoomNr());


    }
}
