package com.onebill.arraylist.working;

public class Working {

	private Object[] array;
	private int size = 10;
	int position;
	
	public Working() {
		array = new Object[size];
	}
	
	public Working(int size) {
		this.size = size;
		array = new Object[size];
	}
	
	public void add(Object obj) {
		if(position >= size) {
			increaseCapacity();
		}
		array[position] = obj;
		position++;
		
	}
	
	private void increaseCapacity() {
		this.size = ((size * 3) / 2) + 1;
		Object[] temp = new Object[size];
		
		for(int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}
	
	public void display() {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
}
