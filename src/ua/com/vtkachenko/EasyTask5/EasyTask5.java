package ua.com.vtkachenko.EasyTask5;

//Create function
//makeOutWord("<<>>", "Yay") → "<<Yay>>"
//makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
  //      makeOutWord("[[]]", "word") → "[[word]]"
public class EasyTask5 {
    public static void main(String[] args) {
        makeOutWord("<<>>", "Yay"); //→ "<<Yay>>"
        makeOutWord("<<>>", "WooHoo");// → "<<WooHoo>>"
        makeOutWord("[[]]", "word");// → "[[word]]"

        //Using StringBuilder
        makeOutWordSB("<<>>", "Yay"); //→ "<<Yay>>"
        makeOutWordSB("<<>>", "WooHoo");// → "<<WooHoo>>"
        makeOutWordSB("[[]]", "word");// → "[[word]]"
    }

    public static void makeOutWord(String cc, String word){
        System.out.println(cc.substring(0,2) + word + cc.substring(2,4));
    }

    public static void makeOutWordSB(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        sb.append(s1.substring(0,2));
        sb.append(s2);
        sb.append(s1.substring(2,4));
        System.out.println(sb.toString());
    }
}