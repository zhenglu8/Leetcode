package LinkedList;

import java.util.LinkedList;

public class MergeTwoSortedLists_21 {
    public static void main (String [] args){
        LinkedList<Integer> nums1 = new LinkedList<>();
        LinkedList<Integer> nums2 = new LinkedList<>();
        LinkedList<Integer> nums3 = new LinkedList<>();


        //nums1.add(1);
        //nums1.add(2);
        nums1.add(0);


        //nums2.add(1);
        //nums2.add(3);
        //nums2.add(0);


        System.out.println(nums1);
        System.out.println(nums2);

        if (nums1.isEmpty()){
            nums3 = nums2;
        }
        else if (nums2.isEmpty()){
            nums3 = nums1;
        }
        else{
            for(int i = 0; i < nums1.size(); i++){
                if (nums1.get(i) <= nums2.get(i)){
                    nums3.add(nums3.size(), nums1.get(i));
                    nums3.add(nums3.size(), nums2.get(i));
                }
                else{
                    nums3.add(nums3.size(), nums2.get(i));
                    nums3.add(nums3.size(), nums1.get(i));
                }
            }
        }

        System.out.println(nums3);
    }
}
