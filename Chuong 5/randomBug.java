/**
 * randomBug
 */
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

public class randomBug {

    public static void main(String[] args) {
        Math.random();
        System.out.println(Math.random());
    }

    public static void name(bug Bug) {
        randomNumber =  Math.random();
        if (randomNumber < 0.25) {
            bug.move();
        } else if (randomNumber < 0.5) {
            bug.turn();
            bug.move();
        } else if (randomNumber < 0.75) {
            bug.turn();
            bug.turn();
            bug.move();
        } else if (randomNumber < 1.0) {
            bug.turn();
            bug.turn();
            bug.turn();
            bug.move();
        }
    }
}