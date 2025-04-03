public class Main {
    public static void main(String[] args) {
        int[] num = {18, 12, 9, 14, 77, 50};
        int target = 9;
        int ans = linearSearch(num, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++ ) {
            int element = arr[i];
            if (element == target) {
                return i;// to return the element just change i with element
            }
        }
        return -1;
    }
}

// Linear Search - Says start searching from first till u get what you're looking for.
// If no value found return -1, value not found not exist.
// Time complexity: Best:  O(1) constant
//                  Worst: O(n) n = size of array