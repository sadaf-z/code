public class swap {
    int a,b;
    swap(int x,int y){
        a=x;
        b=y;
    }
    void swapnumber(){
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping a="+a);
        System.out.println("After swapping b="+b);
    }
    public static void main(String[]args){
        swap obj=new swap(12,14);
        obj.swapnumber();
    }
}
