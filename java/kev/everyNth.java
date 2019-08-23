public String everyNth(String str, int n) {
  String str1 = "";
  for (int i=0;i<str.length();i=i+n){
    str1 = str1 + str.substring(i,i+1);
  }

  return str1;
}


//5min im so smarttttttttt
