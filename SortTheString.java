package Zsgs.Practice;

import java.util.Arrays;

public class SortTheString {
    void sortString(){
        String [] names={"aruni","vasu","bala","kumar","anbu","arun"};
        for(int i=1;i< names.length;i++){
            int second =i;
            while(second>0){
            int minLength=names[second].length()<names[second-1].length()? names[second].length() : names[second-1].length();
            for (int j=0;j<minLength;j++) {
                if (names[second].charAt(j) < names[second-1].charAt(j)) {
                    String temp = names[second];
                    names[second] = names[second-1];
                    names[second-1] = temp;
                    break;
                } else if (names[second].charAt(j)==names[second-1].charAt(j)) {
                    if(j==minLength-1) {
                        if (names[second].length() < names[second - 1].length()) {
                            String temp = names[second];
                            names[second] = names[second - 1];
                            names[second - 1] = temp;
                        }
                    }
                    continue;
                }
                else {
                    break;
                }
            }
            second--;
            }
        }
        System.out.println(Arrays.toString(names));
    }

    public static void main(String[] args) {
        new SortTheString().sortString();
        String [] names1={"arun","vasu","bala","kumar","anbu"};
        Arrays.sort(names1);
        System.out.println("sort"+Arrays.toString(names1));
    }
}
