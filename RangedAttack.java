public class RangedAttack implements Attack {
    monster attacker;

    public RangedAttack(monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(monster target) {
        String message = attacker + " uses a range attack on " + target;
        System.out.println(message);
        return null;
    }

}
