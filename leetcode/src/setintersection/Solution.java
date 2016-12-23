package setintersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	private String[] cleanTitles;
	
	public Solution(String[] titles) {
		cleanTitles = titles;
	}
	
	public String setIntersection(String rawTitle) {
		List<String> rawTitleComponents = new ArrayList<String>();
		
		String[] components = rawTitle.split(",| ");
		for (int j=0; j<components.length; j++) {
			rawTitleComponents.add(components[j]);
		}
		
		int index = 0;
		int max = 0;
		
		for (int i=0; i<cleanTitles.length; i++) {
			String cleanTitle = cleanTitles[i];
			String[] cleanTitleComponents = new String[]{};
			cleanTitleComponents = cleanTitle.split(" ");
			Set<String> cleanTitleSet = new HashSet<String>(Arrays.asList(cleanTitleComponents));
			Set<String> rawTitleSet = new HashSet<String>(rawTitleComponents);
			if (rawTitleSet.containsAll(cleanTitleSet) && max < cleanTitleSet.size()) {
				max = cleanTitleSet.size();
				index = i;
			}
		}
		
		return cleanTitles[index];
	}

}
