public class MeleeAttack implements Attack {
    monster attacker;

    public MeleeAttack(monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(monster target){
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return null;
    }
}
