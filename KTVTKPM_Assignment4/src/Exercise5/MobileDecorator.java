package Exercise5;

import java.util.List;

public class MobileDecorator implements MobileComponent{
    protected MobileComponent mbs;

    protected MobileDecorator(MobileComponent mbs){
        this.mbs = mbs;
    }

    @Override
    public List<Mobile> getAllMobile() {
        return mbs.getAllMobile();
    }

    @Override
    public void discount() {
        //discount;
    }
}
