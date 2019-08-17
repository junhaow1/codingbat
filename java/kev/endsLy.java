public Boolean endsLy(String str) {
//！！！ 用equals比较是否内容相等 ==比较是否reference一样
  if (str.length()>1){
    return  str.substring(str.length()-2,str.length()).equals("ly") ;
  }

  return false;
}
