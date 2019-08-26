public int countXX(String str) {
  int count = 0;
  for (int i=0;i<str.length()-1;i++){
    if (str.substring(0+i,2+i).equals("xx")){
      count++;
    }

  }
  return count;
}c


//5min
