import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Marathon {
public static void main(String[] args) {
	String choice="";
	ArrayList<Float> arr=new ArrayList<Float>();
	Scanner sc= new Scanner(System.in);
	ArrayList<Float> arr1=new ArrayList<Float>();
	while(!choice.equals("q")){
	    choice = sc.next();

	    if(!choice.equals("q") && choice!="0"){
			arr.add(Float.parseFloat(choice));
		}
		if(choice=="0"){
			System.out.println("Invalid Input");
		}
	}
	for(float i:arr) {
		if(i!=41.25) {
			arr1.add(i);
		}
	}
	Collections.reverse(arr1);
	System.out.println(arr1);
}
}
