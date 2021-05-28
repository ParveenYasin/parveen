public class Triangle extends Shape{
	private int border=20;
	private Color color;
	public Triangle(Color color) {
		this.color=color;
	}
	@Override
	public void drawShape() {
		System.out.print("This Triangle colored with ");
		color.color();
		System.out.print(" with "+border+" inch border\n");
	}

	@Override
	public void modifyBorder(int times) {
		System.out.println("Now we are changing the border length "+times);
		border*=times;
	}

}