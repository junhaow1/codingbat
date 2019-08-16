public boolean hasBad(String str) {
  if str.substring(0,3).equals("bad") {
    return true;
  }

  if str.substring(1,4).equals("bad"){
    return true;
  }

  return false;
}
