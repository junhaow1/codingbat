public int max1020(int a, int b) {
  if ( (a<10 || a>20) && (b<10 || b>20) ) {
    return 0;
  } else {
    if ( (a>=10 && a<=20) && (b>=10 && b<=20) ){
      if (a>b){
        return a;
      } else {
        return b;
      }
    } else if (         (a>=10 && a<=20) && (b<10 || b>20)        ){
      return a;
    } else {
      return b;
    }
  }
}



//8min



public int max1020(int a, int b) {
  // First make it so the bigger value is in a
  if (b > a) {
    int temp = a;
    a = b;
    b = temp;
  }

  // Knowing a is bigger, just check a first
  if (a >= 10 && a <= 20) return a;
  if (b >= 10 && b <= 20) return b;
  return 0;
}


// this solution better
