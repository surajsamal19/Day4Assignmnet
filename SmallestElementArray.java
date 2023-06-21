public class SmallestElementArray{
public static void main(String args[]){
int[] smallestElement = new int[] {25,12,5,22,66};
int min = smallestElement[0];
for(int i = 0; i < smallestElement.length; i++)
if(smallestElement[i] < min){
min = smallestElement[i];
}
System.out.println("Smallest Element is:" +min);
}
}
 