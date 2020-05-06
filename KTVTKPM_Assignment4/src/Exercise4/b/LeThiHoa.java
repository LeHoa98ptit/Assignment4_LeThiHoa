package Exercise4.b;

/**
 *
 * @author LeHoa
 */
public class LeThiHoa {
     public static void main(String[] args) { 
      Image image = new ProxyImage("test_10mb.jpg"); 
      image.display();  
      System.out.println(""); 
      image.display();   
   }
}
