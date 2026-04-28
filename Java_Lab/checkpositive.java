public class checkpositive{
    int num;
    checkpositive(int x){
        num=x;
    }
    void check(){
        if (num>0){
            System.out.println("The number is positive");
        }
        else if(num<0){
            System.out.println("The number is negative");
        }
    }
    public static void main(String[] args) {
        checkpositive obj= new checkpositive(-3);
        obj.check();
    }
}