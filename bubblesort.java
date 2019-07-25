import java.io.*;

public final class bubblesort{
  public static void main(String[] args) throws IOException{
    BufferedReader scan= new BufferedReader(new InputStreamReader(System.in));
    int len=Integer.parseInt(scan.readLine());
    int temp=0;
    String[] str= new String[len];
    str= scan.readLine().split(" ");
    int[] num= new int[len];
    for(int i=0; i<len; i++){
      num[i]= Integer.parseInt(str[i]);
    }
    int count=0;
    for(int i=0; i<len-1; i++){
      count=0;
      for(int j=0; j<len-1; j++){
        if(num[j]>num[j+1]){
          count=1;
          temp=num[j];
          num[j]=num[j+1];
          num[j+1]=temp;
        }
      }
      if(count==0){
        break;
      }
    }
    for(int i=0; i<len; i++){
      System.out.print(num[i]+"  ");
    }
  }
}
