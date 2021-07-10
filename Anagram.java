import java.io.*;
import java.util.*;

public class Anagram {


	    static boolean theAnagram(char[] str1, char[] str2)
	    {

	        int num1 = str1.length;
	        int num2 = str2.length;


	        if (num1 != num2)
	            return false;


	        Arrays.sort(str1);
	        Arrays.sort(str2);


	        for (int i = 0; i < num1; i++)
	            if (str1[i] != str2[i])

	               return false;

	        return true;
	    }

	    public static void main(String args[])
	    {

	        char str1[] = { 'a', 'b', 'c', 'd' };
	        char str2[] = { 'd', 'b', 'c', 'a' };


	        if (theAnagram(str1, str2))

	            System.out.println("Two strings are"  + " anagram ");

	        else

	            System.out.println("Two strings are not"  + " anagram ");
	    }
	}
