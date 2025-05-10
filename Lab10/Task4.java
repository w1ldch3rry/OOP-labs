interface Readable {
    void read();
}

interface Writable {
    void write();
}

class FileDocument implements Readable, Writable {
    public void read() {
        System.out.println("Reading from file");
    }

    public void write() {
        System.out.println("Writing to file");
    }
}

public class Task4 {
    public static void main(String[] args) {
        FileDocument doc = new FileDocument();
        doc.read();
        doc.write();
    }
}
