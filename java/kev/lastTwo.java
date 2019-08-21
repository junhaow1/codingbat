public String lastTwo(String str) {
  if (str.length()<2){
    return str;
  } else if (str.length() == 2){
    return str.substring(1,2)+str.substring(0,1);

  } else {
    return str.substring(0,str.length()-2) + str.substring(str.length()-1,str.length()) +
    str.substring(str.length()-2,str.length()-1);
  }

}


// 8 mins not hard
