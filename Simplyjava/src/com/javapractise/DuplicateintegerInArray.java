package com.javapractise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DuplicateintegerInArray {

	public static void main(String str[]) {
		int nums[] = { 5, 5, 5, 5, 5, 1, 2, 2, 3, 3, 7, 7, 9, 9, 8, 6, 8, 6 };
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int res = 0;

		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int num : nums) {
			Integer count = map.get(num);
			if (count == null) {
				map.put(num, 1);

			} else {
				map.put(num, ++count);
			}
		}

		for (int x : map.keySet()) {
			// System.out.println(map.get(i));
			if (map.get(x) == 1) {

				res = x;
				System.out.println(res);
			}
		}
		return res;
	}
}

/*
 * Map<Integer, Integer> storemap=new HashMap<Integer, Integer>(); for(int
 * value:values) { Integer count=storemap.get(value); if(count==null) {
 * storemap.put(value, 1);
 * 
 * } else { storemap.put(value, ++count);
 * 
 * }
 * 
 * }
 * 
 * Set<Entry<Integer, Integer>>entryset=storemap.entrySet();
 * for(Entry<Integer,Integer> entry:entryset) { if(entry.getValue()==1) {
 * System.out.println("duplicatgrge value is " + entry.getKey()); } }
 * 
 * }
 */
// }
