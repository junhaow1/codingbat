public String lastChars(String a,String b){
  if (a.length()<1){
    if (b.length()<1){
      return "@@";
    } else {
      return "@"+b.substring(b.length()-1,b.length());

    }
  } else{
    if (b.length()<1){
      return a.substring(0,1) + "@";
    } else {
      return a.substring(0,1)+b.substring(b.length()-1,b.length()) ;

    }
  }







}
