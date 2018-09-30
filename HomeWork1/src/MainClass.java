import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x = 9;
		int y = 0;
		
		
		/*1
		while(x>0){
			System.out.println(x);
			x--;
		}
		System.out.println("");
		2
		for(int i = 1; i<10; i++){
			if(i%2 == 0){
				System.out.println(i);
			}
		}
		System.out.println("");
		3
		x = 5;
		if(x == 1){System.out.println("Январь");}
		else if(x == 2){System.out.println("Февраль");}
		else if(x == 3){System.out.println("Март");}
		else if(x == 4){System.out.println("Апрель");}
		else if(x == 5){System.out.println("Май");}
		else if(x == 6){System.out.println("Июнь");}
		else if(x == 7){System.out.println("Июль");}
		else if(x == 8){System.out.println("Август");}
		else if(x == 9){System.out.println("Сентябрь");}
		else if(x == 10){System.out.println("Октябрь");}
		else if(x == 11){System.out.println("Ноябрь");}
		else if(x == 12){System.out.println("Декабрь");}
		System.out.println("");
		4
		for(int i = 1; i<100; i++){
			if(i%2 == 0){
				System.out.println(i);
			}
		}
		System.out.println("");
		5
		for(int i = 20; i<200; i++){
			y +=i;
		}
		System.out.println(y);
		System.out.println("");
		*/
		/*6
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		try{
			number = Integer.parseInt(read.readLine());
		}catch(IOException e){e.printStackTrace();}
		
		int count = 1;
		int i = 1;
		while(i<=number){
			count *= i;
			i++;
		}
		System.out.println(count);
		System.out.println("");
		*/
		
		/*7
		int num = 0;
		try{
			num = Integer.parseInt(read.readLine());
		}catch(IOException e){e.printStackTrace();}
		
		int cou = 0;
		while(y<=num){
			if(y%2 == 0){
				cou += y;
			}
			y++;
		}
		System.out.println(cou);
		System.out.println("");
		*/
		
		int[] mas = new int[5];
		for(int i = 0; i<mas.length; i++){
			mas[i]=i;
		}
		//1
		for(int i = 0; i<mas.length; i++){
			System.out.println(mas[i]);
		}
		System.out.println("");
		//2
		for(int i = mas.length-1; i>=0; i--){
			System.out.println(mas[i]);
		}
		System.out.println("");
		
		int[] mas1 = new int[100];
		//3
		for(int i = 0; i<mas1.length; i++){
			mas1[i]= (int)(Math.random() * 100);
		}
		for(int i = 0; i<mas1.length; i++){
			System.out.println(mas1[i]);
		}
		System.out.println("");
		//4
		for(int i = 0; i<mas1.length; i++){
			if(mas1[i]%2==0){
				System.out.println(mas1[i]);
			}
		}
		System.out.println("");
		//5
		int j = 0;
		int t = 0;
		
		for(int i = 0; i<mas1.length; i++){
			if(mas1[i]%2!=0){
				j++;
			}
		}
		int[] mas2 = new int[j];
		for(int i = 0; i<mas1.length; i++){
			if(mas1[i]%2!=0){
				mas2[t]=mas1[i];
				t++;
			}
		}
		
		int negativ = mas2[0];
		for(int i = 1; i<mas2.length; i++){
			negativ -= i;
		}
		System.out.println(negativ);
		System.out.println("");
		
		//6
		int pos = 0;
		int neg = 0;
		for(int i = 0; i<mas1.length; i++){
			if(mas1[i]%2==0){
				pos++;
			}
			else if(mas1[i]%2!=0){
				neg++;
			}
		}
		System.out.println("Количесвто нечетных " + neg);
		System.out.println("Количесвто четных " + pos);
		System.out.println(" ");
		
		//7
		int max = 0;
		int min = mas1[0];
		for(int i = 0; i<mas1.length; i++){
			if(max < mas1[i]){
				max = mas1[i];
			}
			if(min > mas1[i]){
				min = mas1[i];
			}
		}
		System.out.println("Максимальное " + max);
		System.out.println("Минимальное " + min);
		System.out.println(" ");
		
		
	}

}
