// made by 박영찬

package com.ict.day16;

import java.util.HashSet;

public class Ex09 {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		for(int i = 1; i <= 5; i++) {
			lotto.clear();
			System.out.print("Lotto Set"+i + ":");
			while(lotto.size()<7) {
				int su = (int)(Math.random()*45)+1;
				if(lotto.add(su)) {
					if(lotto.size() == 6) {
						System.out.print(lotto);
					}else if(lotto.size() == 7){
						System.out.println(" + Bonus: "+su);
					}
				}//if lotto.add(su)
				
			}//while
			
		}//for
	}//main
}//Ex09
