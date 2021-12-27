package assign3;

interface StringConcatInterface{
    String showConcatString(String a, String b, String c, String d, String e, String f, String g);
}
public class ConcatSevenStrings {
    public static void main(String...args){
        StringConcatInterface strObj=(a,b,c,d,e,f,g)-> (a+b+c+d+e+f+g).toUpperCase();
        System.out.println(strObj.showConcatString("The", "lambda" ,"has", "too", "many", "string","arguments"));
    }
}