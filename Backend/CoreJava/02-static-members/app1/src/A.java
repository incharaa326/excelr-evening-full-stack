class A 
{
	static int i;//field,property,attribute 
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
/*
1.static is a keyword or reserved word
2.we can declare a variable with static keyword
3.static means something that doesnot change very often
4.static members are also called class members

 
      how static members are processed?
	  ---------------------------------
	  1.all the static members gets loaded whenever the class is loading to the memory
	  2.in case of static variables they are going to be loaded with their default
	  values ex:int ==> 0, float,double ==> 0.0,boolean ==> false, string ==> null
	  etc...
	  3.after all the static members gets loaded to the memory,the memory,the next step is that
	  all the specific members gets initialized and executed from top to bottom only
	  once.
	  4.all the static members gets loaded,initialized and executed from top to bottom
	  only once for one execution when the class is loading to the memory
      5.after all the static members gets loaded,initialized and executed from top to bottom
      control comes to the main method.starts execution from the main method.
interview question ==> is there any possibility of executing something before execution something
before the execution of main method??
ans:yes.all the static members gets loaded,initialized and executed before the execution of main 
method
*/