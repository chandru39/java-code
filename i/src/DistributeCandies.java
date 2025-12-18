import java.util.*;
public class DistributeCandies{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int candies=sc.nextInt();
int students=sc.nextInt();
int each=candies/students;
int remain=candies%students;
System.out.println(each);
System.out.println(remain);
}
}
