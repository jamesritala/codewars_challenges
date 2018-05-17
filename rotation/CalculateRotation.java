import java.lang.*;

public class CalculateRotation {
    static int shiftedDiff(String first, String second){
        int count=0, index=0,strLength=0;
        String a,b;
        a= first;

        strLength= second.length();
        boolean continueRotation=true;
        while(count<strLength && continueRotation){
            if(count==strLength) continueRotation=false;

            if(a.equals(second))
                break;
            else{
                a=rotate(a);

                count++;
            }
        }


        if(count>=0) {
            if(count==strLength)
                return -1;
            else
                return count;
        }
        else
            return -1;
    }

    private static String rotate(String a) {
        char[] tempStr= a.toCharArray();
        int i=0,len=0;
        len=tempStr.length;
        tempStr[0]=a.toString().charAt(len-1);
        i++;
        while(i<len){
            tempStr[i]=a.toString().charAt(i-1);
            i++;
        }
        String rotatedStr="";
        for(int j=0;j<len;j++){
            rotatedStr+=""+tempStr[j];
        }
        return rotatedStr;
    }
}