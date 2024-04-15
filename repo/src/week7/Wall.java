package week7;

public class Wall {
    double width;
    double height;
    public static void main(String[] args) {
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
    Wall(){

    }
    Wall(double width,double height){
        if(width<0){
            this.width=0;
        }
        else if(height<0){
            this.height=0;
        }
        else if(width<0 && height<0){
            this.width=0;
            this.height=0;
        }
        else
            this.width=width;
            this.height=height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double d) {
        if (d < 0) {
            width = 0;
        } else {
            width = d;
        }

    }
    public void setHeight(double d1){
        if (d1 < 0) {
            height = 0;
        } else {
            height = d1;
        }
    }
    public double getArea(){
        return width*height;
    }
}

