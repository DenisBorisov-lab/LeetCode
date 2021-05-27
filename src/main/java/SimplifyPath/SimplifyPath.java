package SimplifyPath;

import java.util.ArrayList;
import java.util.Arrays;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] directors = path.split("/");
        ArrayList<String> smartDirectories = new ArrayList<>(Arrays.asList(directors));
        StringBuilder simplePath = new StringBuilder();
        for (String smartDirectory : smartDirectories) {
            if (smartDirectory.equals(".") || smartDirectory.equals("")) {
            } else {
                simplePath.append("/").append(smartDirectory);
            }
        }
        return remove(simplePath.toString());
    }
    public static String remove(String path){
        String[] directories = path.split("/");
        ArrayList<String> list = new ArrayList<>();
        for (String word : directories){
            if (word.equals("..")){
                if (list.size() != 0){
                    list.remove(list.size() - 1);
                }
            }else if (word.equals("")){
            }else {
                list.add("/" + word);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (String word : list){
            builder.append(word);
        }
        if (builder.length() == 0){
            builder.append("/");
        }
        return builder.toString();
    }
}
