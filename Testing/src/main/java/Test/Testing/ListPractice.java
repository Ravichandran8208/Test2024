package Test.Testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;



public class ListPractice {
	public static void main(String[] args) {


		List <String> list= new ArrayList<String>();
		list.add("India");
		list.add("USA");
		list.add("England");
		list.add("pak");
		list.add("Russia");
		list.add("India");
		list.add(null);
		/*
		 * System.out.println(list.hashCode()); System.out.println(list); for (String
		 * ele : list) { System.out.println(ele); }
		 */
 
		/*
		 * for (int i=0;i<=list.size()-1;i++){ System.out.println("loop"+list.get(i)); }
		 */
		/*
		 * ListIterator<String> iterator =list.listIterator();
		 * 
		 * while (iterator.hasNext()) { System.out.println(iterator.next()); } while
		 * (iterator.hasPrevious()) { System.out.println(iterator.previous()); }
		 */
		/*
		 * Iterator<String> iterate1= list.iterator(); while (iterate1.hasNext()) {
		 * System.out.println(iterate1.next()); }
		 */
   LinkedList <String> linkedlist=new LinkedList<String>();
   linkedlist.add("India");
   linkedlist.add("USA");
   linkedlist.add("England");
   linkedlist.add("pak");
   linkedlist.add("Russia");
   linkedlist.add("India");
   linkedlist.add(null);
	/*
	 * System.out.println(linkedlist);
	 * 
	 * 
	 * ListIterator<String>Iterator=linkedlist.listIterator();
	 * while(Iterator.hasNext()) { System.out.println(Iterator.next()); }
	 * while(Iterator.hasPrevious()) { System.out.println(Iterator.previous()); }
	 */
   
   TreeSet <String>set=new TreeSet <String>();
   set.add("India");
   set.add("USA");
   set.add("England");
   set.add("pak");
   set.add("Russia");
   set.add("India");
//   set.add(null);
   System.out.println(set);
   
   Iterator<String>iterator=set.iterator();
   while(iterator.hasNext()) {
	   System.out.println(iterator.next());
   }
   Iterator<String>iterator1=set.descendingIterator();
   while(iterator1.hasNext()) {
	   System.out.println(iterator1.next());
   }
}
}
