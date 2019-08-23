public int close10(int a, int b) {
  int value = 0;
  if (a == b){
    return 0;
  } else {

    if(Math.abs(10-a)<Math.abs(10-b)){
      value = a;
    } else if (Math.abs(10-a)>Math.abs(10-b)){
      value = b;
    } else {
      value = 0;
    }

  }

  return value;



}

//5min

// could be better. dont need first if 
