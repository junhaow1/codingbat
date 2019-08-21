public String startWord(String str, String word) {
  if (word.length()>1){
    if( word.substring( 1,word.length() ).equals(str.substring(1,word.length())) ){
    return str.substring(0,word.length());
  } else {
    return "";
  } elseif (word.length()==1){
    return "";
  }

   else {
    return "";
  }
}
