import java.util.ArrayList;
import java.util.List;

public class FolderItem extends Component 
{
    protected List<Component> list = new ArrayList<>(); 
    
    public FolderItem(String name) {
        super(name);
    }
    
    public void add(Component g) {
        list.add(g);
    }
 
    public void remove(Component g) {
        list.remove(g);
    }
 
    public Component getChild(int i) {
        return (Component) list.get(i);
    }
    
    public float getSize() {
        float totalSize = 0;
        for (Component f : list) {
            totalSize = totalSize + f.getSize();
        }
        return totalSize;
    }

    public void list(int depth) {
      for (Component f : list) {
            f.list(depth + 1);
        }        
    }
}