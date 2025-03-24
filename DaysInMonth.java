import java.util.*;
public class DaysInMonth{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int month, year;
        month = sc.nextInt();
        year = sc.nextInt();
        sc.close();
        if(month == 1 || month ==3 || month == 5|| month == 7|| month ==8 || month == 10 || month == 12 ){
            System.out.println("Number of days is 31");
        }else if(month ==2){
            if((year% 400 ==0) || (year%4 == 0 && year%100 != 0)){
                System.out.println("Number of days is 29");
            }else{
                System.out.println("Number of days is 28");
            }
        }else{
            System.out.println("Number of dats is 30");
        }
    }
}
