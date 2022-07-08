import java.util.Scanner;

public class Machine {
	
	static String[] list = new String[100];
	static int[] price = new int[100];
	static int[] item = new int[100];
	static int cnt = 4;
	static String add_menu, change_menu;
	static int add_price, add_item_num, add_item, change_menu_num, change_price;
	static Scanner sc = new Scanner(System.in);
	
	public void function() {
		System.out.print("자판기 기능 구현");
		
	}
	
	public static void start() {
		list[0] = "coffee";
		price[0] = 700;
		item[0] = 10;
		list[1] = "powerade";
		price[1] = 1300;
		item[1] = 12;
		list[2] = "coke";
		price[2] = 1000;
		item[2] = 6;
		list[3] = "sprite";
		price[3] = 1000;
		item[3] = 4;
	}
	
	public static void main(String[] args) {
		start();
		Machine addmenu = new AddMenu();
		Machine additem = new AddItem();
		Machine changemenu = new ChangeMenu();
		Machine changeprice = new ChangePrice();
		Machine print = new Print();
		
		while(true) {
			int choice;
			System.out.println("원하시는 기능의 번호를 선택하세요! (끝내려면 0을 누르세요)");
			System.out.println("1. 메뉴 추가");
			System.out.println("2. 재고 추가");
			System.out.println("3. 메뉴 변경");
			System.out.println("4. 가격 변경");
			System.out.println("5. 메뉴 출력");
			System.out.print("--> ");
			
			choice = sc.nextInt();
			if (choice == 0) break;
			
			switch(choice) {
			case 1:
				addmenu.function();
				break;
			case 2:
				additem.function();
				break;
			case 3:
				changemenu.function();
				break;
			case 4:
				changeprice.function();
				break;
			case 5:
				print.function();
			}
			
		}
	}
}