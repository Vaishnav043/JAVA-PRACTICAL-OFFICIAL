import java.util.*;

class IsContain{
    static int recursive1(String sentence, String word) {
    int pos = sentence.indexOf(word);

    if (pos == -1) {
        return 0;
    }

    return 1 + recursive1(sentence.substring(pos + word.length() - 1), word);
}

static int recursive2(String sentence, String word) {

    if(!sentence.contains(word)) {
        return 0;
    }

    sentence = sentence.replaceFirst(word, "");

    return 1 + recursive2(sentence, word);
}

static int recursive3(String s1, String s2) {

    if (s1.length() < s2.length())
        return 0;

    if (s1.substring(0, s2.length()).equals(s2))
        return 1 + recursive2(s1.substring(s2.length()), s2);

    return recursive2(s1.substring(1), s2);
}


    static int iterative1(String sentence,String word) {
        int count =0;
        int index= 0;

        while(sentence.contains(word)){
            index = sentence.indexOf(word,index);
             
             if(index!=-1){
                count++;
                index +=word.length()-1;
             }else{
                break;
             }
        }
        return count;
    }
    static int iterative2(String sentence,String word) {
    int count =0;
    int index= 0;

    while(sentence.contains(word)){
        index = sentence.indexOf(word,index);

        if(index!=-1){
            count++;
            sentence= sentence.replaceFirst(word,"");
        }else{
            break;
        }
        
    }
            return count;
    }

    static int iterative3(String s1, String s2) {
    int count = 0;

    for (int i = 0; i <= s1.length() - s2.length(); i++) {
        if (s1.substring(i, i + s2.length()).equals(s2)) {
            count++;
        }
    }

    return count;
}
  



    public static void main (String arg[]) {
        System.out.println(recursive1("abcabca","abc"));

        System.out.println(recursive2("abcabca","abc"));

        System.out.println(recursive3("abcabca","abc"));

        System.out.println(iterative1("abcabca","abc"));

        System.out.println(iterative2("abcabca","abc"));

        System.out.println(iterative3("abcabca","abc"));

    }
}