public String startOz(String str) {
  if (str.length()<3){
    return str;

  } else {
    if (str.substring(0,1).equals("o")){
      if (str.substring(1,2).equals("z")){
        return "oz";
      } else {
        return "o";
      }

    } else {
      if (str.substring(1,2).equals("z")){
        return "z";
      } else {
        return "";
      }

    }
  }

}


//  基本思路 可以跟简单 用 charAt
