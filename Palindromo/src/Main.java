public class Main {
    
    public static boolean palindrome(String value){
        String aux = "";

        if(!value.isEmpty()){ 
            for (int i = (value.length()-1); i >= 0; i--){
               aux+= value.charAt(i);
            }
        
            if (!value.equalsIgnoreCase(aux)){
                return false;
            } else{
                return true;
            }

        }else{
            return false;
        }
    }

    public static boolean palindrome2(String value){
        value = value.replaceAll("\\s", "");
        String aux = "";

        if(!value.isEmpty()){ 
            for (int i = (value.length()-1); i >= 0; i--){
               aux+= value.charAt(i);
            }
        
            if (!value.equalsIgnoreCase(aux)){
                return false;
            } else{
                return true;
            }

        }else{
            return false;
        }
    }

    public static boolean palindrome3(String value){
        value = value.toLowerCase().replaceAll("\\s", "");
        int left = 0;
        int right = value.length()-1;

        for(left = 0; left < (value.length()/2); left++){
            if (value.charAt(left) != value.charAt(right - left)){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        
        //String value = "Madam";
        String value2 ="Murillo";

        System.out.println("Primeira forma: " + palindrome(value2));
        System.out.println("Segunda forma: " + palindrome2(value2));
        System.out.println("Segunda forma: " + palindrome3(value2));
    }
}
