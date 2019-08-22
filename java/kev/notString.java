public String notString(String str) {
  if (str.length()<3){
    return "not "+ str;

  } else {
    if (str.substring(0,3).equals("not")){
      return str;

    } else {
      return "not "+ str;
    }
  }
}


//5.5min   bottom solution better.

// public String notString(String str) {
//   if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
//     return str;
//   }

//   return "not " + str;
// }
