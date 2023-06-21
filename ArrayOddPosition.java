public class ArrayOddPosition{
public static void main(String args[]){
int[] oddPosition = new int[] {1,2,3,4,5,6,7};
for(int i = 0; i <= oddPosition.length; i+= 2){
System.out.println("The position of array in odd place is:" +oddPosition[i]);
}
}
}