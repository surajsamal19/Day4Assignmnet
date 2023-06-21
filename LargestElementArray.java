public class LargestElementArray{
public static void main(String args[]){
int[] largestElement = new int[]{1,2,3,4,5,6,7,8,9};
int max = largestElement[0];
for(int i = 0; i < largestElement.length; i++){
if(largestElement[i] > max)
max = largestElement[i];
}
System.out.println("Largest Element is:" +max);
}
}

