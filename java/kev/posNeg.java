public boolean posNeg(int a, int b, boolean negative) {


  if ( ((a<0)&&(b>0)) ||( (a>0)&&(b<0))) {
    return true;
  }
  if( (negative == true) && (a<0) && (b<0)){
    return true;
  }
  else{
    return false;
  }
}
