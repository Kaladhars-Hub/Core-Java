package OOPS.AccessModifiers.DiffPackage;

public class Eve {
    public int age = 26;   // public: accessible from any package

    protected int chapter = 1;  // protected: accessible in child classes
    // or same package, not directly from Adam

    int birth = 2000;            // default: accessible only within the same package
    private int house = 10;      // private: accessible only inside Eve class
}


//Eve - Parent Class

// Parent class contains all four access modifiers:
// public    -> accessible everywhere
// protected -> accessible in same package and child classes
// default   -> accessible only within the same package
// private   -> accessible only inside the same class