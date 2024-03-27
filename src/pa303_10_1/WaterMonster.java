package pa303_10_1;

public class WaterMonster extends Monster {
    public WaterMonster(String u2r2) {
        super(u2r2);
    }

    @Override
    public String attack() {
        return "Attack with Water";
    }
}
