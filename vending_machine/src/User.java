
public class User extends Machine{
	public void function() {
		System.out.println("구매할 메뉴의 번호를 입력하세요!");
		System.out.print("--> ");
		buy_num = sc.nextInt();
		
		if (buy_num <= cnt) {
			if (money >= price[buy_num - 1]) {
				change = money - price[buy_num - 1];
				profit += price[buy_num - 1];
				item[buy_num - 1] -= 1;
				System.out.println();
				System.out.println(list[buy_num - 1] + "를 구매하셨어요!");
				System.out.println("++++++++구매가 완료되었습니다++++++++");
				System.out.println("잔돈 : " + change + "원");
				System.out.println();
			}
			else {
				System.out.println();
				System.out.println("--------" + (price[buy_num - 1] - money) + "원이 부족합니다--------");
				System.out.println();
			}
		}
		else System.out.println("~~~~~~~~올바른 번호를 선택해주세요~~~~~~~~");
	}
}