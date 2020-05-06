package Exercise3.b;
// @author LeHoa
public class LeThiHoa {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new EnglishAdaptee());
        client.send("Xin chào, rất vui được gặp bạn");
    }
}
