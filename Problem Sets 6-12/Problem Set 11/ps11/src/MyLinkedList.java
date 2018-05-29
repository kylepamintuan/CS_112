public class MyLinkedList<E>
{
	private Node<E> head = null;
	private int node_count = 0;
	
	public int indexOf(E element)
	{
		Node<E> cursor = head;
		int index = 0;
		
		while (cursor != null)
		{
			if(cursor.element.equals(element))
			{
				return index;
			}
			
			index++;
			cursor = cursor.next;
		}
		
		return -1;
	}
	
	public E get(int index)
	{
		Node<E> cursor = head;
		
		if (index < 0 || index >= size())
		{
			return null;
		}
		for(int counter = 0; counter < index; counter++)
		{
			cursor = cursor.next;
		}
		
		return cursor.element;
	}
	
	public boolean contains(E element)
	{
		for(int x = 0; x < node_count; x++)
		{
			if(element.equals(get(x)))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public int size()
	{
		Node<E> cursor = head;
		int count = 0;
		
		while (cursor != null)
		{
			count++;
			cursor = cursor.next;
		}
		
		return count;
	}
	
	public boolean isEmpty()
	{
		return node_count == 0;
	}
	
	public void add(E element)
	{
		//special case: if there isnt anything in the list...
		if(head == null)
		{
			//point the head to the new first element
			head = new Node<E>(element);
		}
		else//typical case: the list already has stuff in it
		{
			//create a cursor that starts at the beginning of the list
			// (think of the cursor a piece in Monopoly -- it keeps track
			//  of where you're at)
			Node<E> cursor = head;
			
			while (cursor.next != null)
			{
				//go to the next node
				cursor = cursor.next;
			}
			
			//we're at the end, so connect a new node
			cursor.next = new Node<E>(element);
		}
		
		node_count++;
	}
	
	public void add(int index, E element)
	{
		Node<E> cursor = head;
		Node<E> newNode = new Node<E>(element);
		
		for(int x = 0; x < index - 1; x++)
		{
			cursor = cursor.next;
		}
		if(index == 0)
		{
			head = newNode;
			newNode.next = cursor;
		}
		else
		{
			newNode.next = cursor.next;
			cursor.next = newNode;
		}
		
		node_count++;
	}
	
	public E set(int index, E element)
	{
		Node<E> cursor = head;
		E temp;
		
		for (int x = 0; x < index; x++)
		{
			cursor = cursor.next;
		}
		
		temp = cursor.element;
		cursor.element = element;
		return temp;
	}
	
	public boolean remove(E element)
	{
		Node<E> cursor = head;
		Node<E> prior = head;
		
		if (head.element.equals(element))
		{
			head = cursor.next;
			return true;
		}
		
		while(cursor != null)
		{
			if (cursor.element.equals(element))
			{
				prior.next = cursor.next;
				return true;
			}
			else
			{
				prior = cursor;
				cursor = cursor.next;
			}
		}
		
		if (cursor == null)
		{
			//wasn't found
			return false;
		}
		
		//was found
		return true;
	}
	
	public E remove(int index)
	{
		E result = null;
		
		if (index < 0 || index >= size())
		{
			return null;
		}
		
		Node<E> cursor = head;
		
		for (int x = 0; x < index; x++)
		{
			cursor = cursor.next;
		}
		
		result = cursor.element;
		cursor = head;
		
		for (int x = 0; x < index - 1; x++)
		{
			cursor = cursor.next;
		}
		
		if(index != 0)
		{
			cursor.next = cursor.next.next;
		}
		else
		{
			head = cursor.next;
		}
		
		return result;
	}
	
	
	private class Node<E> 
	{
		public E element;
		public Node <E> next = null;
		
		public Node(E element)
		{
			this.element = element;
		}
	}
	
	public static void main(String[] args)
	{
		MyLinkedList<String> t = new MyLinkedList<String>();
		 
		t.add("Santa Maria");
		t.add("Los Angeles");
		t.add("Ventura");
		t.add("Thousand Oaks");
		t.add(0, "Orcutt");
		t.add(5, "Pismo");
		t.add(3, "San Luis Obispo");
		t.set(1, "London");
		t.set(0, "San Diego");
		t.set(6, "Tokyo");
		t.add("Westlake");
		 
		t.remove("Santa Maria");
		System.out.println("was Tokyo found? " + t.remove("Tokyo"));
		t.remove("Westlake");
		System.out.println("was Dubai found? " + t.remove("Dubai"));
		t.remove("Pismo");
		 
		System.out.println("Remove index 5. It contained: " + t.remove(5));
		System.out.println("Remove index 0. It contained: " + t.remove(0));
		System.out.println("Remove index 2. It contained: " + t.remove(2));
		System.out.println("Here's what's left over");
		
		for (int x = 0; x < t.size(); x++)
		{
			System.out.println(t.get(x));
		}
		 
		System.out.println("--------");
		System.out.println("Cool!  I didn't crash!");
	}
}