public class Even {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<10;i+=2){
        sum=i+sum;
        }
        System.out.println("sum="+sum);
    }
}
