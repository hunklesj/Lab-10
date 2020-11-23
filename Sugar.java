class Sugar extends Cookie {
  String shape;
  boolean decorated;
  
Sugar () {

  shape = "";
  decorated = false;
}

  Sugar (String aShape, boolean aDecorated){
    shape = aShape;
    decorated = aDecorated;
  }

String getShape(){
  return shape;
 } 
boolean getDecorated(){
  return decorated;
}

void setShape(String aShape){
  shape = aShape;
}
void setDecorated(boolean aDecorated){
  decorated = aDecorated;
}
void cut(int aNumber){
  super.setNumber(aNumber);
  System.out.println(aNumber + " cookies were cut into " + shape);
}

void decorate(){
  super.isReady();
  if(baked == true){
    System.out.println("These Cookies Were Decorated");
    decorated = true;
  }
  else {
    System.out.println("Make sure to bake the cookies first!");
  }
  
}
}