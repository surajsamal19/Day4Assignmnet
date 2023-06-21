public class SecondlargestNumber{
public static void main(String args[]){
int[] num = {1,8,88,75,0,2};
int max =Integer.MIN_VALUE;
int secmax = Integer.MIN_VALUE;
for(int i = 0; i<num.length; i++){
if(num[i]>max){
secmax = max;
max = num[i];
}
else if(num[i]>secmax)
secmax = num[i];
}
}
System.out.println("1st H bvalue" +max);
System.out.println("2nd H value" +secmax);
}
}
