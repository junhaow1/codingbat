// public boolean hasBad(String str) {
//   if (str.length()<3) {
//     return false;
//   }
//   if (str.substring(0,3).equals("bad")) {
//     return true;
//   }
//
//
//   if (str.length()>3) {
//     if (str.substring(1,4).equals("bad")){
//       return true;
//     }
//     else{
//       return false;
//     }
//
//   }
//
//   else{
//     return false;
//   }
//
// }
//




// ！！！！！ 很蠢



public boolean hasBad(String str) {
  if (str.length()>=3 && str.substring(0, 3).equals("bad")) {
    return true;
  }
  if (str.length()>=4 && str.substring(1, 4).equals("bad")) {
    return true;
  }
  return false;



}




public boolean hasBad(String str) {
  if (str.length()<3){
    return false;
  } else if (str.length() ==3 ){
    return str.substring(0,3).equals("bad");

  } else {
    return str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad") ;
  }


}
