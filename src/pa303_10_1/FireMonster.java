package pa303_10_1;

public class FireMonster extends Monster {
    public FireMonster(String r2u2) {
        super(r2u2);
    }

    @Override
    public String attack() {
        return "Attack with Fire";
    }
}
