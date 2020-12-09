package com.bramerlabs.molecule_structure.molecule;

import com.bramerlabs.molecule_structure.math.Vector3f;

import java.util.ArrayList;

public class Molecule {

    private ArrayList<Atom> atoms;

    /**
     * constructor
     * @param atoms - a list of atoms in the molecule
     */
    public Molecule(ArrayList<Atom> atoms) {
        this.atoms = atoms;
    }

    /**
     * default constructor
     */
    public Molecule() {
        this.atoms = new ArrayList<>();
    }

    /**
     * adds an atom at the origin of the cartesian space
     * @param atom - the atom to be added
     */
    public void addAtom(Atom atom) {
        this.atoms.add(atom);
    }

    /**
     * getter method
     * @return - the list of atoms in this molecule
     */
    public ArrayList<Atom> getAtoms() {
        return this.atoms;
    }
}