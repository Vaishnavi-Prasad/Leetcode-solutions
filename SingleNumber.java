class SingleNumber {
  public int singleNumber(int[] nums) {
    HashMap<Integer, Integer> numsInMap = new HashMap<>();

    for (int i : nums) {
      numsInMap.put(i, numsInMap.getOrDefault(i, 0) + 1);
    }
    for (int i : nums) {
      if (numsInMap.get(i) == 1) {
        return i;
      }
    }
    return 0;
  }
}
