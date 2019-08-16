public Boolean endsLy(String str) {
  // if (str.length()>1){
  //   return  str.substring(str.length()-2,str.length()) == "ly" ;
  // }

  // return false;

  //str.contains("ly") &&
  if (str.length()>1){
    return  str.substring(str.length()-2,str.length()) == "ly" ;
  }

  return false;
}
