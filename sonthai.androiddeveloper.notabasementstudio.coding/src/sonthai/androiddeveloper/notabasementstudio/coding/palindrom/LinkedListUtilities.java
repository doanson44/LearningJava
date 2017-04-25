package sonthai.androiddeveloper.notabasementstudio.coding.palindrom;

import java.util.LinkedList;

/**
 * Linked list
 */
public class LinkedListUtilities {
	public boolean isPalindrom(LinkedList<Character> linkedList) {
		if (linkedList == null || linkedList.isEmpty()) {
			return false;
		}

		int size = linkedList.size();
		if (size == 1) {
			return true;
		}

		boolean isPalindrom = false;

		return isPalindrom;
	}
}
