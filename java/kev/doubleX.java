public boolean doubleX(String str) {
        if (str.length()<2){
            return false;
        } else {
            for (int i=0;i<str.length()-1;i++){
                if (str.substring(i,i+1).equals("x")){


                    if (str.substring(i+1,i+2).equals("x")){
                        return true;
                    } else {
                        return false;
                    }


                }
            }

        }

        return false;
    }



//my solution 22min







public boolean doubleX(String str) {
  int i = str.indexOf("x");
  if (i == -1) return false;
  if (i+1 == str.length()) return false;
  if (str.substring(i+1,i+2).equals("x")){
    return true;
  } else {
    return false;
  }
}




       // sec solution using indexOf
