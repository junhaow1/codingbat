public boolean parrotTrouble(boolean talking, int hour) {
  return (talking == true) && ((hour<7)||(hour>20));
}

// !!! (talking == true) 太蠢了 直接写 talking 就是 boolean

// public boolean parrotTrouble(boolean talking, int hour) {
//   return (talking && (hour < 7 || hour > 20));
//   // Need extra parenthesis around the || clause
//   // since && binds more tightly than ||
//   // && is like arithmetic *, || is like arithmetic +
// }
