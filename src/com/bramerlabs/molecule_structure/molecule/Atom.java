package com.bramerlabs.molecule_structure.molecule;

import com.bramerlabs.molecule_structure.math.Vector3f;


public class Atom {

    // wrapper class for a spherical atom at a certain position

    // the position of the atom
    private Vector3f position;
    private static final Vector3f DEFAULT_POSITION = new Vector3f(); // default value

    // the radius of the atom
    private float radius;
    private static final float DEFAULT_RADIUS = 1; // default value

    /**
     * constructor for specified position and size
     * @param position - a vector3f position of the center of the atom
     * @param radius - the radius of the atom
     */
    public Atom(Vector3f position, float radius) {
        this.position = position;
        this.radius = radius;
    }

    /**
     * constructor for a specified position
     * @param position - a vector3f position of the center of the atom
     */
    public Atom(Vector3f position) {
        this.position = position;
        this.radius = DEFAULT_RADIUS;
    }

    /**
     * default constructor
     */
    public Atom() {
        this.position = DEFAULT_POSITION;
        this.radius = DEFAULT_RADIUS;
    }

    /**
     * getter method
     * @return - the radius of this atom
     */
    public float getRadius() {
        return this.radius;
    }

    /**
     * getter method
     * @return - the position of this atom
     */
    public Vector3f getPosition() {
        return this.position;
    }

    /**
     * sets the position
     * @param position - a vector3f position of the new center of the atom
     */
    public void setPosition(Vector3f position) {
        this.position = position;
    }

    /**
     * sets the radius
     * @param radius - the new radius of the atom
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

}
