package string.basic;

public class RevWordinString {
	public static void main(String args[])
    {
      String s="Learning made easy at bitLabs";
      String split[]=s.split(" ");
      for(int i=split.length-1;i>=0;i--)
        {
          String temp=split[i];
          String reverse="";
          for(int j=temp.length()-1;j>=0;j--)
            {
              char ch=temp.charAt(j);
              reverse=reverse+ch;
            }
          System.out.print(reverse+" ");
        }
      System.out.println();
      for(int x=0;x<split.length;x++)
        {
          String rev="";
          String t=split[x];
          for(int y=t.length()-1;y>=0;y--)
            {
              char c=t.charAt(y);
              rev=rev+c;
            }
           System.out.print(rev+" ");
        }
    }
}
