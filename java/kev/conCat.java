public String conCat(String a, String b) {

  // if (a.equals("") ){
  //   return b;
  // }
  // if (b.equals("") ){
  //   return a;
  // }
  if ( a.substring( a.length()-1,a.length() )).equals( b.substring(0,1) ) {
    return "1";
    //a + b.substring(1,b.length())
  }
  // return a.substring(a.length()-1,a.length()) ;
  return a+b;
}


if ((a.substring(a.length()-1, a.length())).equals(b.substring(0,1))) {

}
