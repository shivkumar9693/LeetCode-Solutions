class Solution {
    int sum(int n) {
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sum(nums[i]);
            arr[i][1] = nums[i];
            arr[i][2] = i;
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][2] == i) {
                continue;
            }

            int j = i;
            int cycleSize = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][2];
                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += cycleSize - 1;
            }
        }

        return swaps;
    }
}