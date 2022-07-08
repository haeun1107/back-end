
public class ChangePrice extends Machine{
	public void function() {
		System.out.println();
		
		System.out.println("변경할 메뉴의 번호를 입력하세요!");
		
		for (int i = 0; i < cnt; i++) {
			System.out.println(i+1 + ". " + list[i] + " (가격 : " + price[i] + "원, " + "남은 재고 : " + item[i] + ")");
		}
		
		System.out.print("--> ");
		change_menu_num = sc.nextInt();
		System.out.println("변경할 메뉴의 가격을 입력하세요!");
		System.out.print("--> ");
		change_price = sc.nextInt();
		price[change_menu_num - 1] = change_price;
		
		System.out.println();
		}
}
