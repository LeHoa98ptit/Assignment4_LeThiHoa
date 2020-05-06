package Exeicise2.b;
// @author LeHoa

import java.util.Arrays;
import java.util.List;

public class LeThiHoa {
    public static void main(String[] args) {
        FileComponent file1 = new FileLeaf("Exercise 1", 10);
        FileComponent file2 = new FileLeaf("Exercise 2", 5);
        FileComponent file3 = new FileLeaf("Exercise 3", 12);
 
        List<FileComponent> files = Arrays.asList(file1, file2, file3);
        FileComponent folder = new FolderComposite(files);
        folder.showProperty();
        System.out.println("Total Size: " + folder.totalSize());
    }
}
