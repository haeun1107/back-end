

public class AddItem extends Machine{
	public void function() {
		System.out.println();
		System.out.println("추가할 재고의 메뉴 번호를 입력하세요!");
		System.out.print("--> ");
		add_item_num = sc.nextInt();
		
		System.out.println();
		System.out.println("추가할 재고의 개수를 입력하세요!");
		System.out.print("--> ");
		add_item = sc.nextInt();
		
		item[add_item_num - 1] += add_item;
		System.out.println();
	}
}
