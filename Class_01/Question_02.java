import java.util.ArrayList;

class Solution {
    public int maxArea(ArrayList<Integer> height) {
        int maxStorage = 0, leftmostHeight = 0, rightmostHeight = height.size() - 1;
        while (leftmostHeight < rightmostHeight) {
            int widthIndexCount = rightmostHeight - leftmostHeight;
            int heightLowestCount = Math.min(height.get(leftmostHeight), height.get(rightmostHeight));
            maxStorage = Math.max(maxStorage, widthIndexCount * heightLowestCount);
            if (height.get(leftmostHeight) < height.get(rightmostHeight)) {
                leftmostHeight++;
            } else {
                rightmostHeight--;
            }
        }
        return maxStorage;
    }
}

// This is just to check if the solution method works.

public class Main {
    public static void main(String[] args) {
        Solution sc = new Solution();
        ArrayList<Integer> h = new ArrayList<>() {
            {
                add(1);
                add(8);
                add(6);
                add(2);
                add(5);
                add(4);
                add(8);
                add(3);
                add(7);
            }
        };
        System.out.println(sc.maxArea(h));
    }
}

//class Solution {
//    public int maxArea(int[] height) {
//        int maxStorage = 0, leftmostHeight = 0, rightmostHeight = height.length - 1;
//        while (leftmostHeight < rightmostHeight) {
//            int widthIndexCount = rightmostHeight - leftmostHeight;
//            int heightLowestCount = Math.min(height[leftmostHeight], height[rightmostHeight]);
//            maxStorage = Math.max(maxStorage, widthIndexCount * heightLowestCount);
//            if (height[leftmostHeight] < height[rightmostHeight]) {
//                leftmostHeight++;
//            } else {
//                rightmostHeight--;
//            }
//        }
//        return maxStorage;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Solution sc = new Solution();
//        int[] h = {1,8,6,2,5,4,8,3,7};
//        System.out.println(sc.maxArea(h));
//    }
//}
