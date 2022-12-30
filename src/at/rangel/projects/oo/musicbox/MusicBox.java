package at.rangel.projects.oo.musicbox;

import java.util.Scanner;

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
    }

    public void run() {
        System.out.println("Welcome to the music box!");
        while (true) {
            System.out.println("1 - Show all records, 2 - choose a record, 3 - play");

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
                    System.out.println("Enter the number of the record you would like to load.");
                    int numberOfRecord = scanner.nextInt() - 1;
                    if (numberOfRecord >= this.magazine.getRecords().size() || numberOfRecord < 0) {
                        System.out.println("The existing number of record does not exist.");
                        break;
                    }
                    magazine.loadRecord(magazine.getRecords().get(numberOfRecord));
                    break;
                default:
                    break;
            }
        }
    }
}
