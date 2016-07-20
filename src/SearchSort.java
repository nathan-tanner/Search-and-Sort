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
       
       int counter = output.size() - 1;
       while(counter > 0){
    	   for(int i = 0; i < counter; i++){
    		   if(output.get(i).compareTo(output.get(i+1)) >= 1){
    			   String oldLeft = output.get(i);
    			   String oldRight = output.get(i + 1); 
    			   
    			   output.remove(i);
    			   output.add(i,oldRight);
    			   output.remove(i+1);
    			   output.add(i+1,oldLeft);
    		   }
    		   counter = counter - 1;
    	   }
       }
       
       String[] outputArray = output.toArray(new String[output.size()]);
       for(int i = 0; i < outputArray.length; i++){
    	   arr[i] = outputArray[i];
       }
       
    }
    

    // takes a sorted array and returns the index of the desired string or -1 if not found
    public static int binarySearch(String[] arr, String lookfor) {
        //call binarySearchHelper
    	
    	int location = binarySearchHelper(arr, 0, arr.length + 1, lookfor);
    	//if(location < 0)
    		//throw OutOfBoundsException;
        return location;
    }
        
    private static int binarySearchHelper(String[] arr, int lo, int hi, String lookfor) {
        //this should be done recursively.  Assume that the passed in array is sorted.  Look at the 
        //midpoint of the array and see if the string "lookfor" comes before or after the midpoint.
        //Then recursively call binarySearchHelper with the part of the array that you think holds "lookfor"
        //What are your base cases?  Handle the case where the string is not found.
        //Part of the trick here is you will be  maintaining the original array.   You are just moving the pointers "lo" and "hi"
        //so that the function looks at a specific part of the array.  This way you will be able to return the index of "lookfor".

    	int location = -1;
    	int workingLength = hi - lo;
    	
    	if(workingLength == 0){
    		return -1;
    	}
    	else if(workingLength == 1 || workingLength == 2){
    		if(arr[workingLength].compareTo(lookfor) == 0){
    			return 1;
    		}
    		else
    			return 0;
    	}
    	int workingLocation;
    	
    	if(workingLength % 2 == 0){
    		workingLocation = (workingLength / 2) - 1;
    	}
    	else
    		workingLocation = workingLength / 2;
    	
    	
    	if(arr[workingLocation].compareTo(lookfor) > 0){
    		location = binarySearchHelper(arr, lo, workingLocation , lookfor);
    	}
    	else if(arr[workingLocation].compareTo(lookfor) < 0){
    		location = binarySearchHelper(arr, workingLocation, hi, lookfor);
    	}
    	else if(arr[workingLocation].compareTo(lookfor) == 0)
    		location = workingLocation;
    	
    	return location;
    }

    public static String[] mergeSort(String[] arr) {
        //check and make sure array has more than one item. 
        //split the array into two equal parts
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
        
        System.out.println(binarySearch(information,"Count Dooku"));
        
        //test binarySearch with a name that is not in the array.
        
        //test merge sort with a fresh, unsorted copy, of the array 
        //you made from the original data.
        

    }
}
