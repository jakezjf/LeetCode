public int[] intersection(int[] nums1, int[] nums2) {


    if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) 
        return new int[0];

    HashSet<Integer> set = new HashSet<Integer>();


    for (int i = 0; i < nums1.length; i++) {
        set.add(nums1[i]);
    }


    List<Integer> comm = new ArrayList<Integer>();

    for (int i = 0; i < nums2.length; i++) {
        if (set.contains(nums2[i])) {
            comm.add(nums2[i]);
            set.remove(nums2[i]);
        }

    }

    return list2array(comm);
}

private int[] list2array(List<Integer> comm) {
    int s = comm.size();
    int[] ret = new int[s];

    for (int i = 0; i < s; i ++) {
        ret[i] = comm.get(i).intValue();
    }

    return ret;
}
