public String frontTimes(String str, int n) {
  String out = "";
  String front;
  if (str.length()<3){
    front = str;
  } else {
    front = str.substring(0,3);
  }
  for (int i=0;i<n;i++){
    out += front;
  }
  return out;

}


//4min 
