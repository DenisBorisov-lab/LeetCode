package ContainerWithTheMostWater;

public class Demo {

    public int maxArea(int[] height) {
        int maxValue = 0;
        int start = 0;
        int end = height.length - 1;
        while (start != end) {
            int value = (end - start) * Math.min(height[start], height[end]);
            if (value > maxValue) {
                maxValue = value;
            }else{
                if (height[start] < height[end]){
                    start += 1;
                }else{
                    end -= 1;
                }
            }
        }
        return maxValue;
    }
}
