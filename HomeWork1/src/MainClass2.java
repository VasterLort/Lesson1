import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainClass2 {
	public static void main(String[] args) {
		int[] mass = new int[100];
		for(int i = 0; i < mass.length; i++) {
			mass[i] = (int)(Math.random()*1000);
		}
		
		for(int i = 0; i < mass.length; i++) {
			System.out.println(mass[i]);
		}
		System.out.println("");
		
		//8
		int max_even = mass[0];
		int max_odd = mass[0];
		int min_even = mass[0];
		int min_odd = mass[0];
		
		System.out.println("8 - Найти максимальный и минимальный элемент среди чётных/нечётных элементов массива задания 3");
		for(int i = 0; i < mass.length; i++) {
			if(mass[i] % 2 == 0) {
				if(mass[i] > max_even)max_even = mass[i];
				if(mass[i] < min_even)min_even = mass[i];
			}else if(mass[i] % 2 != 0) {
				if(mass[i] > max_odd)max_odd = mass[i];
				if(mass[i] < min_odd)min_odd = mass[i];
			}
		}
		System.out.println("Максимально четное число: " + max_even);
		System.out.println("Минимальное четное число: " + min_even);
		System.out.println("Максимально нечетное число: " + max_odd);
		System.out.println("Минимальное нечетное число: " + min_odd);
		System.out.println(" ");
		
		//9
		String name_and_surname = "ВакарьАндрей";
		char[] mass_char = new char[12];
		
		System.out.println("9 - Сохранить в массив типа char свою фамилию и имя (размер массива не должен превышать количество символов в фамилии пробел имени (запрещено использовать метод toCharArray класса String, однако можно использовать метод charAt() - т.е. массив char нужно заполнить посимвольно! )");
		for(int i = 0; i < mass_char.length; i++) {
			mass_char[i] = name_and_surname.charAt(i);
		}
		
		for(int i = 0; i < mass_char.length; i++) {
			System.out.println(mass_char[i]);
		}	
		System.out.println(" ");
		
		/*//10
		System.out.println("10 - Реализовать считывание ФИО для задачи 9 с клавиатуры (можно использовать класс Scanner). Добавить в массив из задания 9 пробел и отчество.");
		Scanner in = new Scanner(System.in);
		String all_name = in.nextLine();
		char[] mass_char1 = new char[25];
		
		for(int i = 0; i < mass_char1.length; i++) {
			mass_char1[i] = all_name.charAt(i);
		}
		
		for(int i = 0; i < mass_char1.length; i++) {
			System.out.println(mass_char1[i]);
		}	
		System.out.println(" ");
		*/
		//11
		System.out.println("11 - Удалить из массива (1е задание) все элементы, кратные 3");
		int[] mass2 = new int[10];
		int[] mass2_copy = new int[10];
		
		for(int i = 1; i < mass2.length; i++) {
			mass2[i] = i;
		}
		
		for(int i = 0; i < mass2.length; i++) {
			if(mass2[i] % 3 == 0) {
				for(int j = i ; j < mass2.length-1; j++) {
					mass2[j] = mass2[j+1];
				}
				mass2[mass2.length - 1] = 0;
			}
		}
		
		for(int i = 0; i < mass2.length - 1; i++) {
			System.out.println(mass2[i]);
		}
		
		System.out.println("");
		
		//13
		System.out.println("13 - Отсортировать массив по возрастанию / убыванию следующими способами:");
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*1000);
		}
		
		System.out.println("Метод пузырька");
		for(int i = arr.length-1 ; i > 0 ; i--){
		       for(int j = 0 ; j < i ; j++){
		           if( arr[j] > arr[j+1] ){
		               int tmp = arr[j];
		               arr[j] = arr[j+1];
		               arr[j+1] = tmp;
		            }
		        }
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("");
		
		for(int i = arr.length-1 ; i > 0 ; i--){
		       for(int j = 0 ; j < i ; j++){
		           if( arr[j] < arr[j+1] ){
		               int tmp = arr[j];
		               arr[j] = arr[j+1];
		               arr[j+1] = tmp;
		            }
		        }
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("");
		
		System.out.println("Сортировка выбором");
		for (int i = 0; i < arr.length; i++) {
	        int min = arr[i];
	        int min_i = i; 
	        
	        for (int j = i+1; j < arr.length; j++) {
	            if (arr[j] < min) {
	                min = arr[j];
	                min_i = j;
	            }
	        }
	        if (i != min_i) {
	            int tmp = arr[i];
	            arr[i] = arr[min_i];
	            arr[min_i] = tmp;
	        }
	     }
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("");
		
		for (int i = 0; i < arr.length; i++) {
	        int max = arr[i];
	        int max_i = i; 
	        
	        for (int j = i+1; j < arr.length; j++) {
	            if (arr[j] > max) {
	            	max = arr[j];
	            	max_i = j;
	            }
	        }
	        if (i != max_i) {
	            int tmp = arr[i];
	            arr[i] = arr[max_i];
	            arr[max_i] = tmp;
	        }
	     }
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("");
		
		System.out.println("Быстрая сортировка");
		Arrays.sort(arr);
		for(int i = 0; i <  arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("");
		
		Integer arr_revers[] = new Integer[10];
		for(int i = 0; i <  arr_revers.length; i++) {
			arr_revers[i] =  (int)(Math.random() * 100);
		}
		Arrays.sort(arr_revers, Collections.reverseOrder());
		for(int i = 0; i <  arr_revers.length; i++) {
			System.out.print(arr_revers[i] + "  ");
		}
		System.out.println("");
		
		System.out.println("Метод вставок");
		int counter=0;
		for(int i=1;i<arr.length;i++){
			for(int j=i; j>0 && arr[j-1]>arr[j];j--){
				counter++;
				int tmp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=tmp;
			}
		}
	    
	    for(int i = 0; i <  arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	    System.out.println("");
	  
	    counter=0;
		for(int i=1;i<arr.length;i++){
			for(int j=i; j>0 && arr[j-1]<arr[j];j--){
				counter++;
				int tmp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=tmp;
			}
		}
	    
	    for(int i = 0; i <  arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	    System.out.println("");
	    
	    System.out.println("14 - Найти в массиве и вывести на экран все элементы в заданном диапазоне (например от 20 до 23):");
	    int a=3; int b=7;
	    for (int i=0;i<arr.length;i++) {
	      if (i>a && i<b) {
	         System.out.print(arr[i] + " ");
	      }
	    }
	}
}
