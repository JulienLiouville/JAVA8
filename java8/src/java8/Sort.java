package java8;

import java.util.Arrays;

public class Sort {

	String[] test = {"one", "two", "three", "four"};
	
	public Sort()
	{
		super();
	}
	
	public void testLambdaArray()
	{
		//res: one,two,three,four
		for(String str:test)System.out.println(str);
		/*
		 * Here we are using the method define in  java.util.Arrays called sort
		 * the first argument is the array that we want to sort 
		 * After we have the definition of the the used methods :
		 * in the class string we want the method "compareToIgnoreCase"
		 * this is the form ClassName::MethodsName
		 */
		Arrays.sort(test, String::compareToIgnoreCase);
		System.out.println("after Sort:");
		//res:four,one,three,two
		for(String str:test)System.out.println(str);
	}
	
}
