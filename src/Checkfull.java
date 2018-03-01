
public class Checkfull {

	public static boolean isBoardFull() {
		char ary[][] = new char[3][3];
		if (ary[0][0] == '1' || ary[0][1] == '2' || ary[0][2] == '3' || ary[1][0] == '4' || ary[1][1] == '5'
				|| ary[1][2] == '6' || ary[2][0] == '7' || ary[2][1] == '8' || ary[2][2] == '9') {
			System.out.println("Boxes are empty, Game is not yet finished");
			return false;
		} else {
			System.out.println("Boxes are full. No one has Won. Game is over");
			return true;
		}
	}
}
