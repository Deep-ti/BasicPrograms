package couponcollector;

public class CouponCollector {
	public int couponCollector(int n) {
		boolean[] isCollected = new boolean[n];
		int distinct = 0;
		int count = 0;
		while(distinct < n ) {
			int value = (int)(Math.random()*n);
			count++;
			if(!isCollected[value]) {
				distinct++;
				isCollected[value] = true;
			}
		}
		return count;
	}

}
