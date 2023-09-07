package xxx.JAVAHOMEWORK6;

public class Calculator {
	public double powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("x 和 y 同時為零無法計算");
		} else if (y < 0 && x == 0) {
			throw new CalException("y 負數，x 的 y 次方结果不為");
		}
		return Math.pow(x, y);
	}
}