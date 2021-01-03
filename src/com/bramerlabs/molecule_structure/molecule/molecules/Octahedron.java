package com.bramerlabs.molecule_structure.molecule.molecules;

import com.bramerlabs.molecule_structure.math.Vector3f;
import com.bramerlabs.molecule_structure.molecule.Atom;
import com.bramerlabs.molecule_structure.molecule.Molecule;

public class Octahedron extends Molecule {

    // the position of the center of this molecule
    private Vector3f position;

    // the length of the bonds in this molecule
    private float bondLength;

    // vectors representing the direction of the bonds
    private final static float[][] positions = new float[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 0}, {0, 0, 1}, {-1, 0, 0}, {0, -1, 0}, {0, 0, -1}};
    public final static int numAtoms = 7;

    /**
     * constructor for a specified position
     * @param position - a Vector3f representing the center point of the molecule (usually the central atom)
     * @param bondLength - the length of the bonds
     */
    public Octahedron(Vector3f position, float bondLength) {
        super();
        for (float[] a : positions) {
            this.addAtom(new Atom(new Vector3f(a).normalize(bondLength).add(position)));
        }
    }

    /**
     * constructor for position and bond length
     * @param p - position
     * @param b - bond length
     */
    public Octahedron(float[] p, float b) {
        Vector3f v = new Vector3f(
                p.length > 0 ? p[0] : 0,
                p.length > 1 ? p[1] : 0,
                p.length > 2 ? p[2] : 0
        );
        new Bent(v, b);
    }

    /**
     * constructor for position abd bond length
     * @param x - x position
     * @param y - y position
     * @param z - z position
     * @param b - bond length
     */
    public Octahedron(float x, float y, float z, float b) {
        new Bent(new Vector3f(x, y, z), b);
    }

}
