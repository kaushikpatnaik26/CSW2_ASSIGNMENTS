package Q3;

public class Point {
    private int X,Y;

    public Point(int X,int Y){
        this.X=X;
        this.Y=Y;
    }

    public Point(Point another){
        this(another.X, another.Y);
    }

    public int getX(){
        return this.X;
    }
    public void setX(int X){
        this.X=X;
    }

    public int getY(){
        return Y;
    }
    public void setY(int Y){
        this.Y=Y;
    }

    public static void main(String[] args) {
        Point p1=new Point(2,5);
        Point p2=new Point(p1);

        System.out.println("P1: "+p1.getX()+","+p1.getY());
        System.out.println("P2: "+p2.getX()+","+p2.getY());

        p1.setX(4);
        p1.setY(6);

        System.out.println("P1: "+p1.getX()+","+p1.getY());
        System.out.println("P2: "+p2.getX()+","+p2.getY());
    }
}