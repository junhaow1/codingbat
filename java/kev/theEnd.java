public String theEnd(String str, boolean front) {
//   if (front) {
//     return str.substring(0,1);
//   }
//   if (!front){
//     return str.substring(str.length()-1,str.length());
//   }
//   else{
//     return str;
//   }
// }


//!!! if else 不用蠢！！！


    if (front){
        return str.substring(0,1);
    }   else {
        return str.substring(str.length()-1,str.length());
    }

}
