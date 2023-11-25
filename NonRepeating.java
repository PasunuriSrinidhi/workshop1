import java.util.*;

public class NonRepeating{

public static void main(String[] args){

int []a={10,20,40,30,50,20,10,20};

noRepeating(a);

}

public static void noRepeating(int[] a){
/*Map<Integer,Integer>m=new HashMap<>();
for(int n:a){
m.put(n,m.getOrDefault(n,0)+1);

}

System.out.print("Non-repeating elements:");
for(int i:a){
if(m.get(i)==1){
System.out.print(i+" ");
*/
boolean c;
for(int i=0;i<a.length;i++){
c=false;
for(int j=0;j<a.length;j++){
if(i!=j && a[i]==a[j]){
c=true;
break;
}
}
if(!c)
System.out.print(a[i]+" ");
}
}
}

