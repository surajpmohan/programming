package org.bn.programming;

<<<<<<< HEAD
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ArrayList<E> implements List<E> {
	private int SIZE = 10;
	public E getType() {
		return type;
	}


	public void setType(E type) {
		this.type = type;
	}

	private E type;
	private E [] array;
	private int length=0;
	public ArrayList() {
		super();
		array = (E[]) new Object[SIZE];
	}

	
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true){
			list.add(r.nextInt(999),r.nextInt(999));
			if(list.size()>=1000){
				boolean isFull = true;
				for(int i=0; i<1000; i++){
					if(list.get(i)==null){
						isFull = false;
					}
				}
				if(isFull){
					break;
				}
			}
		}
		for(int j=0; j<1000; j++){
			if(list.get(j)==null){
				System.out.println(j + " is null");
			}
		}
	}

	@Override
	public boolean add(E arg0) {
		if(length>=SIZE){
			resize();
		}
		array[length++]=arg0;
		return true;
	}
	
	private void resize() {
		SIZE = SIZE*2;
		E[] tempArray = (E[]) new Object[SIZE];
		for(int j=0; j<array.length; j++){
			tempArray[j]=array[j];
		}
		array = tempArray;
	}


	@Override
	public void add(int arg0, E arg1) {
		if(length>=SIZE){
			resize();
		}
		if(arg0 == length){
			array[length++]=arg1;
		}
		else{
			while(arg0>=SIZE){
				resize();
			}
			for(int j=length-1; j>=arg0; j--){
				array[j+1]=array[j];
			}
			length++;
			array[arg0]=arg1;
		}
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends E> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int arg0) {
		return array[arg0];
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E set(int arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return length;
=======
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ArrayList<E> implements List<E> {
	private int SIZE = 10;
	public E getType() {
		return type;
	}


	public void setType(E type) {
		this.type = type;
	}

	private E type;
	private E [] array;
	private int i=0;
	public ArrayList() {
		super();
		array = (E[]) new Object[SIZE];
	}

	
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int j=0; j<1000; j++){
			list.add(r.nextInt(999),j);
		}
		for(int j=0; j<1000; j++){
			System.out.println(list.get(j));
		}
	}

	@Override
	public boolean add(E arg0) {
		if(i>=SIZE){
			resize();
		}
		array[i++]=arg0;
		return true;
	}

	private void resize() {
		SIZE = SIZE*2;
		E[] tempArray = (E[]) new Object[SIZE];
		for(int j=0; j<array.length; j++){
			tempArray[j]=array[j];
		}
		array = tempArray;
		System.out.println("Size: " + array.length);
	}


	@Override
	public void add(int arg0, E arg1) {
		if(i>=SIZE){
			resize();
		}
		if(arg0 == i){
			array[i++]=arg1;
		}
		else{
			System.out.println("arg0="+arg0);
			System.out.println("SIZE="+SIZE);
			while(arg0>=SIZE){
				resize();
			}
			System.out.println("SIZE="+SIZE);
			for(int j=i-1; j>=arg0; j--){
				array[i+i]=array[i];
			}
			i++;
			array[arg0]=arg1;
		}
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends E> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int arg0) {
		return array[arg0];
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E set(int arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
>>>>>>> branch 'master' of https://github.com/surajpmohan/programming.git
	}

	@Override
	public List<E> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
