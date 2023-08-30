package com.aurionpro.test;

import com.aurionpro.model.CustomLinkedList;

public class CustomLinkedListTest {
	
	    public static void main(String[] args) {
	        CustomLinkedList list = new CustomLinkedList();
	        list.add(10);
	        list.add(20);
	        list.remove(10);
	        list.add(30);
	        list.remove(40);
	        list.display();

	        for (int item : list) {
	            System.out.println(item);
	        }
	    }
	}



