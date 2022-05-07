// Binary Search template method
public class BinarySearch {
  public static void main(String[] args) {
    int l = 0; // min value
    int r = 1000; // max value

    while(l<r){
      int m = l + (r-l)/2;
      if(condition(m)){
        r = m;
      }else{
        l = m + 1;
      }
    }
    // condition을 만족하는 min index 리턴
    return r;
  }


  private boolean condition(int m){
    return true;
  }


}