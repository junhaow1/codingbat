public String withoutX2(String str) {
 if(str.length()<2){
   return "";

 } else {
   if (str.substring(0,1).equals("x")){
     if (str.substring(1,2).equals("x")){
       return str.substring(2,str.length());
     } else {
       return str.substring(1,str.length());
     }

   } else{
     if (str.substring(1,2).equals("x")){
       return str.substring(0,1)+ str.substring(2,str.length());

     } else {
       return str;
     }
   }
 }
}




//8min
