package bubblesort;

import java.util.ArrayList;

import models.Data;
import myarraylist.MyArrayList;


public class Main {

	public static void main(String[] args) {

		// Linked list to ArrayList
		ArrayList<Data> al = new ArrayList<Data>();
		
		Data data = new Data(1000);
		al.add(data);
		data = new Data(10);
		al.add(data);
		data = new Data(-1);
		al.add(data);
		data = new Data(20);
		al.add(data);
		data = new Data(110);
		al.add(data);
		data = new Data(-10);
		al.add(data);
		System.out.println(MyArrayList.display(al));
		
		BubbleSort bs = new BubbleSort();
		bs.sort(al);
		
		System.out.println(MyArrayList.display(al));
		
	}

}
