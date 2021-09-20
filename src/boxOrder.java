import java.util.ArrayList;
import java.util.List;

public class boxOrder {
        private List<Box> list = new ArrayList<Box>();

        public void OrderIn(Box box){
            list.add(box);
        }

        public void OrderOut(){
            for(Box box : list){
                box.execute();
            }
            list.clear();
        }
}
