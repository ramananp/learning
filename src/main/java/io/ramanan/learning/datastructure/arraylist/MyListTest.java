package io.ramanan.learning.datastructure.arraylist;

public class MyListTest {

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        
        //Adding the elements
        myList.add("Ramanan");
        myList.add("Mike");
        myList.add("Tom");
        myList.add("Rich");
        myList.add("Mark");
        myList.add("Srini");

        //Get an element elements
        System.out.println(myList.get(2));

        //Get the last element
        System.out.println(myList.get(5));

        //Get the list size
        System.out.println(myList.size());

        //Check the index out of bound exception
        try {
            System.out.println(myList.get(6));
        } catch(Exception e){
            System.err.println(e.getClass() + " -> " + e.getMessage());
        }
    }
    


}