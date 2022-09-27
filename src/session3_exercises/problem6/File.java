package session3_exercises.problem6;

import java.util.Date;

public class File {
    private String name;
    private Date creationDate;
    private int fileSize;

    public File(String name, Date creationDate, int fileSize) {
        this.name = name;
        this.creationDate = creationDate;
        this.fileSize = fileSize;
    }
}
