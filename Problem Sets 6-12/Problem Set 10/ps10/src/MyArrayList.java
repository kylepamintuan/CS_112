
public class MyArrayList<E>
{
	@SuppressWarnings("unchecked")
	private E[] data_store = (E[])new Object[4];
	private int value_of_element = 0;
	
	//This method doubles the size of data store
	//Notice: this method is private because we don't want the Demo
	//programmers to call it.
	private void resize()
	{
		@SuppressWarnings("unchecked")
		E[] bigger_space = (E[])new Object[data_store.length *2];
		
		for(int x =0; x < value_of_element; x++)
		{
			bigger_space[x] = data_store[x];
		}
		//the old array is garbage collection
		data_store = bigger_space;
	}
	
	//Adds an elements to the end of this collection.
	//Returns true if the collection changed (will always change
	//since this is a list).
	public void add(E element)
	{
		if(value_of_element == data_store.length)
		{
			//if data_store is full make it bigger
			resize();
		}
		data_store[value_of_element] = element;
		value_of_element++;
		
	}
	
	public int indexOf(E element)
	{		
		//looks for the element in the index
		for(int x = 0; data_store.length - 1 >= x; x++)
		{
			if(element.equals(data_store[x]))
			{
				return  x;
			}	
		}
		//if the element wasn't found in the index return -1
		return -1;
				
	}
	
	//Returns true if this collection contains needle
	//Returns false otherwise
	public boolean contains(Object needle)
	{
		for(int x = 0; x < value_of_element; x++)
		{
			if(needle.equals(get(x)))
			{
				return true;
			}
		}
		return false;
	}
	
	//checks if its element
	public boolean isEmpty()
	{
		return value_of_element == 0;
	}

	//gets the index stored in the data
	public E get(int index)
	{
		return data_store[index];
	}
	
	//gets the value of the element
	public int size()
	{
		return value_of_element;
	}
	
	//add an element at a given index location
	public void add(int index, E element)
	{
		if(value_of_element == data_store.length)
		{
			resize();
		}
		for (int x = value_of_element; x > index; x--)
		{
			data_store[x] = data_store[x - 1];
		}
		data_store[index] = element;
		value_of_element++;
	}
	
	//sets the element at specific index location
	public E set(int index, E element)
	{
		//gets stored data at given index
		//writes the new element in the new data store index
		//then returns the stored data in the original "old_element"
		E old_element = get(index);
		data_store[index] = element;
		
		return old_element;
	}
	
	public boolean remove(E element)
	{
		//checks if the elements not at -1
		if(indexOf(element) != -1)
		{
			//loops to check for the element at a specific index location
			//removes the object element
			for (int x = indexOf(element); x <= value_of_element - 2; x++) {
				data_store[x] = data_store[x + 1];
			}
			data_store[value_of_element - 1] = null;
			value_of_element--;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public E remove(int index)
	{
		//gets the stored data and stores it into the new temp
		//and removes whatever was stored in the temp object variable
		// now returns the removed temp variable.
		E temp = get(index);
		remove(temp);
		return temp;
	}
}
	
