import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
    
    while(i != 0){
      //System.out.print(i + " ");
      
      String s = sc.nextLine();
      s = s.replaceAll("\\s","");
      s = new StringBuilder(s).reverse().toString();
      
      for(int j=0; j<s.length(); j++){
        char a_char = s.charAt(j);
        int index = (alphabet.indexOf(a_char)+i)%alphabet.length();
        System.out.print(alphabet.charAt(index));
      }
      
      System.out.println();
      
      i = sc.nextInt();
    }
  }
}