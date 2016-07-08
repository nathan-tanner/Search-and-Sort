import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class SearchSort {
    //explained in readme.  one solution uses a boolean to check if a swap has been completed or not.  
    //This does not have to be recursive.  Otherwise this method is explained in the readme.
    public static void bubbleSort(String[] arr) {
    	
       ArrayList<String> output = new ArrayList<String>(); 
       
       for(int i = 0; i < arr.length; i++){
    	   output.add(arr[i]);
       }
       
       for(int i = output.size(); i > 0; i--){
    	   for(int counter = 0; counter > i - 1; counter++){
    		   int sorted = output.get(counter).compareTo(output.get(counter + 1));
    		   if(sorted == 1){
    			   String oldLeft = output.get(counter);
    			   String oldRight = output.get(counter + 1);
    			   
    			   output.set(counter, oldRight);
    			   output.set(counter + 1, oldLeft);
    		   }
    	   }
       }
       
       String[] outputArray = output.toArray(new String[0]);
       System.out.println(Arrays.toString(outputArray));
   
    }
    

    // takes a sorted array and returns the index of the desired string or -1 if not found
    public static int binarySearch(String[] arr, String lookfor) {
        //call binarySearchHelper
        return binarySearchHelper(//what goes in here?);
    }
        
    private static int binarySearchHelper(String[] arr, int lo, int hi, String lookfor) {
        //this should be done recursively.  Assume that the passed in array is sorted.  Look at the 
        //midpoint of the array and see if the string "lookfor" comes before or after the midpoint.
        //Then recursively call binarySearchHelper with the part of the array that you think holds "lookfor"
        //What are your base cases?  Handle the case where the string is not found.
        //Part of the trick here is you will be  maintaining the original array.   You are just moving the pointers "lo" and "hi"
        //so that the function looks at a specific part of the array.  This way you will be able to return the index of "lookfor".
        return null;
    }

    public static String[] mergeSort(String[] arr) {
        //check and make sure array has more than one item. 
        //split the array into two eqal parts
        //recursevely call mergeSort with both of your new arrays
        //use merge to put the two arrays back together.
        
        //This is not easy, don't be sureprised if you are frustrated
        //Feel free to look up some solutions on line.
        //you can do it.
        
    }

    private static String[] merge(String[] a, String[] b) {
        //takes two sorted string arrays and makes them one sorted string array. 
        //ie: a = t and b = z results in an array of t,z
        //ie: a = a,z,f and b = b,c,h results in an array of a,b,c,f,h,z
        
    }
    public static void quickSort(String[] arr) {
        // be brave, use google
    }

    public static void main(String[] args) throws FileNotFoundException {
        //First make this compile.
        
        //read in a file from args[0] and store in an array
        //write bubble sort and test, by printing our your new array
        //before and after calling bubbleSort
    	
    	File importedFile = new File(args[0]);
    	Scanner importFile = new Scanner(importedFile);
    	ArrayList<String> temp = new ArrayList<String>();
    	
    	while(importFile.hasNextLine())
    		temp.add(importFile.nextLine());
    	
    	String[] information = new String[temp.size()];
    	information = temp.toArray(new String[0]);
    	System.out.println(Arrays.toString(information));
    	
        bubbleSort(information);
        
        System.out.println(Arrays.toString(information));
    	
        //Use binarySearch to search for Luke Skywalker, I found him at index 16.
        //test binarySearch with a name that is not in the array.
        
        //test merge sort with a fresh, unsorted copy, of the array 
        //you made from the original data.
        

    }
}
