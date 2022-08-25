package CodingBat;

public class CodingBat {
    public static void main(String[] args) {

        System.out.println(mixString("abc", "xyz"));
    }


    public static String mixString(String a, String b) {
        String result="";
        if(a.length()>=b.length()){
            for(int i = 0;i<b.length();i++){
                result +=""+a.charAt(i)+ b.charAt(i);
            }
            result +=a.substring(b.length()-1);
        }else{
            for(int i = 0;i<a.length();i++){
                result +=""+a.charAt(i)+ b.charAt(i);
            }
            result +=b.substring(a.length()-1);
        }
        return result;
    }


    public static String doubleIt(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += "" + str.charAt(i) + str.charAt(i);


        }
        return newStr;

    }
}




