
public class Fraction {
    public int topN;
    public int btmN;
    
    public String toFraction(){
        return (topN + "/" + btmN);
    }
    
    public String toFloat(){
        double top = topN, btm = btmN;
        String result = Double.toString(top / btm);
        return result;
    }
    
    public void addFraction(Fraction f){
        if (btmN == f.btmN){
            topN += f.topN;
        } else {
            topN = topN * f.btmN + f.topN * btmN;
            btmN *= f.btmN;
        }
    }
    
    public boolean myEquals(Fraction x){
        return btmN == x.btmN && topN == x.topN;
    }
    
//    public void LowestTermFeac() {
//        System.out.println((btmN % topN) ? String.format("1/%s", btmN / topN): String.format("%s/%s", topN, btmN));
//    }
}
