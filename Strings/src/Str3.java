import java.util.*;
public class Str3 {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String next="";
        System.out.println("Enter the string");       
        String abc= sc.nextLine();
        int lenght =abc.length();
        if(lenght<=1){
            next=abc;
           
        }
        else{
            for (int i=0;i<lenght;i++){
                next=next+abc.charAt(0)+abc.charAt(1);
            }
        }
        System.out.print(next);
    sc.close();

    }
}
