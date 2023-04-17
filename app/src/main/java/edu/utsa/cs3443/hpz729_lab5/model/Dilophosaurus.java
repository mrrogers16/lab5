package edu.utsa.cs3443.hpz729_lab5.model;

public class Dilophosaurus extends Theropod{

    //Constructor
    public Dilophosaurus(String name, boolean vegetarian) {
        super(name, vegetarian);
    }

    /**
     * Theropod->Dilophosaurus
     * @return - String "Dilophosaurus" (Theropod type)
     */
    @Override
    public String getSubType() {
        return "Dilophosaurus";
    }
}