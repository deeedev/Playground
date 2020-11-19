import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          int sun=sc.nextInt();

      int mon=sc.nextInt();
      int tue=sc.nextInt();
      int wed=sc.nextInt();
    int thr=sc.nextInt();
    int fri=sc.nextInt();
    int sat=sc.nextInt();
    int m,t,w,th,f,s,su,salary;
      if(mon<=8)
        m=100*mon;
      else
        m=800+(mon-8)*115;
      if(tue<=8)
        t=100*tue;
      else
        t=800+(tue-8)*115;
      if(wed<=8)
        w=100*wed;
      else
        w=800+(wed-8)*115;
      if(thr<=8)
        th=100*thr;
      else
        th=800+(thr-8)*115;
      if(fri<=8)
        f=100*fri;
      else
        f=800+(fri-8)*115;
      s=125*sat;
      su=150*sun;
      salary=m+t+w+th+f+s+su;
      int hr=mon+tue+wed+thr+fri;
      if(hr>40)
        salary=salary+(hr-40)*125;
      System.out.println(salary);
    }
}