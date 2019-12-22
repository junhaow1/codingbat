public int last2(String str) {
  int count = 0;
  for (int i = 0; i < str.length()-2 ; i++){
    if (str.substring(i,i+2).equals(str.substring(str.length()-2,str.length()
    )) ) {
      count ++;
    }
  }


  return count;
}



//7min to understand the q, 6 min to implement a littlr bit challenged
