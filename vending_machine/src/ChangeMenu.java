
public class ChangeMenu extends Machine{
	public void function() {
		System.out.println();
		System.out.println("변경할 메뉴의 번호를 입력하세요!");
		System.out.print("--> ");
		change_menu_num = sc.nextInt();
		
		System.out.println();
		System.out.println("변경할 메뉴를 입력하세요!");
		System.out.print("--> ");
		change_menu = sc.next();
		
		list[change_menu_num - 1] = change_menu;
		System.out.println();
		}
}
