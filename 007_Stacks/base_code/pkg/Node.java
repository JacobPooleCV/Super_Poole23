package pkg;
import java.util.Scanner;
import java.util.Random;


public class Node {
	Node next;
	int data;

	public Node(int data) {
		next = null;
		this.data = data;
	}
	public void setNext(Node next){
		this.next = next;
	}
	public int getData(){
		return data;
	}	
	public Node getNext(){
		return next;
	}
}
