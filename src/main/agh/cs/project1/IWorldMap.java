package agh.cs.project1;

/**
 * The interface responsible for interacting with the map of the world.
 * Assumes that Vector2d and MoveDirection classes are defined.
 *
 * @author apohllo
 *
 */
interface IWorldMap {
    /**
     * Indicate if any object can move to the given position.
     *
     * @param position
     *            The position checked for the movement possibility.
     * @return True if the object can move to that position.
     */
    boolean canMoveTo(Vector2d position);

    /**
     * Place a animal on the map.
     *
     * @param animal
     *            The animal to place on the map.
     */
    void place(Animal animal);

    /**
     * Move the animal on the map according to the provided move directions. Every
     * n-th direction should be sent to the n-th animal on the map.
     *
     */
    void run();

    /**
     * Return true if given position on the map is occupied. Should not be
     * confused with canMove since there might be empty positions where the animal
     * cannot move.
     *
     * @param position
     *            Position to check.
     * @return True if the position is occupied.
     */
    boolean isOccupied(Vector2d position);

    /**
     * Return an object at a given position.
     *
     * @param position
     *            The position of the object.
     * @return Object or null if the position is not occupied.
     */
    Object objectAt(Vector2d position);

    /**
     *
     * @param animal Animal to remove.
     * @return True if deletion was finished with success.
     */
    boolean remove(Animal animal);

    /**
     *
     * @param position Base position.
     * @return Free space around the base position.
     */
    Vector2d findFreeSpaceNear(Vector2d position);
}