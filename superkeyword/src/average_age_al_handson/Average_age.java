package average_age_al_handson;

import java.util.*;

public class Average_age{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean agevalue = true;
		System.out.println("Enter the total :");
		int number = scanner.nextInt();
		
		if(number<2) {
			System.out.println("Hey Human! enter above 2 count ");
		}
		
		else {
				System.out.println(String.format("Enter %d numbers", number));
				int [] age = new int[number];
				for(int i=0;i<number;i++)
				{
					int a = scanner.nextInt();
					if(a<20||a>40) {
						agevalue=false;
						break;
					}
					age[i]=a;
				}
				
				if(agevalue) {
					
					double average = calculate(age);
					System.out.println(String.format("THe average age is :%.2f ",average));
					
					
				}
				
				else {
					System.out.println("sorry wrong for");
				}
			}
			
			
		}

	private static double calculate(int[] age) {
		// TODO Auto-generated method stub
		  double sum =0.0;
		for(int i=0;i<age.length;i++) {
			sum +=age[i];
		}
		
	double	average = sum/(double)age.length;
		
		return average;
	}
		
	}
