public String middleThree(String str){
  int start = str.length()/2 -1;
  int end = str.length()/2 + 2;
  return str.substring(start,end);
}
