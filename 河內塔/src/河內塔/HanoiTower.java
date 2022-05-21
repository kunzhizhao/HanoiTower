package 河內塔;

import java.util.Scanner;

public class HanoiTower {
	
	static void hanoiTower(int dishs, char a, char b, char c){
        if( dishs == 1) {
        	System.out.println("盤"+dishs+"從"+ a + "移到" + c);
        }else{
        	hanoiTower(dishs-1, a, c, b);
        	System.out.println("盤" + dishs + "從" + a + "移到" + c);
        	hanoiTower(dishs-1, b, a, c);
        }
    }
	
	public static void main(String[] args) {
		System.out.print("輸入盤子數量：");
		Scanner scan = new Scanner(System.in);
		int quantity = scan.nextInt();
		int dishs = quantity;//盤子數
        hanoiTower(dishs,'A','B','C');
	}
}