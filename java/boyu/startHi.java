public boolean startHi(String str) {
  return str.length() < 2 ? false : "hi".equals(str.substring(0,2));
}
