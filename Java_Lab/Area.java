public class Area {
    void areaa(int side){
        int a= side*side;
        System.out.println("Area of square"+a);
    }
    void areaa( int length,int breadth){
        int a= length*breadth;
        System.out.println("Area of rectangle"+a);
    }
    void areaa(double radius){
        double a=3.14*radius*radius;
        System.out.println("Area of circle "+a);
    }
    public static void main(String[] args) {
        Area obj= new Area();
        obj.areaa(4);
        obj.areaa(4,5);
        obj.areaa(2.5);
    }
}

