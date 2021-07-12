package SimplifyPath;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] directories = path.split("/");
        ArrayList<String> simplePath = new ArrayList<>();
        for (String directory : directories) {
            if (!directory.equals("") && !directory.equals("/") && !directory.equals(".") && !directory.equals("..")) {
                simplePath.add("/" + directory);
            } else if (directory.equals("..") && !simplePath.isEmpty()) {
                simplePath.remove(simplePath.size() - 1);
            }
        }
        String result = String.join("", simplePath);
        if (result.length() == 0) {
            result += "/";
        }
        return result;

    }

    public String simple(String path){
        String[] directories = path.split("/");
        List<String> simplePath = new ArrayList<>();
        Stream.of(directories)
                .forEach(directory -> {
                    if (!directory.equals("") && !directory.equals("/") && !directory.equals(".") && !directory.equals("..")) {
                        simplePath.add("/" + directory);
                    } else if (directory.equals("..") && !simplePath.isEmpty()) {
                        simplePath.remove(simplePath.size() - 1);
                    }
                });
        return simplePath.isEmpty() ? "/" : String.join("", simplePath);
    }
}
