package ZigZag;

public class ZigZag {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int fullColumn = s.length() % numRows == 0 ? s.length() / numRows : s.length() / numRows + 1;
        int columnLength = (numRows - 2) * fullColumn < 0 ? 0 : (numRows - 2) * fullColumn;
        String[][] table = new String[numRows][fullColumn + columnLength];
        int i = 0;
        int j = 0;
        int k = 1;
        String[] array = s.split("");
        int count = 0;
        while (count != array.length) {
            while (i != numRows && count != array.length) {
                table[i][j] = array[count];
                count += 1;
                i += 1;
            }
            i -= 1;
            while (i != 0 && count != array.length) {
                j += 1;
                i -= 1;
                table[i][j] = array[count];
                count += 1;
            }
            k += 1;
            i += 1;
        }

        StringBuilder result = new StringBuilder();
        for (String[] strings : table) {
            for (String string : strings) {
                if (string != null) {
                    result.append(string);
                }
            }
        }
        return result.toString();
    }

}
