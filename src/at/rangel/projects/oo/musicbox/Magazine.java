package at.rangel.projects.oo.musicbox;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private List<Record> records;
    private Record loadedRecord;

    public Magazine() {
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record) {
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

    public List<Record> findRecord(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().contains(name)) {
                foundRecords.add(record);
            }
        }
        return foundRecords;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void loadRecord(Record record) {
        this.loadedRecord = record;
        System.out.println("Loaded record " + record.getName());
    }

    public void play(int num) {
        num = num - 1;
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
}
