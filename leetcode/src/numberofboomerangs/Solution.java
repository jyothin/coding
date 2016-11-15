package numberofboomerangs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Solution {
	public int numberOfBoomerangs(int[][] points) {
		if (points.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i=0; i<points.length; i++) {
			int[] p = points[i];
			HashMap<Integer, Integer> hm = new HashMap<>();
			for (int j=0; j<points.length; j++) {
				if (i == j) {
					continue;
				}
				Integer dis = getDistance(p, points[j]);
				Integer c = 0;
				if (!hm.containsKey(dis)) {
					hm.put(dis, c);
				}
				c = hm.get(dis);
				c++;
				hm.put(dis, c);
			}
			
			/*for (Integer k: hm.keySet()) {
				System.out.print(i+":"+k+":"+hm.get(k)+"\n");
			}*/

			for ( Integer k : hm.keySet()) {
				int c = hm.get(k);
				count += (c*(c-1));
			}
		}
		return count;
	}
	
	public int getDistance(int[] i, int[] j) {
		//System.out.println("("+i[0]+", "+i[1]+"), ("+j[0]+", "+j[1]+")");
		int xDis = i[0] - j[0];
		int yDis = i[1] - j[1];
		return (xDis*xDis + yDis*yDis);
	}

}
