public boolean sleepIn(boolean weekday, boolean vacation) {
  if ((weekday == false) || (vacation == true)) {
    return true;
  }
  else {
    return false;
  }
}
