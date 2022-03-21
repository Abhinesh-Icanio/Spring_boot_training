import java.util.*;
class numberword{


 public static String convert(int n)

{
    String[] single = {"", "One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve",
 "Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

  String[] twos = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};


if(n<20){return single[n];
}

if(n<100){
return twos[n/10] + ((n%10 !=0 )? "  " : "") + single[n%10]; 
}

if(n<1000){ 
return single[n/100] + " Hundred" + ((n%10 !=0)? "and " : "") + convert(n%100);
}

if(n<10000){
 return single[n/1000] + " Thousand" +((n%10 !=0)? " " : "")+ convert(n%1000);
}

return null;
}

 public static void main(String[] args){ 
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = s.nextInt();
        System.out.println(convert(n));

         
}
}