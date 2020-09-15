public class FileItem extends Component 
{
    private float size;
     
    public FileItem(String name, float size) {
        super(name);
        this.size = size;
    }
 
    public float getSize() {
        return size;
    }
}