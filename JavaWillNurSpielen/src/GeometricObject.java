import java.util.IllegalFormatWidthException;
import java.awt.Color;

public class GeometricObject {
    Vertex pos;
    double width;
    double height;
    public Color color;

public GeometricObject(Vertex pos, double width, double height, Color color){
    this.pos = pos;
    this.width = width;
    this.height = height;
    this.color =color;

    if (width<0){
        this.width = -width;
    }

    if (height<0){
        this.height = -height;
    }

    if(pos.x<0){
        this.pos.x = -pos.x;
    }

    if(pos.y<0){
        this.pos.y = -pos.y;
    }
}

public GeometricObject(Vertex pos, double width, double height){
    this(pos, width, height, new Color(47, 0,256));
}

public GeometricObject(double x, double y, double width, double height){
    this(new Vertex(x, y), width, height);
}

public GeometricObject(double width, double height){
    this(0, 0, width, height);
}

public GeometricObject(double length){
    this(0,0,length,length);
}

public GeometricObject(){
    this(0, 0, 10, 10);
}


    public Vertex getPos() {
        return pos;
    }

    public void setPos(Vertex pos) {
        this.pos = pos;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString(){
    return "width= "+width+" height= "+height+" pos= "+pos;
    }

    public double circumference(){return (height+width)*2;}

    public double area(){return height*width;}

    public boolean contains(Vertex v){
    return v.x >= this.pos.x && this.pos.x + width >= v.x
        && v.y >= this.pos.y && this.pos.y + width >= v.y;
    }

    public boolean isLargerThan(GeometricObject g){
    return g.area() < this.area();
    }

    public void moveTo(Vertex v){this.pos=v;}

    public void moveTo(double x, double y){moveTo(new Vertex(x,y));}

    public void move(Vertex v){moveTo(pos.addMult(v));}

    public boolean equals(Object thatObject) {
        if(thatObject instanceof GeometricObject){
            GeometricObject that = (GeometricObject) thatObject;
            return this.height==that.height && this.width == that.width && this.pos.equals(that.pos);
        }
        return false;
    }

    public boolean contains(GeometricObject g){
        return g.pos.x<=pos.x+width && g.pos.x+g.width>=pos.x && g.pos.y<=pos.y+height && g.pos.y+g.height>=pos.y;
    }




}