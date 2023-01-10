package at.rangel.projects.oo.musicbox;

import java.util.*;

public class MusicBox {
    private Magazine magazine;
    private Scanner scanner;

    public MusicBox() {
        this.magazine = new Magazine();
        this.scanner = new Scanner(System.in);
        fillUpBox();
    }

    public void fillUpBox() {
        Record r1 = new Record("Thriller");
        r1.addTitle(new Title("one", 186));
        r1.addTitle(new Title("two", 242));
        r1.addTitle(new Title("three", 165));
        magazine.addRecord(r1);

        Record r2 = new Record("Après ski");
        r2.addTitle(new Title("hudl", 320));
        r2.addTitle(new Title("dudl", 273));
        r2.addTitle(new Title("pudl", 155));
        magazine.addRecord(r2);

        Random random = new Random();

        for (int i = 1; i <= 49; i++) {
            Record rn = new Record("Test Record # " + i);
            int randomAmountOfTracks = random.nextInt(3, 20);
            for (int j = 1; j <= randomAmountOfTracks; j++) {
                int randomTitleLength = random.nextInt(100, 300);
                rn.addTitle(new Title("Test Title #" + j, randomTitleLength));
            }
            magazine.addRecord(rn);
        }
    }

    public void run() {
        System.out.println("Welcome to the music box!");
        while (true) {
            System.out.println("1 - Show all records, 2 - Show all titles of current record, 3 - Choose a record\n" +
                    "4 - Play a title, 5 - Search for a record, 6 - Get total playing time");
            int selection = this.scanner.nextInt();
            switch (selection) {
                case 1:
                    int i = 1;
                    for (Record record : magazine.getRecords()) {
                        System.out.println(i + ". " + record.getName());
                        i += 1;
                    }
                    break;
                case 2:
                    Record currentRecord = magazine.getLoadedRecord();
                    if (currentRecord == null) {
                        System.out.println("There is no loaded record!");
                        break;
                    }
                    List<Title> titlesOfCurrentRecord = currentRecord.getTitles();
                    i = 1;
                    for (Title title : titlesOfCurrentRecord) {
                        System.out.println(i + ". " + title.getName() + ", " + title.getLength());
                        i += 1;
                    }
                    break;
                case 3:
                    System.out.println("Enter the number of the record you would like to load.");
                    int numberOfRecord = scanner.nextInt() - 1;
                    if (numberOfRecord >= this.magazine.getRecords().size() || numberOfRecord < 0) {
                        System.out.println("The existing number of record does not exist.");
                        break;
                    }
                    magazine.loadRecord(magazine.getRecords().get(numberOfRecord));
                    break;
                case 4:
                    System.out.println("Write down the number of track from the current record, that you would like to play.");
                    int numberOfTitle = scanner.nextInt() - 1;
                    magazine.play(numberOfTitle);
                    break;
                case 5:
                    System.out.println("Enter the name of the title you are searching for.");
                    String titleName = scanner.next().toLowerCase(Locale.ROOT);
                    List<Record> foundRecords = magazine.findRecord(titleName);
                    for (Record record : foundRecords) {
                        System.out.println(record.getName());
                    }
                    break;
                case 6:
                    System.out.println("Total playing time of all records in seconds: " + magazine.getSumOfMusicTime());
                    break;
                default:
                    System.out.println("Invalid number for a task!");
                    break;
            }
        }
    }
}
