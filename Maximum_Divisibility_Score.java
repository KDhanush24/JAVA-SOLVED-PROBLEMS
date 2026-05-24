import java.util.*;
class Maximum_Divisibility_Score {
    public int maxDivScore(int[] nums, int[] divisors) {
        int x = nums.length;
        int y = divisors.length;
        int maxCount = 0;
        int ans = divisors[0];

        for(int i = 0; i < y; i++) {
            int sum = 0;
            for(int j = 0; j < x; j++) {
                if(nums[j] % divisors[i] == 0) {
                    sum++;
                }
            }
            if(sum > maxCount) {
                maxCount = sum;
                ans = divisors[i];
            }
            else if(sum == maxCount) {
                ans = Math.min(ans, divisors[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of nums array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter nums elements:");

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter size of divisors array: ");
        int m = sc.nextInt();

        int[] divisors = new int[m];

        System.out.println("Enter divisors elements:");

        for(int i = 0; i < m; i++) {
            divisors[i] = sc.nextInt();
        }

        Maximum_Divisibility_Score obj = new Maximum_Divisibility_Score();
        int result = obj.maxDivScore(nums, divisors);
        System.out.println("Answer: " + result);

    }
}