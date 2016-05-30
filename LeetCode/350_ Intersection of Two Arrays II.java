public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null)
            return new int[0];
        HashMap<Integer, Integer> set = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!set.containsKey(nums1[i])) {
                set.put(nums1[i], 1);
            } else {
                set.put(nums1[i], set.get(nums1[i]) + 1);
            }
        }
        ArrayList<Integer> resultArr = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.containsKey(nums2[i]) && set.get(nums2[i]) != 0) {
                resultArr.add(nums2[i]);
                set.put(nums2[i], set.get(nums2[i]) - 1);
            }
        }
        int[] result = new int[resultArr.size()];
        int j = 0;
        for (int num : resultArr) {
            result[j] = num;
            j++;
        }
        return result;
    }
