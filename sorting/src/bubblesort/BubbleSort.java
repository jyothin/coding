package bubblesort;

import java.util.ArrayList;

import models.Data;
import myarraylist.MyArrayList;

public class BubbleSort {
	
	public BubbleSort() {
	}

	public void sort(ArrayList<Data> al) {
		
		int size = al.size();

		for (int i=0; i<size; i++) {
			for (int j=0; j<size-i-1; j++) {
				if (al.get(j).data > al.get(j+1).data) {
					MyArrayList.swap(al, j, j+1);
					MyArrayList.display(al);
				}
			}
		}
	
	}


}
