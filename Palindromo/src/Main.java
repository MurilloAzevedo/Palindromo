public class Main {
    
    public static boolean palindrome(String value){
        String aux = "";

        if(!value.isEmpty()){ 
            for (int i = (value.length()-1); i >= 0; i--){
               aux+= value.charAt(i);
            }
        
            if (!value.equals(aux)){
                return false;
            } else{
                return true;
            }

        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        
        String value = "madam";
        System.out.println(palindrome(value));
    }
}
