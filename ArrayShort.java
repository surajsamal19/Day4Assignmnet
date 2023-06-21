public class ArraySort{
public static void main(Strung args[]){
itn[] sortArray = new int[] {,5,8,2,9,6,1};
int temp = 0;
System.out.println("Elements of  Original Array are:");
for(int i = 0; i<sorrtArray.length; i++){
System.out.println(sortArray[i]+ " ");
}
for(int i = 0; i<sortArray.length;i++){
for(int j = i+1; j<sortArray.length; j++){
if(sortArray[i] > sortArray{j}){
temp = sortArray[i];
sortArray[i] = sortArray[j];
sortArray[j] = temp;
}
}
}
}
System.out.println();
System.out.pritnln("Elements of array sorted in ascending order");
for(int i = 0 ; i<sortArray.length;i++){
System.out.print(sortArraya[i] + "   ");
