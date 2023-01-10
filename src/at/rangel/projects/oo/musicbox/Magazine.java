package at.rangel.projects.oo.musicbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Magazine {
    private List<Record> records;
    private Record loadedRecord;
    private int maxAmountOfRecords;

    public Magazine() {
        this.records = new ArrayList<>();
        this.maxAmountOfRecords = 50;
    }

    public void addRecord(Record record) {
        int amountOfRecords = getRecords().size();
        if (amountOfRecords > maxAmountOfRecords - 1) {
            System.out.println("There are already " + maxAmountOfRecords + " plates in the music box!");
            return;
        } else if (amountOfRecords == maxAmountOfRecords - 1) {
            System.out.println("Maximum amount of plates has been reached!");
        }
        this.records.add(record);
    }

    public void removeRecord(Record record) {
        this.records.remove(record);
    }

    public int getSumOfMusicTime() {
        int sum = 0;
        for (Record record : records) {
            List<Title> titles = record.getTitles();
            for (Title title : titles) {
                sum += title.getLength();
            }
        }
        return sum;
    }

    public List<Record> findRecord(String titleName) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().toLowerCase(Locale.ROOT).contains(titleName)) {
                foundRecords.add(record);
            }
        }
        return foundRecords;
    }

    public void loadRecord(Record record) {
        this.loadedRecord = record;
        System.out.println("Loaded record " + record.getName());
    }

    public void play(int num) {
        if (this.loadedRecord == null) {
            System.out.println("Nothing is loaded.");
        } else {
            if (num >= this.loadedRecord.getTitles().size() || num < 0) {
                System.out.println("The given number of record des not exist.");
                return;
            }
            Title title = this.loadedRecord.getTitles().get(num);
            System.out.println("Playing: " + title.getName());
        }
    }

    public List<Record> getRecords() {
        return records;
    }

    public Record getLoadedRecord() {
        return loadedRecord;
    }

    public int getMaxAmountOfRecords() {
        return maxAmountOfRecords;
    }
}
