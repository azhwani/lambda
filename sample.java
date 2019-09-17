
interface Hello{  
    public String say();  
}  
public class LambdaExample3{  
    public static void main(String[] args) {  
        // Interface implementation using lambda expression
        Hello h = ()->{  
            return "Have a nice day!";  
        }; 
        
        System.out.println(h.say());  
    }  
}  

