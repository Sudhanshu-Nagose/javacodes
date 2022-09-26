package demo1;

public interface A {
		void show();
		int num=44;
		default void change()
		{
			System.out.println("Default method..");
		}
		
		static void func()
		{
			System.out.println("Static method");
		}
		
}
