package Exeicise2.b;
 // @author LeHoa
public class FileLeaf implements FileComponent{
    private String name;
    private long size;
 
    public FileLeaf(String name, long size) {
        super();
        this.name = name;
        this.size = size;
    }
 
    @Override
    public long totalSize() {
        return size;
    }
 
    @Override
    public void showProperty() {
        System.out.println("\t" + name + "\t" + size + "]");
    }
}
