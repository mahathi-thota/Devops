import java.util.Scanner;
public class Armstrong{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int count=0;
        for (int i=n;i>0;i/=10){
            count++;
        }
        int sum=0;
        for(int i=n;i>0;i/=10){
            int digit=i%10;
            sum=sum + (int)Math.pow(digit,count);
        }
        // Check Armstrong
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }

}