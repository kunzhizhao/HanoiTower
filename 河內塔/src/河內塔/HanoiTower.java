package �e����;

import java.util.Scanner;

public class HanoiTower {
	
	static void hanoiTower(int dishs, char a, char b, char c){
        if( dishs == 1) {
        	System.out.println("�L"+dishs+"�q"+ a + "����" + c);
        }else{
        	hanoiTower(dishs-1, a, c, b);
        	System.out.println("�L" + dishs + "�q" + a + "����" + c);
        	hanoiTower(dishs-1, b, a, c);
        }
    }
	
	public static void main(String[] args) {
		System.out.print("��J�L�l�ƶq�G");
		Scanner scan = new Scanner(System.in);
		int quantity = scan.nextInt();
		int dishs = quantity;//�L�l��
        hanoiTower(dishs,'A','B','C');
	}
}