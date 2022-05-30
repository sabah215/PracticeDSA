package com.ooppractice.interfaces;

public class NestedInterfaceClass implements InterfaceOne.NestedInterface{
    @Override
    public void fromNestedInterface() {

    }
    protected interface NestedInterfaceB{
        int a = 51;
    }
}

class B implements NestedInterfaceClass.NestedInterfaceB{
    public static void main(String[] args) {
        System.out.println(NestedInterfaceClass.NestedInterfaceB.a);
    }
}