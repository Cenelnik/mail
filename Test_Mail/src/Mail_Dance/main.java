package Mail_Dance;

import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;


public class main {
	
	
	public static void main(String[] args) {
		
		//Thread mainThread = Thread.currentThread();
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		try{
		
			System.out.println(" How many songs will sound in the club? ");
			int songs = scan.nextInt();
		
			System.out.println(" How many boys in the club? ");
			int boys = scan.nextInt();
		
			System.out.println(" How many girls in the club? ");
			int girls = scan.nextInt();
		
			boy BOY[] = new boy[boys];
			girl GIRL[] = new girl[girls];
			
			
			//���������� ����� �������,  ������� �� ������� ������ � �������.
			//���� � ��������� ���� ����� ��������� ����� 1 �� �� ���� ��������� ���� �����
			//���� � ��������� ����� ��������� ����� 0,  �� ��������� ���� ����� �� �� ����� ��� �� �����
			System.out.println(" The guys went to the club. Now will is face control." + '\n' + " Ladies first, by one");

			
			if(girls == 0){
				System.out.println(" Girls do not have this :(  ");
			}else{
				
				for(int i = 0; i < girls; i++){
					
					GIRL[i] = new girl();
					System.out.println(" Security asked: You name girl? ");
					String  buf = scan.next();
					GIRL[i].Name = buf;
					GIRL[i].Rnb = rand.nextInt(2);
					GIRL[i].Electrohuse = rand.nextInt(2);
					GIRL[i].Pop_music = rand.nextInt(2);
				}
			}
			
			//���������� ����� ������, ��� �� ������� �� ������� ������ � �������.
			//���� � ��������� ���� ����� ��������� ����� 1 �� �� ���� ��������� ���� �����
			//���� � ��������� ����� ��������� ����� 0,  �� ��������� ���� ����� �� �� ����� ��� �� �����
			System.out.println();
			
		
			if(boys == 0){
				System.out.println(" Girls do not have this :(  ");
			}else{
				
				System.out.println("Next boys. By one");
				System.out.println();
				for(int i = 0; i < boys; i++){
				
					BOY[i] = new boy();
					System.out.println(" Security asked: You name boy? ");
					String  buf = scan.next();
					BOY[i].Name = buf;
					BOY[i].Rnb = rand.nextInt(2);
					BOY[i].Electrohuse = rand.nextInt(2);
					BOY[i].Pop_music = rand.nextInt(2);
				}
			}
		//��������� ����� �� �������, ��� ������������ �������� ������ �� 1 �� 3.
		//��� 1 ��� Rnb; 2 ��� - Electrohuse; � 3 ��� POP ������.
			int Stack_songs[] = new int[songs];
			for(int i = 0; i < songs; i++ ){
				
				Stack_songs[i] = 1 + rand.nextInt(3);
				//System.out.println(Stack_songs[i]);
			}
			
			System.out.println();
			System.out.println("  DISCO BEGAN!!!! ");
			System.out.println();
			
		//------------------------------------  ������ �������  --------------------------------------
			for(int i = 0; i < songs; i++ ){
				
				System.out.print(" NOW PLAY ....");
				
				switch(Stack_songs[i]){
				
				case 1:
					
					System.out.print(" RnB and hip hop");
					System.out.println();
					for(int j1 = 0; j1 < boys; j1++){
						
						if(BOY[j1].Rnb == 1){
							System.out.println(" " + BOY[j1].Name + "  - dance!");
						}
						else
						{
							System.out.println(" " + BOY[j1].Name + "  - drink vodka!!");
						}
						System.out.println();
					}
					
					for(int j1 = 0; j1 < girls; j1++){
						
						if(GIRL[j1].Rnb == 1){
							System.out.println(" " + GIRL[j1].Name + "  - dance!");
						}
						else
						{
							System.out.println(" " + GIRL[j1].Name + "  - drink vodka!!");
						}
						System.out.println();
					}
					break;
					
				case 2:
					System.out.print(" Electrohuse ");
					System.out.println();
					for(int j1 = 0; j1 < boys; j1++){
						
						if(BOY[j1].Electrohuse == 1){
							System.out.println(" " + BOY[j1].Name + "  - dance!");
						}
						else
						{
							System.out.println(" " + BOY[j1].Name + "  - drink vodka!!");
						}
						System.out.println();
					}
					
					for(int j1 = 0; j1 < girls; j1++){
						
						if(GIRL[j1].Electrohuse == 1){
							System.out.println(" " + GIRL[j1].Name + "  - dance!");
						}
						else
						{
							System.out.println(" " + GIRL[j1].Name + "  - drink vodka!!");
						}
						System.out.println();
					}
					break;
					
				case 3:
					System.out.print(" Pop_music");
					System.out.println();
					for(int j1 = 0; j1 < boys; j1++){
						
						if(BOY[j1].Pop_music == 1){
							System.out.println(" " + BOY[j1].Name + "  - dance!");
						}
						else
						{
							System.out.println(" " + BOY[j1].Name + "  - drink vodka!!");
						}
						System.out.println();
					}
					
					
					for(int j1 = 0; j1 < girls; j1++){
						
						if(GIRL[j1].Pop_music == 1){
							System.out.println(" " + GIRL[j1].Name + "  - dance!");
						}
						else
						{
							System.out.println(" " + GIRL[j1].Name + "  - drink vodka!!");
						}
						System.out.println();
					}
					break;
				
				}
				
				//����-��� � 5 ������ ����� ������� �� ������� ������
				Thread.sleep(5000);
				
			}
			
		scan.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
	}
	

}
