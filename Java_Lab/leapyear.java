public class leapyear {
    int year;
    leapyear(int y){
        year=y;
    }
    void checkleapyear(){
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("is leap year");
        }
        else{
            System.out.println("Not leap year");
        }
    }

public static void main(String[]args){
    leapyear obj=new leapyear(2026);
    obj.checkleapyear();
    }
}