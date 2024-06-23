package rohan.binarysearch;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters ={'c','f','j'};
        char target = 'f';
        char answer = nextGreatestLetter( letters, target);
        System.out.println(answer);
    }
    public static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        char temp;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(letters[mid] > target){
                temp = letters[mid];
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}
