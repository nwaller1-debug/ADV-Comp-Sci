public class Sort {
    
    private int [] nums;


    public Sort() {
        for (int i = 0; i < nums.length; i++) {
            this.nums[i] = (int)(Math.random() * 100);
        }
    }

    public int [] swap(int [] nums) {
        int x;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    x = nums[i];
                    nums[i] = nums[j];
                    nums[j] = x;
                }
            }
            

            
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(swap());
    }

    public int[] getNums() {
        return nums;
    }
    
    public void setNums(int[] nums) {
        this.nums = nums;
    }


}
