
public class firstAndLastOccurance {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 4, 5 };
        int target = 2;

        int firstIndex = firstOccurrence(arr, target);
        int lastIndex = lastOccurrence(arr, target);

        if (firstIndex == -1 || lastIndex == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("First occurrence of " + target + " is at index " + firstIndex);
            System.out.println("Last occurrence of " + target + " is at index " + lastIndex);
        }
    }

    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
