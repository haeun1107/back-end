
public class Print extends Machine{
	public void function() {
		System.out.println();
		for (int i = 0; i < cnt; i++) {
			System.out.println(i+1 + ". " + list[i] + " (가격 : " + price[i] + "원, " + "남은 재고 : " + item[i] + ")");
		}
		System.out.println();
	}
}
