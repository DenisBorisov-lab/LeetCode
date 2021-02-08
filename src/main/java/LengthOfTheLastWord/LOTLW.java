package LengthOfTheLastWord;

public class LOTLW {

    public int lengthOfLastWord(String s) {
        String[] list = s.split(" ");
        if (list.length == 0){
            return 0;
        }else{
            String result = list[list.length - 1].trim();
            return result.length();
        }

    }

}
