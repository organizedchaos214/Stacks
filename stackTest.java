/**
 * 
 * @author Shane Anderson
 * 
 * stackTest.java is a test of the stack implementation using push/pop features:
 * Features: stacks, and exception handling..
 */

import java.util.EmptyStackException;
import java.util.Stack;

public class stackTest 
	{
	
	//pushToStack handles adding items to the stack: 
	public static void pushToStack (Stack <Integer> stack, int a)
		{
		System.out.println ("Pushing: " + a + " onto the stack");
		
		//push input, integer a onto the stack:
		stack.push(new Integer (a));
		
		System.out.println("Stack is: " + stack);
		}
	
	
	
	//popFromStack handles removing items from the stack:
	public static void popFromStack (Stack<Integer> stack)
		{
		System.out.println("Popping item off the top of the stack");
		
		stack.pop( );
		
		System.out.println("Stack is: " + stack);
		}

	//main method, and argument handling:	
	public static void main(String[ ] args) 
		{
		try 
			{
			Stack <Integer> stack = new Stack <Integer> ( );
	
			//recursively populate the stack with ints from 0 to 25. 
			//change this to populate stack with different values.
			for (int i = 0; i <= 25; i++)
				{
				pushToStack (stack, i);
				}
			
			System.out.println ("Stack is: " + stack);
			
			//pop items from the stack until the stack is empty:
			while (stack.isEmpty ( ) == false)
				{
				popFromStack (stack);
				}
			}
		
		catch (EmptyStackException e)
			{
			System.out.println("Warning: the Stack is empty!");
			}
		}
	}	
