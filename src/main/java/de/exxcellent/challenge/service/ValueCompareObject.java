package de.exxcellent.challenge.service;

import java.util.Arrays;
import java.util.List;

import de.exxcellent.challenge.pojo.BasicObject;

public class ValueCompareObject {
	
	public Object getSmallestDiff(List<BasicObject> list){
		int[] diff = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			diff[i] = list.get(i).getDiff();
		}
		Arrays.sort(diff);
		for (int i = 0; i < diff.length; i++) {
			if(list.get(i).getDiff() == diff[0]){
				return list.get(i);
			}
		}
		return null;
	}

}
