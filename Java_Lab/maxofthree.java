public class maxofthree {
    int a,b,c;
    maxofthree(int x, int y, int z){
        a=x;
        b=y;
        c=z;
    }
    void findmax(){
        int max=a;{
            if(b>max){
                max=b;
            }
            if(c>max){
                max=c;
            }
            System.out.println("The maximum number is:"+max);
        }
    }
    public static void main(String[]args){
        maxofthree obj= new maxofthree(10,20,30);
        obj.findmax();
    }
}
