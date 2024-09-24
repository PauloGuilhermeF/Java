package JavaCore.ZZIdefault.Classe;

import JavaCore.ZZIdefault.Interfaces.A;
import JavaCore.ZZIdefault.Interfaces.B;

public class C implements A, B {
    public static void main(String[] args) {
        new C().oi();
    }
    public void oi(){
        B.super.oi();
    }
}