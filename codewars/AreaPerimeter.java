package codewars;

public class AreaPerimeter {
  
  public static int areaOrPerimeter (int l, int w) {
    if(l == w) return l * w;
    else return (l + w) * 2;
}
}
