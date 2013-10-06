package freemap.data;

public class IdentityProjection extends SimpleProjection implements Projection {

    public Point project (Point p)
    {
        return new Point (p.x, p.y, p.z);
    }
    
    public  Point unproject (Point p)
    {
        return new Point (p.x, p.y, p.z);
    }
    
    public String getID()
    {
        return "epsg:4326";
    }
}
