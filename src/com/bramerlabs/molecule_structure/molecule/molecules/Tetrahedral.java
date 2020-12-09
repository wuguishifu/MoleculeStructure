package com.bramerlabs.molecule_structure.molecule.molecules;

import com.bramerlabs.molecule_structure.math.Vector3f;
import com.bramerlabs.molecule_structure.molecule.Atom;
import com.bramerlabs.molecule_structure.molecule.Molecule;

public class Tetrahedral extends Molecule {

    // the position of the center of this molecule
    private Vector3f position;

    // the length of the bonds in this molecule
    private float bondLength;

    // vectors representing the direction of the bonds
    private final static float[][] positions = new float[][]{{1, 1, -1}, {-1, 1, 1}, {-1, -1, -1}, {1, -1, 1}};

    /**
     * constructor for a specified position
     * @param position - a Vector3f representing the center point of the molecule (usually the central atom)
     */
    public Tetrahedral(Vector3f position, float bondLength) {
        super();
        for (float[] a : positions) {
            this.addAtom(new Atom(new Vector3f(a).normalize(bondLength)));
        }
    }
}