package task11;

public class newThread extends Thread{
    @Override
 public void run(){
  for(int i=0;i<101;i++) {
      System.out.println(i);
  }
    }

}
