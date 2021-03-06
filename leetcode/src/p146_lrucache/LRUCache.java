package p146_lrucache;

import java.util.HashMap;

public class LRUCache {
	HashMap<Integer, Node> cache;
	int capacity;
	int size;
	Node head;
	Node tail;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		cache = new HashMap<Integer, Node>(capacity);
		size = 0;
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.next = tail;
		head.pre = null;
		tail.pre = head;
		tail.next = null;
	}
	
	public void deleteNode(Node node) {
		node.next.pre = node.pre;
		node.pre.next = node.next;
	}
	
	public void addToHead(Node node) {
		node.next = head.next;
		head.next.pre = node;
		node.pre = head;
		head.next = node;
	}
	
	public int get(int key) {
		if (cache.containsKey(key)) {
			Node node = cache.get(key);
			int value = node.value;
			deleteNode(node);
			addToHead(node);
			return value;
		} else {
			return -1;
		}
	}
	
	public void set(int key, int value) {
		if (cache.containsKey(key)) {
			Node node = cache.get(key);
			node.value = value;
			deleteNode(node);
			addToHead(node);
		} else {
			Node node = new Node(key, value);
			cache.put(key, node);
			if (size < capacity) {
				size++;
				addToHead(node);
			} else {
				cache.remove(tail.pre.key);
				deleteNode(tail.pre);
				addToHead(node);
			}
		}		
	}
	
	public class Node {
		int key;
		int value;
		Node pre;
		Node next;
		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

}
