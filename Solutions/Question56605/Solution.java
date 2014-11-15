import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Solution {

	/**
	 * n represent the number of point. x[] and y[] store the points coordinates
	 */
	public int n = 6000;
	public double[] x = new double[n];
	public double[] y = new double[n];

	/**
	 * @return the number of points in a line which passed the most number of
	 *         points
	 */
	public int getMostNumberOfPoints() {
		int answer = 0;
		for (int i = 0; i < n; i++) {
			HashMap<Double, Integer> num = new HashMap<Double, Integer>();
			for (int j = 0; j < n; j++) {
				if (i != j) {
					double d = 0;
					if (x[i] == x[j])
						d = Double.MAX_VALUE;
					else
						d = (y[j] - y[i]) / (x[j] - x[i]);
					if (num.containsKey(d)) {
						num.put(d, num.get(d) + 1);
					} else {
						num.put(d, 2);
					}
				}
			}

			int tmp = 0;
			Iterator<Entry<Double, Integer>> iter = num.entrySet().iterator();
			while (iter.hasNext()) {
				Entry<Double, Integer> entry = iter.next();
				if ((int) entry.getValue() > tmp)
					tmp = (int) entry.getValue();
			}
			if (tmp > answer)
				answer = tmp;
		}
		return answer;
	}

	public void run() {
		n = 11;
		x[0] = 1;
		y[0] = 1;
		x[1] = 2;
		y[1] = 2;
		x[2] = 2;
		y[2] = 3;
		x[3] = 5;
		y[3] = 2;
		x[4] = 3;
		y[4] = 3;
		x[5] = 1;
		y[5] = 5;
		x[6] = 4;
		y[6] = 4;
		x[7] = 2;
		y[7] = 5;
		x[8] = 6;
		y[8] = 4;
		x[9] = 1;
		y[9] = 3;
		x[10] = 5;
		y[10] = 5;
		// answer is 5
		System.out.println(getMostNumberOfPoints());
	}

	public static void main(String args[]) {
		new Solution().run();
	}

}
