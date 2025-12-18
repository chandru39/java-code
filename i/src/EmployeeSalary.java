import java.util.*;
public class EmployeeSalary{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int basic=sc.nextInt();
int hra=sc.nextInt();
int allowance=sc.nextInt();
int salary=basic+hra+allowance;
System.out.println(salary);
}
}
