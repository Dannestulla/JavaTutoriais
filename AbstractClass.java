/*


--Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces 
--it is not possible to create an object of the abstract class:
--To access the abstract class, it must be inherited from another class.
=================
--An enum is a special "class" that represents a group 
of constants (unchangeable variables, like final variables).*/

public class AbstractClass {
    
    enum Lista{
       teste,
       valor,
       coisa,
    }
    
public static void main(String[] args) {
    Lista myVar = Lista.teste;
    System.out.println(myVar);
}
}
