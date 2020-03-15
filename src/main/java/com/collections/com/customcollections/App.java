package com.collections.com.customcollections;

/**
 * Task-6 Epam PEP 
 * Custom Collections List
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CustomList<String> mylist= new CustomList<>();
    	mylist.add("Java");
    	mylist.add("List");
    	mylist.add("Collection");
    	mylist.add("ArrayList");
    	mylist.add("HashMap");
    	mylist.add("HashSet");
    	mylist.add("Scanner");
    	mylist.add("String");
    	mylist.add("Parse");
    	mylist.add("Applet");
    	mylist.print();
    	mylist.remove(2);
    	mylist.print();
    }
}
