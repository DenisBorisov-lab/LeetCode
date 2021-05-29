package SimplifyPath;

import java.util.ArrayList;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] directories = path.split("/");
        ArrayList<String> simplePath = new ArrayList<>();
        for (String directory : directories) {
            if (directory.equals("") || directory.equals("/") || directory.equals(".")) {
                continue;
            } else if (directory.equals("..")) {
                if (simplePath.size() == 0) {
                    continue;
                } else {
                    simplePath.remove(simplePath.size() - 1);
                }
            } else {
                simplePath.add("/" + directory);
            }
        }
        String result = String.join("", simplePath);
        if (result.length() == 0) {
            result += "/";
        }
        return result;

    }
}
