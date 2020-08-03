import java.util.regex.Matcher; 
import java.util.regex.Pattern;
import java.util.Scanner;
  
class CheckEmail{ 
    public static void main(String [] ak){ 
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter Email: ");
        String email = scan.next();

        if (isValid(email)) System.out.println("Valid"); 
        else System.out.println("Invalid"); 
    } 
    
    public static boolean isValid(String email){ 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        
        if (email == null) return false; 
        return pat.matcher(email).matches(); 
    }
} 