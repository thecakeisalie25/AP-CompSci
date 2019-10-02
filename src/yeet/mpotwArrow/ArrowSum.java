package yeet.mpotwArrow;

/**
 * ArrowSum
 */
public class ArrowSum {

	public static void main(String[] args) {
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				for (int c = 1; c < 10; c++) {
					for (int d = 1; d < 10; d++) {
						for (int e = 1; e < 10; e++) {
							for (int f = 1; f < 10; f++) {
								for (int g = 1; g < 10; g++) {
									for (int h = 1; h < 10; h++) {
										for (int i = 1; i < 10; i++) {
											System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + i);

										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static boolean testValid(int a, int b, int c, int d, int e, int f, int g, int h, int i) {
		if (a + b != 9)
			return false;
		if (a + c != 11)
			return false;
		if (d + b != 10)
			return false;
		if (e + b != 11)
			return false;
		if (e + c != 13)
			return false;
		if (c + f != 7)
			return false;
		if (e + g != 17)
			return false;
		if (g + h != 10)
			return false;
		if (h + i != 5)
			return false;
		return true;
	}
}