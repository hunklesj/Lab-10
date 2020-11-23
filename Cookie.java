class Cookie {
   int number;
   int bakeTemp;
   int bakeTime;
   boolean baked;

  Cookie () {
    number = 0;
    bakeTemp = 0;
    bakeTime = 0;
    baked = false;
  }

  Cookie (int aNumber,int aBaketemp, int aBaketime){
  number = aNumber;
  bakeTemp = aBaketemp;
  bakeTime = aBaketime;
  baked = false;
  }

  boolean isReady(){
    return baked;
  }


  void setNumber(int aNumber){
    number = aNumber;
    }

void bake(int aBaketemp, int aBaketime){
  System.out.println(number + " cookies were baked at " + aBaketemp + " degrees F for " + aBaketime + " minutes.");
  baked = true;
}
}
