package CodingBat;

public class CodingBat {
    public static void main(String[] args) {

        System.out.println(method("zzzopzop"));
    }

    public static String method(String str) {
            String sr = "";
            for (int i = 0 ; i < str.length()-2; i ++ )

                if (str.charAt(i)=='z'&& str.charAt(i+2)=='p'){
                    sr += str.charAt(i)+""+str.charAt(i+2);
                    i+=2;
                }else
                    sr+= str.charAt(i);


            return sr;

        }
}