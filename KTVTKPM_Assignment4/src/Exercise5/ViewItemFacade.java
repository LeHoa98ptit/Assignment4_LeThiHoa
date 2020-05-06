package Exercise5;

/**
 *
 * @author LeHoa
 */
public class ViewItemFacade {
    
    public static final ViewItemFacade INSTANCE = new ViewItemFacade();
    private BookView bookview;
    private LaptopView laptopview;
    private MobileView mobileview;

    public ViewItemFacade() {
        bookview = new BookView();
        laptopview = new LaptopView();
        mobileview = new MobileView();
    }
    
    public static ViewItemFacade getInstance() {
        return INSTANCE;
    }
    public void bookV(){
        bookview.display();
    }
    
    public void laptopV(){
        laptopview.display();
    }
    
    public void mobileV(){
        mobileview.display();
    }
    
    
    
}
