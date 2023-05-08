package practiceprb;

import java.util.ArrayList;
import java.util.Collections;

public class Median {
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        float[] num1=new float[nums1.length];
	        float[] num2=new float[nums2.length] ;
	        for(int i=0;i<nums1.length;i++){
	            num1[i]=nums1[i];
	           

	        }
	        for(int i=0;i<nums2.length;i++){
	            num2[i]=nums2[i];
	           

	        }

	        
	        ArrayList<Float> list1= new ArrayList<>();
	        double result=0.0;
	        for(float i:num1){
	            list1.add(i);
	        }
	        for(float i:num2){
	            list1.add(i);
	        }
	        Collections.sort(list1);
	        int l=list1.size();
	        if(l%2==0){
	            result=(list1.get((l/2)-1)+list1.get((l/2)))/2;
	        }
	        else{
	            result=list1.get(l/2);
	        }
	        return result;
	    }

}
