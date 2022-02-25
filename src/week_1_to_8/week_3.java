package week_1_to_8;

public class week_3 {
    public int smallestnumber(String givennumber){
        int number;
        int n=givennumber.length();
        int num[]=new int[10];

        for (int i=0;i<n;i++){
            number=Integer.parseInt(givennumber.charAt(i)+"");
            num[number]=1;
        }
        for (int i=1;i<10;i++){
            if(num[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String input1="1689";
        String input2="689345";
        week_3 num= new week_3();

        int output1= num.smallestnumber(input1);
        System.out.println("Output 1:"+output1);
        int output2= num.smallestnumber(input2);
        System.out.println("Output 2:"+output2);
    }
}
