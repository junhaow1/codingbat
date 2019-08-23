public boolean stringE(String str) {
  int count = 0;

  for (int i=0;i<str.length();i++){
    if (str.substring(0+i,1+i).equals("e")) {
      count++;
    }
  }

  if(count>=1 && count<=3) {
    return true;
  } else {
    return false;
  }

}


//8min


//could use charAt



public boolean stringE(String str) {
  int count = 0;

  for (int i=0; i<str.length(); i++) {
    if (str.charAt(i) == 'e') count++;
    // alternately: str.substring(i, i+1).equals("e")
  }

  return (count >= 1 && count <= 3);
}
