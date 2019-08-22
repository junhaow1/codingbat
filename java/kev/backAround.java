public String backAround(String str) {
  return str.substring(str.length()-1,str.length()) + str +
  str.substring(str.length()-1,str.length()) ;
}


// more clear bottom 2mins ez



// public String backAround(String str) {
//   // Get the last char
//   String last = str.substring(str.length() - 1);
//   return last + str + last;
// }
