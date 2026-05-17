package arraystring;

public class productExceptSelf {
    public static int[] pes(int[] nums) {
        int n = nums.length;
        int[] resultado = new int[n];

        resultado[0] = 1;
        for (int i = 1; i < n; i++) {
            resultado[i] = resultado[i - 1] * nums[i - 1];
            System.out.println(resultado[i]);

        }
        int right = 1;
        for(int i = n - 1; i >= 0; i--){
            resultado[i] *= right;
            right *= nums[i];
        }

        return resultado;
    }
}
