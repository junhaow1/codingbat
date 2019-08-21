public String minCat(String a, String b) {
  if (a.length()>b.length()){
    return a.substring(a.length()-b.length(),a.length())+ b;
  } else if ((a.length()<b.length())){
    return a+ b.substring(b.length()-a.length(),b.length());
  } else {
    return a +b ;
  }

}


//10min a litle bit hard
