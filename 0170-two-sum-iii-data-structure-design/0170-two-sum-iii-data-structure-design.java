class TwoSum {
    List<Integer> nums;
    
    public TwoSum() {
        this.nums = new ArrayList<Integer>();
    }
    
    public void add(int number) {
       this.nums.add(number);
    }
    
    public boolean find(int value) {
        Collections.sort(this.nums);
        int l = 0;
        int r = this.nums.size() - 1;
        
        while(l < r){
            int sum = this.nums.get(l) + this.nums.get(r);
            if(sum < value)
                l++;
            else if(sum > value)
                r--;
            else if (sum == value)
                return true;
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */