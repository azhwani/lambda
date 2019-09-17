interface Hello{  
    public String say();  
}  
public class LambdaExample3{  
public static void main(String[] args) {  
    Hello h=()->{  
        return "Have a nice day!";  
    };  
    System.out.println(h.say());  
}  
}  
