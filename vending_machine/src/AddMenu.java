
public class AddMenu extends Machine{
	public void function() {
		System.out.println();
		System.out.println("추가할 메뉴를 입력하세요!");
		System.out.print("--> ");
		add_menu = sc.next();
		list[cnt] = add_menu;
		
		System.out.println();
		System.out.println("메뉴의 가격을 입력하세요!");
		System.out.print("--> ");
		add_price = sc.nextInt();
		price[cnt] = add_price;
		
		System.out.println();
		System.out.println("재고의 개수를 입력하세요!");
		System.out.print("--> ");
		add_item = sc.nextInt();
		item[cnt] = add_item;
		
		cnt++;
		System.out.println();
		}
}
