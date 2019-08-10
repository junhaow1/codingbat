public int diff21(int n) {

  if (n>21){
    return 2*Math.abs(n-21);
  }
  else{
    return Math.abs(n-21);
  }
}


// public int diff21(int n) {
//   if (n <= 21) {
//     return 21 - n;
//   } else {
//     return (n - 21) * 2;
//   }
// }
