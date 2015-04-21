package examples.betterProgrammer;

import java.util.*;

public class BetterProgrammerTask {

	// Please do not change this interface
	interface ListNode {
		int getItem();

		ListNode getNext();

		void setNext(ListNode next);
	}

	public static class ListNodeImpl implements ListNode {
		int value;
		ListNode next;

		public ListNodeImpl(int value) {
			this.value = value;
		}

		@Override
		public int getItem() {
			// TODO Auto-generated method stub
			return value;
		}

		@Override
		public ListNode getNext() {
			return next;
		}

		@Override
		public void setNext(ListNode next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "ListNodeImpl [value=" + value + ", next=" + next + "]";
		}

	}

	/**
	 * @param node
	 * @return
	 */
	public static ListNode reverse(ListNode node) {
		/*
		 * Please implement this method to reverse a given linked list.
		 */
		ListNode previous = null;
		ListNode next = node;
		while (next != null) {
			ListNode temp = next.getNext();
			next.setNext(previous);
			previous = next;
			next = temp;
		}
		return next;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode L4 = new ListNodeImpl(4);
		ListNode L3 = new ListNodeImpl(3);
		ListNode L2 = new ListNodeImpl(2);
		ListNode L1 = new ListNodeImpl(1);
		L1.setNext(L2);
		L2.setNext(L3);
		L3.setNext(L4);
		System.out.println(L1);
		System.out.println(L4);
		reverse(L1);
		System.out.println(L1);
		System.out.println(L4);
	}

}
