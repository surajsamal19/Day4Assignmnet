public class DuplicateElement{
public static void main(String args[]){
int[] duplicateElement = new int[] {1,1,2,2,3,4,5,6};
for(int i =0; i< duplicateElement.length; i++){
for(int j = i+1; j<duplicateElement.length; j++){
if(duplicateElement[i] == duplicateElement[j]) 
System.out.println("The duplicate element are:" +duplicateElement[j]);
}
}
}
}