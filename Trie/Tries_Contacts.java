package Trie;

/* https://www.hackerrank.com/challenges/ctci-contacts/problem
We're going to make our own Contacts application! The application must perform two types of operations:
add name, where name is a string denoting a contact name. This must store name as a new contact in the application.
find partial, where partial is a string that denotes a partial name to search the application for. It must count the number 
of contacts starting with partial and print the count on a new line.
Given n sequential add and find operations, perform each operation in order.
 */

import java.util.HashMap;
public class Tries_Contacts {
	class Node {
		char data;
		boolean isTerminal;
		HashMap<Character, Node> child = new HashMap<>();
		int count = 1;
	}
	private Node root;
	public Tries_Contacts() {
		Node nn = new Node();
		nn.data = '*';
		root = nn;
	}
	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.count++;
			} else {
				Node n = new Node();
				n.data = ch;
				curr.child.put(ch, n);
				curr = n;
			}
		}
		curr.isTerminal = true;
	}
	public int find(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}
		}
		return curr.count;
	}
	public static void main(String[] args) {
		Tries_Contacts t = new Tries_Contacts();
		t.insert("hacker");
		t.insert("hackerrrr");
		System.out.println(t.find("hac"));
	}
}





