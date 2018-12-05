package exo2;

import java.util.ArrayList;
import java.util.Scanner;

public class domotique {
	public static  ArrayList<Object> list = new ArrayList<Object>();
	public static void main(String[] args) {
		int a =1 ;
		int n;
		Scanner sc = new Scanner(System.in);
		do  {
			System.out.println("tapez votre ombre : ");
			n = sc.nextInt();
			factory c=(factory) factory.create(n);
			list.add(c);

			}while(n!=0);
		
	}

}
