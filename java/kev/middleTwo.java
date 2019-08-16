public String middleTwo(String str) {
  int start = str.length()/2 - 1;
  int end = str.length()/2 + 1;
  return str.substring(start,end);
}
