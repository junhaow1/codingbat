public int intMax(int a, int b, int c) {
  if (a>b){
    if (a>c){
      return a;
    } else {
      return c;
    }

  } else {
    if(b>c){
      return b;
    } else {
      return c;
    }
  }

}


//6min



public int intMax(int a, int b, int c) {
  return  Math.max(Math.max(a,b),c);
}


//2nd solution




public int intMax(int a, int b, int c) {
  int max = 0;
  if (a>b){
    max = a;
  } else {
    max = b;
  }

  if(c>max){
    max = c;
  }


  return max;
}


// 3rd solution
