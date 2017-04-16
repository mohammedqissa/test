/**
 * Created by mohammedissa on 5/30/16.
 */
public class Main {

    public static void main(String[] args){


        int [] a = {1,2,3,4,5,6,7,8,9};
        int [] b = {1,3,4,6,7,8,9,10,11};

        int counter = 0;




        int time =0;
        int i = 0 ;int j = 8;
        while(j>0)
        {
            time++;
            if(a[i]+b[j]<=7){

                counter=counter+(++i)+1;
            }
            else
                j--;



        }

        System.out.println("counter = "+counter+"  time = "+time);


    }


}
