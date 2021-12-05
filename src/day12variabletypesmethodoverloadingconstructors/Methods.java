package day12variabletypesmethodoverloadingconstructors;

public class Methods {
	 /*
	  
	  1) methods are written outside of the curly braces of the main method, 
	  yet inside out the "outermost" curly braces. 
	  They can be located above or below the main.
	  
	  2) The definition of the method consists of two parts. 
	  The first line of the definition includes the name of the method, i.e. greet. 
	  On the left side of the name are the keywords public static void. 
	  Beneath the line containing the name of the method is a code block surrounded by curly brackets, 
	  inside of which is the code of the method — the commands that are executed when the method is called.
	  The only thing our method greet does is write a line of text on the screen.
	  
	    
	    
	    
	    
	    public static void greet() {
        System.out.println("Greetings from the method world!");
        }
	  
	  
	  
	    3) Calling a custom method is simple: 
	    write the name of the methods followed by a set of parentheses and the semicolon. 
	    
	    greet();
	    
	    4) The order of execution is worth noticing. 
	    The execution of the program happens by executing the lines of the main method (main) 
	    in order from top to bottom, one at a time. When the encountered statement is a method call,
	    the execution of the program moves inside the method in question. 
	    The statements of the method are executed one at a time from top to bottom. 
	    After this the execution returns to the place where the method call occured, 
	    and then proceeds to the next statement in the program.
	    
	    5) Strictly speaking, the main program (main) itself is a method. 
	    When the program starts, the operating system calls main. 
	    The main method is the starting point for the program, 
	    since the execution begins from its first line.
	    The execution of a program ends at the end of the main method.


	  
	  
	  */
	
	
	
	
	
	
	
	public static void main(String[] args) {

		
	}

}
