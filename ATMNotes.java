public class ATMNotes{
public static void main(String[] args){
int amount=2860;
int n2000=amount/2000;
amount%=2000;
int n500=amount/500;
amount%=500;
int n200=amount/200;
amount%=200;
int n100=amount/100;
System.out.println("2000="+n2000);
System.out.println("500="+n500);
System.out.println("200="+n200);
System.out.println("100="+n100);
}
}
