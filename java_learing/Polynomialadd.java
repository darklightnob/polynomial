
import java.util.Scanner;

class Polynomialadd{
    public static int[] addPolynomials(int low,int deg1,int deg2,int[] pol1,int[] pol2){
        while(low>=0){
            for(int i=1;i<=(deg1*2)+1;i=i+2){
                if(pol1[i]==low){
                    for(int j=1;j<=(deg2*2)+1;j=j+2){
                        if(pol2[j]==low){
                            pol1[i-1]= pol1[i-1] + pol2[j-1];
                            break;
                        }
                    }
                    break;

                }
            }
            low--;
        }
        System.out.print("sum of polynomial is: ");
        for(int i=0;i<=(deg1*2)+1;i=i+2){
            if(pol1[i+1] == 0){
                System.out.println(pol1[i]+" = 0");
                break;
            }
            System.out.print(pol1[i]);
            System.out.print("x^"+pol1[i+1]+"+");
        }
        
        return pol1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pol1[]= new int[100];
        int pol2[]= new int[100];
        System.out.print("write the highest degree of the first polynomial:");
        int deg1=sc.nextInt();
        System.out.print("write the highest degree of the second polynomial:");
        int deg2=sc.nextInt();
        System.out.println("write the coefficient from highest order for polynomal 1");
        for(int i=0;i<=(deg1*2)+1;i=i+2){
            pol1[i]= sc.nextInt();

        }
        int sam1=deg1;
        for(int i=1;i<=(deg1*2)+1;i=i+2){
            
            pol1[i]=sam1;
            sam1=sam1-1;
        }

        //polynomial 2
        System.out.println("write the coefficient from highest order for polynomal 2");

        for(int i=0;i<=(deg2*2)+1;i=i+2){
            pol2[i]= sc.nextInt();

        }
        int sam2=deg2;
        for(int i=1;i<=(deg2*2)+1;i=i+2){
            
            pol2[i]=sam2;
            sam2=sam2-1;
        }
        //function logic
        int low;
        if(deg1>deg2){
            low=deg2;
            pol1 = Polynomialadd.addPolynomials(low, deg1, deg2, pol1, pol2);
        }
        else{
            low=deg1;
            pol1 = Polynomialadd.addPolynomials(low, deg2, deg1, pol2, pol1);
        }

    }

}
