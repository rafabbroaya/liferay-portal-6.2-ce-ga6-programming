package _8.mock.exam;

public interface Interface extends Jumpable, Movable {
}

interface Jumpable {

}

interface Movable {
	public static final int metersMove = 0;

	public abstract void moveRight();

}