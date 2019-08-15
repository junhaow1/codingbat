public String left2(String str) {
  return str.substring(2,str.length())+ str.substring(0,2) ;
}


// substring(2) 简便！！

// public String left2(String str) {
//   return str.substring(2) + str.substring(0, 2);

  // Solution notes: conveniently, substring(2) extracts the string from index 2
  // through the end. So we put that first, followed by substring(0, 2)
}
