package PlayerStatus;
public class Main02 {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setName("Bank");
        p1.setTeam("Gate OR");
        
        Player p2 = new Player();
        p2.setName("Khim");
        p2.setTeam("Gate AND");
        
        if (p1.isSameTeam(p2)) {
            System.out.println(String.format("%s is a same team with %s", p1.getName(), p2.getName()));
        } else {
            System.out.println(String.format("%s is not a same team with %s", p1.getName(), p2.getName()));
        }
    }
}
