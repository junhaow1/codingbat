public String lastChars(String a, String b) {
  if (a.length()<1) {
    if (b.length()<1){
      return "@@" ;
    }
    return "@"+ b.substring(b.length()-1,b.length()) ;
  }
  if (b.length()<1) {
    return a.substring(0,1) + "@";
  }

  return a.substring(0,1) + b.substring(b.length()-1,b.length()) ;
}
